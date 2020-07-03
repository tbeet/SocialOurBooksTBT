package ourbooks.tbt.ourbooksprototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)




    //        val adapter = ArrayAdapter(this, 0,0)
        //countrys
    }

    fun crearCuenta(){

        //crear cola de requests
        val queue = Volley.newRequestQueue(this)

        //url adonde se va a realizar la peticion
        val url = "http://192.168.1.5:8080/createAccount"

        //opjeto json que se va a enviar al api rest
        val jsonObjectCrearCuenta = JSONObject()
        jsonObjectCrearCuenta.put("nombreUsuario","Lorena925")
        jsonObjectCrearCuenta.put("nombres","Angie Lorena")
        jsonObjectCrearCuenta.put("apellidos","Gonzales Perez")
        jsonObjectCrearCuenta.put("correo","angie@gmai.com")
        jsonObjectCrearCuenta.put("pais","Francia")
        jsonObjectCrearCuenta.put("fechaCreacion","2019-06-25")
        jsonObjectCrearCuenta.put("contrasena","123")

        //realizar la peticion post
        val jsonObjectRequest = JsonObjectRequest(url, jsonObjectCrearCuenta,
            Response.Listener { response ->
                println("Respuesta = $response")
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
                println("Error al crear cuenta")
            }
        )
        //agregar el request a la cola de requests
        queue.add(jsonObjectRequest)
    }
}