package com.example.listaperfumes.API

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface interfaceGetServiceAPI {
    @GET
   suspend fun getDatos(@Url url:String):Response<responseApi>

}