package com.example.xirpl5_hafizh_covif.model

import com.google.gson.annotations.SerializedName

data class Province(
    @SerializedName("Kode Provi")
    val code: Int,
    @SerializedName("Provinsi")
    val province: String,
    @SerializedName("Kasus Posi")
    val positive: Int,
    @SerializedName("Kasus Semb")
    val recover: Int,
    @SerializedName("Kasus Meni")
    val death: Int
)