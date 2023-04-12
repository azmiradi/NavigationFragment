package com.azmiradi.navigationfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.azmiradi.salries.SalariesFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val exampleFragment = SalariesFragment()

        fragmentTransaction.replace(R.id.container_view, exampleFragment)
        fragmentTransaction.commit()
    }
}