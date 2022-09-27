package com.example.listaperfumes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.listaperfumes.API.datosResponseApi
import com.example.listaperfumes.API.interfaceGetServiceAPI
import com.example.listaperfumes.API.responseApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(), perfumesAdapter.adapterListener {
    val listaPerfumes=ArrayList<Perfume>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recycler= findViewById<RecyclerView>(R.id.recycler)
        val perfumes= DatosMockeados.getPerfumes()
        recycler.adapter=perfumesAdapter(perfumes , this)
        listaPerfumes.addAll(perfumes)

    }


    fun getRtrofit():Retrofit{
        return Retrofit.Builder().baseUrl("https://api.publicapis.org/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    }

    fun getEntries(query:String, pos:Int){
        CoroutineScope(Dispatchers.IO).launch {
            val call:Response<responseApi> = getRtrofit().create(interfaceGetServiceAPI::class.java).getDatos("$query")
            val calling:responseApi?= call.body()
         runOnUiThread {
             if(call.isSuccessful && calling!=null){

                 findViewById<TextView>(R.id.textView).setText("${calling.articles[pos]} ")

                 //Add response to the recyclerview
             }else{
                 showError()
             }
         }

    }

}

    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error",Toast.LENGTH_SHORT ).show()
    }

    override fun onItemClick(position: Int) {
        //val perfName=listaPerfumes[position].name
       // Toast.makeText(this, perfName, Toast.LENGTH_SHORT).show()
        getEntries("entries", position)
    }
}