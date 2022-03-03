package com.example.xirpl5_hafizh_covif.api

import com.example.xirpl5_hafizh_covif.model.IndonesiaResponse
import com.example.xirpl5_hafizh_covif.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}
