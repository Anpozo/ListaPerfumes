package com.example.listaperfumes

import android.location.GnssAntennaInfo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.util.zip.Inflater


class perfumesAdapter(private val lista:List<Perfume>, private val listener:adapterListener)
      :RecyclerView.Adapter<perfumesAdapter.ViewHolder>() {

    interface adapterListener{
        fun onItemClick(position:Int)
    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context)
                  .inflate(R.layout.view, parent, false)
                     return ViewHolder(view)
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val perf=lista[position]
          holder.bind(perf)
        holder.itemView.setOnClickListener { this.listener.onItemClick(position) }



    }



    override fun getItemCount(): Int =  lista.size



    class ViewHolder(val view:View):RecyclerView.ViewHolder(view){

        fun bind(dato:Perfume){
            val imag= view.findViewById<ImageView>(R.id.imageView)
            view.findViewById<TextView>(R.id.textView).setText(dato.name)
            Picasso.get().load(dato.image).into(imag)
        }
    }




}


