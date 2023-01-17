package com.example.sendingvalues

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This is for the pop up sheet that helps the user as a manual guide about the app.
        val popupsheet = PopUp()

        //When the user clicks on the button that says "help", it will make the manual guide sheet pop up.
        help.setOnClickListener {
            popupsheet.show(supportFragmentManager,"PopUpSheetDialog" )
        }

    }

    //Values are created here because the software will save the input the user puts.
    fun result(view: View) {
        val name=Edittext.text.toString()
        val brand=Edittext1.text.toString()
        val location=Edittext3.text.toString()
        val email=Edittext4.text.toString()
        val website=Edittext5.text.toString()
        val number=EditText2.text.toString().toInt()

        //intent.putExtra is used here in order to send the values of the name, brand, number, location, email, website, to the next activity.
        val intent=Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("Name", name)
        intent.putExtra("Brand", brand)
        intent.putExtra("Number", number)
        intent.putExtra("Location", location)
        intent.putExtra("Email", email)
        intent.putExtra("Website", website)
        startActivity(intent)
    }

}