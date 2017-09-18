package com.badrit.kotlinapp.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.badrit.kotlinapp.R
import com.badrit.kotlinapp.adapter.MyAdapter
import com.badrit.kotlinapp.presenters.HomePresenter
import com.badrit.kotlinapp.views.HomeView
import dagger.Inject
import com.badrit.kotlinapp.dependencies.HomeModule




class MainActivity : AppCompatActivity() , HomeView {

    @Inject
    private var mPresneter :HomePresenter? = null
    private var adapter: MyAdapter? = null
    private var recyclerView : RecyclerView? =  null
    private var usersList:ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //  initializeArrayValues()
        TODO("We will take about it tomorrow ")
       // adapter?=MyAdapter(usersList,applicationContext)
        var add : MyAdapter = MyAdapter(usersList, applicationContext)
        injectComponent()
        readyToShow()
        initializeRecycleView(add)
    }

    private fun initializeArrayValues(){
        usersList?.add("Douby")
        usersList?.add("Bakr")
        usersList?.add("Osama")
        usersList?.add("Wezaa")
        usersList?.add("Sherif")
        usersList?.add("Karim")
    }

    fun injectComponent() {
        DaggerHomeComponent
                .builder()
                .homeModule(HomeModule(this))
                .build()
                .inJect(this)
    }

    private fun initializeRecycleView(myAdapter: MyAdapter) {
        recyclerView =  findViewById(R.id.recyclerView_RV) as RecyclerView
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = myAdapter
        recyclerView?.setHasFixedSize(true)
    }

    override fun showLoader() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.i("Hello","Show Loader")
    }

    override fun hideLoader() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.i("Hello","Hide Loader")
    }

    override fun readyToShow() {
        Log.i("Hello","Ready to show")
        mPresneter?.getUsersData()
    }

    override fun showMessage(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.i("Hello","Show Message")
    }

    override fun setUserList(users: ArrayList<String>) {
        usersList?.clear()
        usersList?.addAll(users)
    }
}
