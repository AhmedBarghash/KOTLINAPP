package com.badrit.kotlinapp.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.badrit.kotlinapp.R
import com.badrit.kotlinapp.adapter.MyAdapter
import com.badrit.kotlinapp.pojos.Result
import com.badrit.kotlinapp.presenters.HomePresenter
import com.badrit.kotlinapp.views.HomeView
import java.util.*


class MainActivity : AppCompatActivity() , HomeView {

    private var mPresneter :HomePresenter? = null
    private var adapter: MyAdapter? = null
    private var recyclerView : RecyclerView? =  null
    private var usersList: ArrayList<Result> = ArrayList()
    private var linearLayoutManager: RecyclerView.LayoutManager? =  null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = MyAdapter(usersList,applicationContext)
        linearLayoutManager = LinearLayoutManager(this)
        readyToShow()
        initializeRecycleView()
    }

    private fun initializeRecycleView() {
        recyclerView =  findViewById<RecyclerView>(R.id.recyclerView_RV) as RecyclerView
        recyclerView?.layoutManager =  LinearLayoutManager(applicationContext)
        recyclerView?.adapter = adapter
        recyclerView?.setHasFixedSize(true)
    }

    override fun showLoader() {
        Log.i("Hello","Show Loader")
    }

    override fun hideLoader() {
        Log.i("Hello","Hide Loader")
    }

    override fun readyToShow() {
        Log.i("Hello","Ready to show")
        mPresneter = HomePresenter(this)
        mPresneter?.getUsersData()
    }

    override fun showMessage(message: String) {
        Log.i("Hello","Show Message")
    }

    override fun setUserList(users: ArrayList<Result>) {
//        for (i in 0..users.size - 1) {
//            Log.i("Hello", users[i].email)
//        }
        usersList?.clear()
        usersList?.addAll(users)
        adapter?.notifyDataSetChanged()
    }
}
