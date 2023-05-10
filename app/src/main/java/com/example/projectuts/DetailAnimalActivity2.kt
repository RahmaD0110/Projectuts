package com.example.projectuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailAnimalActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_animal2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val animal = intent.getParcelableExtra<Animal>(MainActivity.INTENT_PARCELABLE)

        val imgAnimal = findViewById<ImageView>(R.id.img_item_photo)
        val nameAnimal = findViewById<TextView>(R.id.tv_item_name)
        val descAnimal = findViewById<TextView>(R.id.tv_item_description)

        imgAnimal.setImageResource(animal?.imgAnimal!!)
        nameAnimal.text = animal.nameAnimal
        descAnimal.text = animal.descAnimal

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}