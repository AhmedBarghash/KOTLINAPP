package com.badrit.kotlinapp.views

/**
 * Created by ahmed-osama on 18/09/17.
 */
interface OnUsersListReceived {
    fun setUsersData(users:ArrayList<String>)
    fun showMessage(message:String)

}