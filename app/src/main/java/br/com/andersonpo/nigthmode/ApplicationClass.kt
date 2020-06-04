package br.com.andersonpo.nigthmode

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class ApplicationClass : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode())
    }

}