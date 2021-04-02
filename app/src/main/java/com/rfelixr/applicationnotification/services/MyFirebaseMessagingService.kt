package com.rfelixr.applicationnotification.services

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.rfelixr.applicationnotification.utils.showNotication

class MyFirebaseMessagingService : FirebaseMessagingService() {

    val tag = "FirebaseMessagingServ"
    override fun onMessageReceived(remoteMessage : RemoteMessage) {
        Log.i(tag,remoteMessage.from.toString())

        if (remoteMessage.notification != null){
            this.showNotication("123",
            remoteMessage.notification?.title.toString(),
            remoteMessage.notification?.body.toString())
        }
    }
}