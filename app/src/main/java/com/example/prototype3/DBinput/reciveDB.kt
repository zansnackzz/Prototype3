package com.example.prototype3.DBinput
import com.google.firebase.database.DataSnapshot
import java.lang.Exception

class reciveDB (snapshot: DataSnapshot) {
    lateinit var id: String
    lateinit var email: String
    lateinit var pass: String

    init {
        try {
            val data: HashMap<String, Any> = snapshot.value as HashMap<String, Any>
            id = snapshot.key ?: ""
            email = data["mail"] as String
            pass = data["pass"] as String


        }catch (e: Exception) {
            e.printStackTrace()
        }
    }

}