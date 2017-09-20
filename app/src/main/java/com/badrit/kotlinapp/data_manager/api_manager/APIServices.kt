package com.badrit.kotlinapp.data_manager.api_manager

import com.badrit.kotlinapp.pojos.UsersResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by ahmed-osama on 19/09/17.
 */
interface APIServices {

    @GET("api/")
    fun getUser(@Query("results") results: Int): Observable<UsersResponse>
}