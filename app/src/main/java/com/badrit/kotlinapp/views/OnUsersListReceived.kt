package com.badrit.kotlinapp.views

import com.badrit.kotlinapp.pojos.UsersResponse

/**
 * Created by ahmed-osama on 18/09/17.
 */
interface OnUsersListReceived {
    fun setUsersData(user:UsersResponse)
    fun showMessage(message:Throwable)

}