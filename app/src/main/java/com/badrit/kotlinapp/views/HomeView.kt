package com.badrit.kotlinapp.views

/**
 * Created by ahmed-osama on 18/09/17.
 */
interface HomeView {
    fun showLoader()
    fun hideLoader()
    fun readyToShow()
    fun showMessage(message:String)
    fun setUserList(users:ArrayList<String>)
}