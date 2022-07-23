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

        val tvEmail: TextView   = findViewById(R.id.tv_url_email)
        val btnLinkedIn: Button = findViewById(R.id.btn_url_linkedin)
        val btnGitHub:Button    = findViewById(R.id.btn_url_github)

        tvEmail.setOnClickListener(this)
        btnLinkedIn.setOnClickListener(this)
        btnGitHub.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_url_email -> {
                val link = "mailto:andrewbjamesie@yahoo.com"
                val linkedInIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(linkedInIntent)
            }

            R.id.btn_url_linkedin -> {
                val link = "https://www.linkedin.com/in/andrewbenedictusjamesie"
                val linkedInIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(linkedInIntent)
            }

            R.id.btn_url_github -> {
                val link = "https://github.com/aNdr3W03/SimpleAndroidApp"
                val gitHubIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(gitHubIntent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
