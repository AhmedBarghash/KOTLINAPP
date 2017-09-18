package com.badrit.kotlinapp.dependencies

import com.badrit.kotlinapp.data_manager.HomeInteractour
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
    fun ProvidesHomeInteractor(): HomeInteractour {
        return HomeInteractour()
    }
    @Provides
    fun ProvidesHomePresenter(homeInteractour: HomeInteractour): HomePresenter {
        return HomePresenter(homeView, homeInteractour)
    }
}