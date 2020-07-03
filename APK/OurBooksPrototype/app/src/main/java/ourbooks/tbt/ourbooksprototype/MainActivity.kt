package ourbooks.tbt.ourbooksprototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linkCreatAccount.setOnClickListener{
            val actCreatAccount = Intent(this, CreateAccount::class.java)
            startActivity(actCreatAccount)
        }
    }


}