package com.badrit.kotlinapp.ui.view_holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.badrit.kotlinapp.R

/**
 * Created by ahmed-osama on 17/09/17.
 */
class ViewHolder : RecyclerView.ViewHolder{
    var userName:TextView? = null
    var userEmai :TextView? = null
    var userImage :ImageView? = null
    constructor(view:View ):super(view)
    {
         userName = view.findViewById<TextView> (R.id.userName)
         userEmai  = view.findViewById<TextView>(R.id.userEmail)
         userImage = view.findViewById<ImageView>(R.id.userImage)
    }
}