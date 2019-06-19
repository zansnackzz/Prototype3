package com.example.prototype3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_detail_input_.*
import kotlinx.android.synthetic.main.activity_girl_input.*
import java.util.*
import kotlin.collections.ArrayList


class Detail_input_Activity : AppCompatActivity(){lateinit var nnamepatient: EditText
    lateinit var option : Spinner
    lateinit var optionn : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_input_)

        detail_input_DB.setOnClickListener {
            val intent = Intent(this,SymptommActivity::class.java)
            startActivity(intent)
        }








        option = findViewById(R.id.spinner) as Spinner


        val options = arrayListOf("Option 1 ","Option 2 ","Option 3 ")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }
        }


        optionn = findViewById(R.id.spinner2) as Spinner

        val optionss = arrayListOf("Optionn1","Optionn2","Optionn3")

        optionn.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionss)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

            }
        }



    }

}



