package ourbooks.tbt.ourbooksprototype

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ourbooks.tbt.ourbooksprototype.adapters.AdpaterPost
import ourbooks.tbt.ourbooksprototype.models.Post

class lecturas : AppCompatActivity() {


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecturas)
        val reciclerView:RecyclerView = findViewById(R.id.recyclerViewLecturas)
        reciclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val listPosts = ArrayList<Post>()

        listPosts.add(Post("Cuento de Hallowen",
            "Estaban todas las fiestas del año reunidas en secreto: querían darle una gran sorpresa a su buena amiga la fiesta de Halloween. La idea se le había ocurrido a la hermana melliza de Halloween, la fiesta de Todos los Santos, y todas las demás fiestas excepto Año Nuevo, el hermanito de Navidad, que aún era pequeño, habían ayudado a preparar la sorpresa durante semanas. Por supuesto, habían tenido muy en cuenta los gustos de su amiga, y habían decorado el lugar con murciélagos, calabazas, telas de araña y esqueletos. Sin olvidar la gran montaña de dulces, claro.\n" +
                    "\n" +
                    "Ya era de noche. Hacía un poco de frío y había mucha niebla, y todos esperaban que Halloween llegara en cualquier momento. De pronto, se abrió la puerta de golpe y Halloween entró corriendo, aterrorizada. Nadie pudo reaccionar, no parecía ser un bueno momento para celebrar nada.\n" +
                    "\n" +
                    "- ¡Me quiere comeeeer! ¡Hay algo ahí fuera que ha intentado comermeeeee!\n" +
                    "\n" +
                    "Halloween, la más valiente de todas las fiestas, amiga de los monstruos más horribles, estaba muerta de miedo.\n" +
                    "\n" +
                    "- ¿Podéis creerlo? Iba gritando: ¡Te voy a pillar, ojo, ojo, que te cojo! No tenía ningún miedo de mí ¡De mí! que soy la reina del miedo y los sustos. Qué ser tan horrible, que no sabe ni lo que son el miedo y el respeto- dijo enfadada y asustada.\n" +
                    "\n" +
                    "Sus amigas, miedosas todas ellas, la rodearon pensando qué podían hacer. Siempre que tenían miedo acudían a Halloween, pero ahora, ¿quién podría ayudarlas?\n" +
                    "\n" +
                    "Tan agobiadas estaban que se olvidaron de vigilar al travieso Año Nuevo, y este aprovechó el revuelo para salir a la calle. Fue entonces cuando Halloween lo vio a través de la ventana.\n" +
                    "\n" +
                    "- ¡Oh, no! Ese ser horrible ha atrapado a Año Nuevo y lo está aplastando con sus brazos ¿qué vamos a hacer ahora?\n" +
                    "\n" +
                    "En ese momento había algo más de luz y se le podía ver mejor: tenía una gran barriga, propia de alguien capaz de comerse a Halloween de un bocado, y el traje entero era del color de la sangre, normal para quien pasaba el día comiendo gente. Además, ocultaba su cara tras un montón de pelo, y llevaba un saco gigantesco, donde posiblemente escondiera a toda la gente que aún no había podido comerse…\n" +
                    "\n" +
                    "- Tío, ¡qué alegría! - gritó entonces Navidad, al tiempo que corría a la calle para… ¡echarse en brazos del terrible ser!\n" +
                    "\n" +
                    "Desde dentro, Halloween escuchó grandes risotadas y, poco después, Navidad y Año Nuevo entraban en la casa acompañando al terrible ser:\n" +
                    "\n" +
                    "- Halloween, te presento a nuestro tío Santa Claus. Está muy gordo porque come pastas en todas las casas del mundo, pero nunca se ha comido a nadie. Viste de rojo para que se le reconozca, su barba es enorme porque ya es muy viejo, y su saco… su saco es lo mejor de todo porque... ¡está lleno de regalos para tu fiesta!\n" +
                    "\n" +
                    "Halloween aún no lo veía muy claro\n" +
                    "\n" +
                    "- ¿Y entonces por qué gritaba “te voy a pillar, ojo, ojo, que te cojo”?\n" +
                    "\n" +
                    "- Ja, ja, ja -rió el señor gordo de rojo- lo que yo digo es “Feliz Navidad, jou, jou, jou”. ¿Te has limpiado bien los oídos, o el gorro no te dejaba escuchar? ¡ja, ja, ja, ja!\n" +
                    "\n" +
                    "Halloween respiró aliviada y todos rieron. Luego Navidad se le acercó cariñosamente y le dijo al oído:\n" +
                    "\n" +
                    "- ¿Ves? al final es lo que tú siempre nos dices; que las cosas que más miedo dan, solo están en nuestra imaginación. FInnnnnnnnnnn",
            "Pepo Perez",158))


        listPosts.add(Post("Cuento de Hallowen",
            "Estaban todas las fiestas del año reunidas en secreto: querían darle una gran sorpresa a su buena amiga la fiesta de Halloween. La idea se le había ocurrido a la hermana melliza de Halloween, la fiesta de Todos los Santos, y todas las demás fiestas excepto Año Nuevo, el hermanito de Navidad, que aún era pequeño, habían ayudado a preparar la sorpresa durante semanas. Por supuesto, habían tenido muy en cuenta los gustos de su amiga, y habían decorado el lugar con murciélagos, calabazas, telas de araña y esqueletos. Sin olvidar la gran montaña de dulces, claro.\n" +
                    "\n" +
                    "Ya era de noche. Hacía un poco de frío y había mucha niebla, y todos esperaban que Halloween llegara en cualquier momento. De pronto, se abrió la puerta de golpe y Halloween entró corriendo, aterrorizada. Nadie pudo reaccionar, no parecía ser un bueno momento para celebrar nada.\n" +
                    "\n" +
                    "- ¡Me quiere comeeeer! ¡Hay algo ahí fuera que ha intentado comermeeeee!\n" +
                    "\n" +
                    "Halloween, la más valiente de todas las fiestas, amiga de los monstruos más horribles, estaba muerta de miedo.\n" +
                    "\n" +
                    "- ¿Podéis creerlo? Iba gritando: ¡Te voy a pillar, ojo, ojo, que te cojo! No tenía ningún miedo de mí ¡De mí! que soy la reina del miedo y los sustos. Qué ser tan horrible, que no sabe ni lo que son el miedo y el respeto- dijo enfadada y asustada.\n" +
                    "\n" +
                    "Sus amigas, miedosas todas ellas, la rodearon pensando qué podían hacer. Siempre que tenían miedo acudían a Halloween, pero ahora, ¿quién podría ayudarlas?\n" +
                    "\n" +
                    "Tan agobiadas estaban que se olvidaron de vigilar al travieso Año Nuevo, y este aprovechó el revuelo para salir a la calle. Fue entonces cuando Halloween lo vio a través de la ventana.\n" +
                    "\n" +
                    "- ¡Oh, no! Ese ser horrible ha atrapado a Año Nuevo y lo está aplastando con sus brazos ¿qué vamos a hacer ahora?\n" +
                    "\n" +
                    "En ese momento había algo más de luz y se le podía ver mejor: tenía una gran barriga, propia de alguien capaz de comerse a Halloween de un bocado, y el traje entero era del color de la sangre, normal para quien pasaba el día comiendo gente. Además, ocultaba su cara tras un montón de pelo, y llevaba un saco gigantesco, donde posiblemente escondiera a toda la gente que aún no había podido comerse…\n" +
                    "\n" +
                    "- Tío, ¡qué alegría! - gritó entonces Navidad, al tiempo que corría a la calle para… ¡echarse en brazos del terrible ser!\n" +
                    "\n" +
                    "Desde dentro, Halloween escuchó grandes risotadas y, poco después, Navidad y Año Nuevo entraban en la casa acompañando al terrible ser:\n" +
                    "\n" +
                    "- Halloween, te presento a nuestro tío Santa Claus. Está muy gordo porque come pastas en todas las casas del mundo, pero nunca se ha comido a nadie. Viste de rojo para que se le reconozca, su barba es enorme porque ya es muy viejo, y su saco… su saco es lo mejor de todo porque... ¡está lleno de regalos para tu fiesta!\n" +
                    "\n" +
                    "Halloween aún no lo veía muy claro\n" +
                    "\n" +
                    "- ¿Y entonces por qué gritaba “te voy a pillar, ojo, ojo, que te cojo”?\n" +
                    "\n" +
                    "- Ja, ja, ja -rió el señor gordo de rojo- lo que yo digo es “Feliz Navidad, jou, jou, jou”. ¿Te has limpiado bien los oídos, o el gorro no te dejaba escuchar? ¡ja, ja, ja, ja!\n" +
                    "\n" +
                    "Halloween respiró aliviada y todos rieron. Luego Navidad se le acercó cariñosamente y le dijo al oído:\n" +
                    "\n" +
                    "- ¿Ves? al final es lo que tú siempre nos dices; que las cosas que más miedo dan, solo están en nuestra imaginación. FInnnnnnnnnnn",
            "Pepo Perez",1554))


        //enviar la informacion al adaptador
        val adapter = AdpaterPost(listPosts)

        //agregar adaptador al reciclerView
        reciclerView.adapter = adapter
    }
}