package com.badrit.kotlinapp.data_manager

import android.util.Log
import com.badrit.kotlinapp.Constants
import com.badrit.kotlinapp.data_manager.api_manager.APIServices
import com.badrit.kotlinapp.views.OnUsersListReceived
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by ahmed-osama on 17/09/17.
 */
class HomeInteractor {

    fun getUsers(callBack:OnUsersListReceived){
        Log.i("Hello","get Users Data - Interactour")
        val retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(APIServices::class.java)

        retrofit.getUser(Constants.NUMBER_OF_USERS.toString())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(callBack::setUsersData, callBack::showMessage)
    }
}