package com.badrit.kotlinapp.pojos

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UsersResponse (

    @SerializedName("results")
    @Expose
    var results: List<Result>? = null
    ,
    @SerializedName("info")
    @Expose
    var info: Info? = null

    )
