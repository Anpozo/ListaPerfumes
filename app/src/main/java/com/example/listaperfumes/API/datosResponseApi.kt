package com.example.listaperfumes.API

import com.google.gson.annotations.SerializedName


data class datosResponseApi(@SerializedName("API") var API:String,
                            @SerializedName("Description") var Description:String,
                            @SerializedName("Auth") var Auth:String,
                            @SerializedName("HTTPS") var HTTPS:Boolean,
                            @SerializedName("Cors") var Cors:String,
                            @SerializedName("Link") var Link:String,
                            @SerializedName("Category") var Category:String,)
data class responseApi(
    val count:Int,
    @SerializedName("entries") val articles:List<datosResponseApi>
)
