package com.example.andfree_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "start of onCreate function")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Artemii"
        val surname: String = "Petrovskii"
        var age: Int = 14
        var height: Double = 170.0
        val summary: String = "name: $name surname: $surname age: $age height: $height"
        val autotest: String = "name: Ivan surname: Ivanov age: 37 height: 172.2"

        val output: TextView = findViewById(R.id.output)
        output.text = summary
        val out: TextView = findViewById(R.id.out)
        out.text = autotest

        Log.d(TAG, summary)
        Log.d(TAG, autotest)
        Log.d(TAG, "end of onCreate function")
    }
}