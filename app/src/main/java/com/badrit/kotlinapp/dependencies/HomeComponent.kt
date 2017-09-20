package com.badrit.kotlinapp.dependencies

import com.badrit.kotlinapp.ui.activities.MainActivity
import dagger.Component


/**
 * Created by ahmed-osama on 17/09/17.
 */
@Component(modules = arrayOf(HomeModule::class))
interface HomeComponent {
    fun inject(activity :MainActivity)
}