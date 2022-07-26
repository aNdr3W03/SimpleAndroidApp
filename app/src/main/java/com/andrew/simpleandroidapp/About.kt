package com.andrew.simpleandroidapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvEmail:         TextView = findViewById(R.id.tv_url_email)
        val btnLinkedIn:     Button   = findViewById(R.id.btn_url_linkedin)
        val btnGitHub:       Button   = findViewById(R.id.btn_url_github)
        val tvDicoding:      TextView = findViewById(R.id.tv_url_dicoding)
        val tvYouTube:       TextView = findViewById(R.id.tv_url_youtube)
        val tvStackOverflow: TextView = findViewById(R.id.tv_url_stackoverflow)
        val tvDBpedia:       TextView = findViewById(R.id.tv_url_dbpedia)

        tvEmail.setOnClickListener(this)
        btnLinkedIn.setOnClickListener(this)
        btnGitHub.setOnClickListener(this)
        tvDicoding.setOnClickListener(this)
        tvYouTube.setOnClickListener(this)
        tvStackOverflow.setOnClickListener(this)
        tvDBpedia.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_url_email -> {
                val link = "mailto:andrewbjamesie@yahoo.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.btn_url_linkedin -> {
                val link = "https://www.linkedin.com/in/andrewbenedictusjamesie"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.btn_url_github -> {
                val link = "https://github.com/aNdr3W03/SimpleAndroidApp"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.tv_url_dicoding -> {
                val link = "https://www.dicoding.com/academies/51"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.tv_url_youtube -> {
                val link = "https://www.youtube.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.tv_url_stackoverflow -> {
                val link = "https://stackoverflow.com"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

            R.id.tv_url_dbpedia -> {
                val link = "https://www.dbpedia.org"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
