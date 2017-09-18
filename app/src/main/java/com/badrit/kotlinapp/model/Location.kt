package com.badrit.kotlinapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Location {

    //    @SerializedName("postcode")
    //    @Expose
    //    private int postcode;

    @SerializedName("street")
    @Expose
    var street: String? = null
    @SerializedName("city")
    @Expose
    var city: String? = null
    @SerializedName("state")
    @Expose
    var state: String? = null
    //
    //    public int getPostcode() {
    //        return postcode;
    //    }
    //
    //    public void setPostcode(int postcode) {
    //        this.postcode = postcode;
    //    }

}
