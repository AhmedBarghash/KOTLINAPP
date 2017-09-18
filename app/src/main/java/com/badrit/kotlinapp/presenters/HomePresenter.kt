package com.badrit.kotlinapp.presenters

import com.badrit.kotlinapp.data_manager.HomeInteractour
import com.badrit.kotlinapp.views.HomeView
import com.badrit.kotlinapp.views.OnUsersListReceived
import dagger.Inject

/**
 * Created by ahmed-osama on 17/09/17.
 */

class HomePresenter :OnUsersListReceived{


    private var mInteractour:HomeInteractour? = null
    private var mView:HomeView?=null

    @Inject constructor(homeView: HomeView, homeInteractour: HomeInteractour)
    {
        mView =  homeView
        mInteractour =  homeInteractour
    }
    fun getUsersData(){
        mView?.showLoader()
        mInteractour?.getUsers(this)
    }

    override fun setUsersData(users: ArrayList<String>) {
        mView?.setUserList(users)
        mView?.hideLoader()
    }

    override fun showMessage(message: String) {
        mView?.showMessage(message)
        mView?.hideLoader()
    }
}
