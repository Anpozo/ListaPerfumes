package com.example.listaperfumes

object DatosMockeados {
    fun getPerfumes(): List<Perfume> {
        val listPerfumes = ArrayList<Perfume>()
        listPerfumes.add(Perfume("Channel", "https://fimgs.net/mdimg/perfume/375x500.30796.jpg"))
        listPerfumes.add(Perfume("Paco Rabanne", "https://fimgs.net/mdimg/perfume/375x500.37698.jpg"))
        listPerfumes.add(Perfume("Armani", "https://fimgs.net/mdimg/perfume/375x500.59532.jpg"))
        listPerfumes.add(Perfume("Hugo Boss", "https://fimgs.net/mdimg/perfume/375x500.8825.jpg"))
        return listPerfumes
    }
}

data class Perfume(
    val name: String,
    val image:String
)