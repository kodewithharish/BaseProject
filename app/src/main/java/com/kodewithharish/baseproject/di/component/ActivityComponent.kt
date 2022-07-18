package com.kodewithharish.baseproject.di.component

import com.kodewithharish.baseproject.MainActivity
import com.kodewithharish.baseproject.di.module.Activitymodule
import dagger.Component

@Component(modules = [Activitymodule::class])
interface ActivityComponent {
    fun inject(activity:MainActivity)
}