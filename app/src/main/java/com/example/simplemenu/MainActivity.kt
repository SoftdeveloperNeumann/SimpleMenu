package com.example.simplemenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.simplemenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var toolbar:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toolbar = binding.toolbar.root
        toolbar.title = "Meine App mit Menü"
        toolbar.setTitleTextColor(Color.WHITE)

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.action_settings ->{
                Toast.makeText(this, "Settings wurde getippt", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_delete ->{
                Toast.makeText(this, "Löschen wurde getippt", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_mail ->{
                Toast.makeText(this, "Mail wurde getippt", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}