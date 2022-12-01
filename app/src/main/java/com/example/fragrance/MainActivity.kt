package com.example.fragrance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstfragment = MenFragment();
        val secoundfragment = WomenFragment();
        val frag1: Button = findViewById(R.id.button1)
        val frag2: Button = findViewById(R.id.button2)



            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragments,MenFragment())
                commit()
            }
        frag1.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragments,MenFragment())
                commit()
            }
        }
        frag2.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragments,WomenFragment())
                commit()
            }
        }
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.fragrance, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
        }
        return true;
    }

}