package www.iesmurgi.u6_menucontextual_basico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import www.iesmurgi.u6_menucontextual_basico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Ponemos que el menu contextual salga cuando
        //pulsamos un rato el TextView
        val tvResultado = binding.lblOpcion
        registerForContextMenu(tvResultado)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?,
                                     menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
    }

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