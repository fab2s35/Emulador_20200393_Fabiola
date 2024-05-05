package fabiola.osorto.emulador_20200393_fabiola

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import fabiola.osorto.emulador_20200393_fabiola.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_perfil, R.id.navigation_informacion))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //1- mando a llamar al boton para perfil
        val BotonP = findViewById<Button>(R.id.btn_perfil)

        BotonP.setOnClickListener {
            Toast.makeText(this, "Fabiola Aracely Retana Osorto", Toast.LENGTH_LONG).show()
        }

        //2- mando a llamar al boton para contactanos
        val BotonC = findViewById<Button>(R.id.btnContactanos)

        BotonC.setOnClickListener {
            Toast.makeText(this, "2020393@ricaldone.edu.sv", Toast.LENGTH_LONG).show()
        }



    }

}