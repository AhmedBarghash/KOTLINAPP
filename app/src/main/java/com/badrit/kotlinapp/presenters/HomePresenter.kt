package com.badrit.kotlinapp.presenters

import android.util.Log
import com.badrit.kotlinapp.data_manager.HomeInteractor
import com.badrit.kotlinapp.pojos.Result
import com.badrit.kotlinapp.pojos.UsersResponse
import com.badrit.kotlinapp.views.HomeView
import com.badrit.kotlinapp.views.OnUsersListReceived
import javax.inject.Inject


/**
 * Created by ahmed-osama on 17/09/17.
 */

class HomePresenter : OnUsersListReceived {
    var mView: HomeView? = null

    var mInteractour: HomeInteractor? = null

    @Inject
    constructor(homeView: HomeView,homeInteractor: HomeInteractor) {
        mView = homeView
        this.mInteractour =  homeInteractor

    }

    fun getUsersData() {
        Log.i("Hello", "get Users Data - Presenter")
        mView?.showLoader()
        mInteractour?.getUsers(this)
    }

    override fun showMessage(message: Throwable) {
        Log.i("Hello", message.toString())
        mView?.showMessage(message.toString())
        mView?.hideLoader()
    }

    override fun setUsersData(user: UsersResponse) {
        Log.i("Hello", "Data here")
        mView?.setUserList(user.results as ArrayList<Result>)
        mView?.hideLoader()
    }
}
