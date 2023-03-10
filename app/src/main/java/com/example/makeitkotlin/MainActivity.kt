package com.example.makeitkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout= findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId){

                R.id.nav_home -> Toast.makeText(applicationContext, "Clicked Home", Toast.LENGTH_SHORT).show()
                R.id.nav_planner -> Toast.makeText(applicationContext, "Clicked Planner", Toast.LENGTH_SHORT).show()
                R.id.nav_learningproc -> Toast.makeText(applicationContext, "Clicked Learning process", Toast.LENGTH_SHORT).show()
                R.id.nav_subjects -> Toast.makeText(applicationContext, "Clicked Subjects", Toast.LENGTH_SHORT).show()
                R.id.nav_tests -> Toast.makeText(applicationContext, "Clicked Tests",Toast.LENGTH_SHORT).show()
                R.id.nav_achievements -> Toast.makeText(applicationContext, "Clicked Achievements", Toast.LENGTH_SHORT).show()
                R.id.nav_exams -> Toast.makeText(applicationContext, "Clicked Exams", Toast.LENGTH_SHORT).show()

            }

            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){

            return true
        }

        return super.onOptionsItemSelected(item)
    }

}