package com.badrit.kotlinapp.pojos

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result (

    @SerializedName("gender")
    @Expose
    var gender: String? = null ,
    @SerializedName("name")
    @Expose
    var name: Name? = null ,
    @SerializedName("location")
    @Expose
    var location: Location? = null ,
    @SerializedName("email")
    @Expose
    var email: String? = null ,
    @SerializedName("login")
    @Expose
    var login: Login? = null ,
    @SerializedName("dob")
    @Expose
    var dob: String? = null ,
    @SerializedName("registered")
    @Expose
    var registered: String? = null ,
    @SerializedName("phone")
    @Expose
    var phone: String? = null ,
    @SerializedName("cell")
    @Expose
    var cell: String? = null ,
    @SerializedName("id")
    @Expose
    var id: Id? = null ,
    @SerializedName("picture")
    @Expose
    var picture: Picture? = null ,
    @SerializedName("nat")
    @Expose
    var nat: String? = null

    )
