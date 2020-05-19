package com.example.testjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import com.example.testjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var mainBinding: ActivityMainBinding? = null
    var blankViewModel: BlankViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        mainBinding =
//            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//        blankViewModel = ViewModelProviders.of(this).get(BlankViewModel::class.java)
    }
}
