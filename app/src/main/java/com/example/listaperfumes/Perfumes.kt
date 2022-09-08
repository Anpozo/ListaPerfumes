package com.example.listaperfumes

object DatosMockeados {
    fun getPerfumes(): List<Perfume> {
        val listPerfumes = ArrayList<Perfume>()
        listPerfumes.add(Perfume("Channel"))
        listPerfumes.add(Perfume("Paco Rabanne"))
        listPerfumes.add(Perfume("Armani"))
        listPerfumes.add(Perfume("Hugo Boss"))
        return listPerfumes
    }
}

data class Perfume(
    val name: String
)