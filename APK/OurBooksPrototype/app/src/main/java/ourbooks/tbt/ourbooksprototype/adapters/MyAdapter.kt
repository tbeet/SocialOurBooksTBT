package ourbooks.tbt.ourbooksprototype.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import ourbooks.tbt.ourbooksprototype.R
import ourbooks.tbt.ourbooksprototype.models.Post


//al exteneder a calse de ReciclerView nos pide un ViewHolder, y se le pasa la otra clase interna que se creo
class MyAdapter (private val mDataSet: ArrayList<Post>)
    : RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    //crear una clase dentro de otra clase, esta clase se va a pasar como atributo a la clase principal en la extension de ReciclerView
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        // en este metodo se reciben los datos que va a tener la vista
        fun bindItems(data:Post){

            //crear variables del tipo correspondiente
            val tituloPost:TextView = itemView.findViewById(R.id.tituloPost)
            val nombreAutor:TextView = itemView.findViewById(R.id.nombreAutor)
            val contenido:EditText = itemView.findViewById(R.id.contenido)
            val btnGuardar:Button = itemView.findViewById(R.id.btnGuardar)
            val btnCalificar:Button = itemView.findViewById(R.id.btnCalificar)

            tituloPost.text = data.titulo
            nombreAutor.text  = data.nombreAutor
            contenido.setText(data.contenido)
            contenido.setEnabled(false)
            btnGuardar.setOnClickListener(){

            }

            itemView.setOnClickListener{
                //val toast = Toast.makeText(this,"msj",Toast.LENGTH_LONG).show()
                print("boton guardar")
            }

            //aqui se hace la l,ogica de los botones, comun y corriente

        }

    }



    //llamar la vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent?.context).inflate(R.layout.item_text_view, parent,false) //el false significa que la vista que se esta creando no hace parte de la vista principal

        return ViewHolder(vista)
    }

    //devolvemos el tamaño de la lista
    override fun getItemCount(): Int {
        return mDataSet.size

    }

    //retornamos el viewholder, llamando a la funcion que se creo "bindItems"
    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        //agregamos el objeto que se recibe e indicamos la posición del array
        holder.bindItems(mDataSet[position])
    }


}

