package com.example.projectuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class  MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animalList = listOf<Animal>(
            Animal(
                R.drawable.harimau,
                nameAnimal = "Harimau",
                descAnimal = " Harimau (Panthera tigris) adalah spesies kucing terbesar yang masih hidup dari genus Panthera. Harimau memiliki ciri loreng yang khas pada bulunya, berupa garis-garis vertikal gelap pada bulu oranye, dengan bulu bagian bawah berwarna putih."
            ),
            Animal(
                R.drawable.beruang,
                nameAnimal = "Beruang kutub",
                descAnimal = "Beruang kutub adalah predator berkaki empat terbesar"
            ),
            Animal(
                R.drawable.buaya,
                nameAnimal = "Buaya",
                descAnimal = "Buaya adalah reptil bertubuh besar yang hidup di air"
            ),
            Animal(
                R.drawable.hiu,
                nameAnimal = "Hiu",
                descAnimal = "Ikan Hiu atau Cucut (superordo Selachimorpha) adalah sekelompok ikan dengan kerangka tulang rawan yang lengkap dan tubuh yang ramping"
            ),
            Animal(
                R.drawable.komodo,
                nameAnimal = "Komodo",
                descAnimal = "Komodo atau lengkapnya biawak komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia"
            ),
            Animal(
                R.drawable.macan,
                nameAnimal = "Macan",
                descAnimal = "Macan tutul berukuran besar, dengan panjang tubuh antara satu sampai dua meter. Spesies ini pada umumnya memiliki bulu berwarna kuning kecokelatan dengan bintik-bintik berwarna hitam"
            ),
            Animal(
                R.drawable.serigala,
                nameAnimal = "Serigala",
                descAnimal = "Serigala atau Serigala putih Abu-abu (nama ilmiah: Canis lupus) adalah binatang mamalia karnivora"
            ),
            Animal(
                R.drawable.singa,
                nameAnimal = "Singa",
                descAnimal = "Singa (Sanskerta: Siṃha, atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau keluarga kucing"
            ),
            Animal(
                R.drawable.ularkobra,
                nameAnimal = "Ular Kobra",
                descAnimal = "Ular sendok atau Ular kobra sejati adalah sebutan khusus untuk semua jenis ular berbisa (Elapidae) yang memiliki kemampuan memipihkan lehernya hingga membentuk seperti sendok atau tudung"
            ),
            Animal(
                R.drawable.ularpiton,
                nameAnimal = "Ular piton",
                descAnimal = "Sanca atau Sawa atau pinjaman bahasa Inggris Piton adalah sebutan umum untuk semua jenis ular pembelit yang diklasifikasikan sebagai familia Pythonidae"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_animal)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AnimalAdapter(this, animalList){

            val intent = Intent (this,DetailAnimalActivity2::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}