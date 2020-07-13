package ourbooks.tbt.ourbooksprototype.adapters

import android.os.Build
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import ourbooks.tbt.ourbooksprototype.R
import ourbooks.tbt.ourbooksprototype.models.Post


//al exteneder a calse de ReciclerView nos pide un ViewHolder, y se le pasa la otra clase interna que se creo
class AdpaterPost (private val mDataSet: ArrayList<Post>)
    : RecyclerView.Adapter<AdpaterPost.ViewHolder>(){


    //crear una clase dentro de otra clase, esta clase se va a pasar como atributo a la clase principal en la extension de ReciclerView
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        // en este metodo se reciben los datos que va a tener la vista
        fun bindItems(data:Post){


            //crear variables del tipo correspondiente
            var expandableView: ConstraintLayout = itemView.findViewById(R.id.constraintLayout2)
            var scrollView: ScrollView = itemView.findViewById(R.id.scrollContenido)
            val tituloPost:TextView = itemView.findViewById(R.id.txtTituloPost)
            val nombreAutor:TextView = itemView.findViewById(R.id.txtNombreUsuario)
            val contenido:TextView = itemView.findViewById(R.id.txtContenido)
            val btnMostrarContenido: Button = itemView.findViewById(R.id.btnMostrarContenido)

            tituloPost.text = data.titulo
            nombreAutor.text  = data.nombreAutor
            contenido.setText(data.contenido)
            //contenido.setEnabled(false)


            /*
            btnMostrarContenido.setOnClickListener(View.OnClickListener {
                @RequiresApi(Build.VERSION_CODES.KITKAT)
                fun onClick(v: View){
                    if(expandableView.visibility == View.GONE){
                        TransitionManager.beginDelayedTransition(scrollView, AutoTransition())
                        expandableView.isVisible() = true
                    }
                }
            })*/



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
    override fun onBindViewHolder(holder: AdpaterPost.ViewHolder, position: Int) {
        //agregamos el objeto que se recibe e indicamos la posición del array
        holder.bindItems(mDataSet[position])
    }


}

