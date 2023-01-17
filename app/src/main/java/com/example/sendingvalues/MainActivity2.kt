package com.example.sendingvalues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //By using getIntent(), the software starts the receiving process of values.
        val intent=getIntent()
        val name=intent.getStringExtra("Name")
        val Brand=intent.getStringExtra("Brand")
        val location=intent.getStringExtra("Location")
        val email=intent.getStringExtra("Email")
        val website=intent.getStringExtra("Website")
        val Number=intent.getIntExtra("Number", 0)

        //Setting the values here with textviews from calling their ids.
        Name.text=" "+name
        brand.text=" "+Brand
        Location.text=" "+location
        Email.text=" "+email
        Website.text=" "+website
        number.text=" "+Number



    }
}