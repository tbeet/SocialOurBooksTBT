package ourbooks.tbt.ourbooksprototype

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_create_account.*
import org.json.JSONObject
import java.text.FieldPosition
import java.time.LocalDateTime

class CreateAccount : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        //devolver a la pantalla principal
        linkInicioApp.setOnClickListener(){
            val actMain = Intent(this, MainActivity::class.java)
            startActivity(actMain)
        }

        var pais: String = ""
        spinnerCountrys.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (parent != null) {
                    pais = parent.getItemAtPosition(position).toString()
                }
            }
        }


        btnCreatAccount.setOnClickListener(){
            val  nombreUsuarioPerfil = usrNamePerf.text.toString()
            val  nombres = usrNames.text.toString()
            val  apellidos = usrLastNames.text.toString()
            val  correo = mail.text.toString()
            val  contrasena = pswrdd.text.toString()
            val fechaCreacion = LocalDateTime.now().toString()

            crearCuenta(nombreUsuarioPerfil,nombres,apellidos,correo,pais,fechaCreacion, contrasena)
        }
    }


    fun crearCuenta(nombreUsuario:String,nombres:String,apellidos:String,correo:String,pais:String,fechaCreacion:String,claveCuenta:String){

        //crear cola de requests
        val queue = Volley.newRequestQueue(this)

        //url adonde se va a realizar la peticion
        val url = "http://192.168.1.5:8080/createAccount"

        //opjeto json que se va a enviar al api rest
        val jsonObjectCrearCuenta = JSONObject()
        jsonObjectCrearCuenta.put("nombreUsuario",nombreUsuario)
        jsonObjectCrearCuenta.put("nombres",nombres)
        jsonObjectCrearCuenta.put("apellidos",apellidos)
        jsonObjectCrearCuenta.put("correo",correo)
        jsonObjectCrearCuenta.put("pais",pais)
        jsonObjectCrearCuenta.put("fechaCreacion",fechaCreacion)
        jsonObjectCrearCuenta.put("contrasena",claveCuenta)

        //realizar la peticion post
        val jsonObjectRequest = JsonObjectRequest(url, jsonObjectCrearCuenta,
            Response.Listener { response ->
                //println("Respuesta = $response")
                msgToast("Cuenta Creada Exitosamentr")

            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                msgToast("Error al crear cuenta")
            }
        )
        //agregar el request a la cola de requests
        queue.add(jsonObjectRequest)
    }


    fun msgToast(msj: String){
        val toast = Toast.makeText(this,msj,Toast.LENGTH_LONG).show()
    }
}