package com.andrew.simpleandroidapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailNuclearActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME   = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE  = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_nuclear)

        val tvNameReceived:    TextView  = findViewById(R.id.tv_name_received)
        val tvDetailReceived:  TextView  = findViewById(R.id.tv_detail_received)
        val imgDetailReceived: ImageView = findViewById(R.id.img_item_photo)

        val name   = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val image  = intent.getIntExtra(EXTRA_IMAGE, 0)

        tvNameReceived.text   = name
        tvDetailReceived.text = detail
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgDetailReceived)

        supportActionBar?.title = name
    }
}
