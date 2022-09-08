package com.example.listaperfumes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class perfumesAdapter(private val lista:List<Perfume>):RecyclerView.Adapter<perfumesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context)
                  .inflate(R.layout.view, parent, false)
                     return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val perf=lista[position]
          holder.bind(perf)
    }

    override fun getItemCount(): Int =  lista.size

    class ViewHolder(val view:View):RecyclerView.ViewHolder(view){
        fun bind(dato:Perfume){
            view.findViewById<TextView>(R.id.textView).setText(dato.name)
        }
    }


}