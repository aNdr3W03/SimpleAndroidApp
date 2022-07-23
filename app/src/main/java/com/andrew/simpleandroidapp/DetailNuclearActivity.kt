package com.andrew.simpleandroidapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailNuclearActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_nuclear)

        val tvNameReceived: TextView = findViewById(R.id.tv_name_received)
        val tvDetailReceived: TextView = findViewById(R.id.tv_detail_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvNameReceived.text = name
        tvDetailReceived.text = detail
    }
}
