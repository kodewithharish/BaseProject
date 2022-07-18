package com.kodewithharish.baseproject.di.module

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class Activitymodule(private val acivity:Activity) {

    @Provides
   fun provideContext():Context=acivity;
}