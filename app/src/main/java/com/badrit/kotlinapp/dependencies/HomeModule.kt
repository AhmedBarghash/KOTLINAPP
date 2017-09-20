package com.badrit.kotlinapp.dependencies

import com.badrit.kotlinapp.data_manager.HomeInteractor
import com.badrit.kotlinapp.presenters.HomePresenter
import com.badrit.kotlinapp.views.HomeView
import dagger.Module
import dagger.Provides

/**
 * Created by ahmed-osama on 17/09/17.
 */

@Module
class HomeModule(var homeView: HomeView) {

    @Provides
    fun ProvidesHomeInteractor(): HomeInteractor {
        return HomeInteractor()
    }
    @Provides
     fun ProvidesHomePresenter(homeInteractor: HomeInteractor): HomePresenter {
        return HomePresenter(homeView,homeInteractor)
    }
}