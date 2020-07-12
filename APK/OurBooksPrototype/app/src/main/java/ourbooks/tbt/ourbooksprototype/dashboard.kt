package ourbooks.tbt.ourbooksprototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnLeer.setOnClickListener(){
            val actLeer = Intent(this, lecturas::class.java)
            startActivity(actLeer)
        }
    }
}