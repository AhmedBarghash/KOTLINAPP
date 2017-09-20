package com.badrit.kotlinapp.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.badrit.kotlinapp.R
import com.badrit.kotlinapp.adapter.MyAdapter
import com.badrit.kotlinapp.dependencies.DaggerHomeComponent
import com.badrit.kotlinapp.dependencies.HomeModule
import com.badrit.kotlinapp.pojos.Result
import com.badrit.kotlinapp.presenters.HomePresenter
import com.badrit.kotlinapp.views.HomeView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import javax.inject.Inject


class MainActivity : AppCompatActivity(), HomeView {

    @Inject
    lateinit var mPresneter: HomePresenter
    var adapter: MyAdapter? = null
    var usersList: ArrayList<Result> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerHomeComponent.builder()
                .homeModule(HomeModule(this))
                .build()
                .inject(this)
        initializeRecycleView()
        readyToShow()
    }

    private fun initializeRecycleView() {
        adapter = MyAdapter(usersList, applicationContext)
        recyclerView_RV.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView_RV.adapter = adapter
        recyclerView_RV.setHasFixedSize(true)
    }

    override fun showLoader() {
        Log.i("Hello", "Show Loader")
    }

    override fun hideLoader() {
        Log.i("Hello", "Hide Loader")
    }

    override fun readyToShow() {
        Log.i("Hello", "Ready to show")
//        mPresneter = HomePresenter(this)
        mPresneter.getUsersData()
    }

    override fun showMessage(message: String) {
        Log.i("Hello", "Show Message")
    }

    override fun setUserList(users: ArrayList<Result>) {
        usersList?.clear()
        usersList?.addAll(users)
        adapter?.notifyDataSetChanged()
    }
}
