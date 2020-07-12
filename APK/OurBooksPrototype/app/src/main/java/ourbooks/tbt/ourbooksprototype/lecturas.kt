package ourbooks.tbt.ourbooksprototype

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_lecturas.*
import ourbooks.tbt.ourbooksprototype.adapters.MyAdapter
import ourbooks.tbt.ourbooksprototype.models.Post

class lecturas : AppCompatActivity() {


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecturas)
        val reciclerView:RecyclerView = findViewById(R.id.recyclerViewLecturas)
        reciclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val listPosts = ArrayList<Post>()
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa enEs una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))
        listPosts.add(Post("Silencio en la noche","Es una noche silenciosa en .....","Pepo Perez",158))
        listPosts.add(Post("Silencio en el día","Es un día  silencioso en .....","Pepo Perez",847))


        //enviar la informacion al adaptador
        val adapter = MyAdapter(listPosts)

        //agregar adaptador al reciclerView
        reciclerView.adapter = adapter
    }
}