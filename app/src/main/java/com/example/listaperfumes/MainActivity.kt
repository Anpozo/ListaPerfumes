package com.example.listaperfumes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recycler= findViewById<RecyclerView>(R.id.recycler)
        val perfumes= DatosMockeados.getPerfumes()
        recycler.adapter=perfumesAdapter(perfumes)



    }
}