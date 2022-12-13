package com.sopt.cilap

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (BuildConfig.DEBUG) Log.d("REALEASEDEBUG", "IS DEBUG")
        else Log.d("REALEASEDEBUG", "IS RELEASE")

        val Abc = mutableListOf<String>()
        val GetLoadData = mutableListOf<String>()
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdfjk", "adskfjhdsf")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdfjk", "adskfjhdsf")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
        Log.d("sdalfk", "dslfjl")
    }

    fun getHigh() {
        Log.d("sdalfk", "dslfjl")
    }
}
