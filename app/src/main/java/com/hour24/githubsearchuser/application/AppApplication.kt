package com.hour24.githubsearchuser.application

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

class AppApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
