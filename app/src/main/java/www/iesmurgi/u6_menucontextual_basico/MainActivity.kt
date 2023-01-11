package www.iesmurgi.u6_menucontextual_basico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*

import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import www.iesmurgi.u6_menucontextual_basico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var lista:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Asignamos variables
        val tvResultado = binding.lblOpcion
        lista = binding.lista

        //Ponemos que el menu contextual salga cuando
        //pulsamos un rato el TextView
        registerForContextMenu(tvResultado)
        registerForContextMenu(lista)

        //Array
        val misAndroids = arrayOf("Item 1", "Item 2", "Item 3")
        //ArrayAdapter para asignar items a la varible lista
        ArrayAdapter(this, android.R.layout.simple_list_item_1, misAndroids).also {
                adaptador -> lista.setAdapter(adaptador)}

    }
//Options menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    //Context menu
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?,
                                     menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
    }
    //Context item
    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.MnOp1 -> {
                binding.lblOpcion.setText("Opcion A")
                true
            }
            R.id.MnOp2 -> {
                binding.lblOpcion.setText("Opcion B")
                true
            }
            R.id.MnOp3 -> {
                binding.lblOpcion.setText("Opcion C")
                true
            }

            R.id.SbOp1 -> {
                binding.lblOpcion.setText("SubOpcion 1")
                true
            }

            R.id.SbOp2 -> {
                binding.lblOpcion.setText("SubOpcion 2")
                true
            }

            R.id.Op -> {
                binding.lblOpcion.setText("Opcion Android")
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
    //Options item
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.MnOp1 -> {
                binding.lblOpcion.setText("Opcion A")
                true
            }
            R.id.MnOp2 -> {
                binding.lblOpcion.setText("Opcion B")
                true
            }
            R.id.MnOp3 -> {
                binding.lblOpcion.setText("Opcion C")
                true
            }

            R.id.SbOp1 -> {
                binding.lblOpcion.setText("SubOpcion 1")
                true
            }

            R.id.SbOp2 -> {
                binding.lblOpcion.setText("SubOpcion 2")
                true
            }

            R.id.Op -> {
                binding.lblOpcion.setText("Opcion Android")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}