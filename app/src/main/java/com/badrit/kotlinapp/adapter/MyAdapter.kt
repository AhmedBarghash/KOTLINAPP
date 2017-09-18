package com.badrit.kotlinapp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.badrit.kotlinapp.R
import com.badrit.kotlinapp.ui.view_holder.ViewHolder


/**
 * Created by ahmed-osama on 17/09/17.
 */
class MyAdapter (var mydata: ArrayList<String>?, val mContext:Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.rowitem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.userName?.text = mydata?.get(position)
    }

    override fun getItemCount(): Int {
        return mydata?.size!!
    }
}