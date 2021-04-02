package com.rfelixr.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId
import com.rfelixr.applicationnotification.utils.showNotication

class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.button_send_notification)

        btnSend.setOnClickListener {
            this.showNotication("123","Aulas Koklin","Bootcamp de andoid kotlin com a DIOS.")
        }

        Log.i("**newToken",FirebaseInstanceId.getInstance().token.toString())
    }
}