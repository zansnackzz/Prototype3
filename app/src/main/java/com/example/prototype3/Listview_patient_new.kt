package com.example.prototype3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prototype3.Adapters.reCDB
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.card_patien.view.*


class Listview_patient_new : AppCompatActivity() {

    lateinit var mReyclerView : RecyclerView
    lateinit var mDatabase : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview_patient_new)

        val userId = FirebaseAuth.getInstance().uid

        mDatabase = FirebaseDatabase.getInstance().getReference("/Patient/$userId")
        mReyclerView = findViewById(R.id.reCycle_view)
        mReyclerView.setHasFixedSize(true)
        mReyclerView.setLayoutManager(LinearLayoutManager(this))

        logRecyclerview()

    }
    private fun logRecyclerview(){

        var FirebaseRecyclerAdapter = object : FirebaseRecyclerAdapter<reCDB , ListViewHolder>(

            reCDB::class.java,
            R.layout.card_patien,
            ListViewHolder::class.java,
            mDatabase


        ){
            override fun populateViewHolder(p0: ListViewHolder, p1: reCDB, p2: Int) {

                p0.mView.name_re.setText(p1.name)
                p0.mView.last_name_re.setText(p1.lastname)

            }

        }

        mReyclerView.adapter = FirebaseRecyclerAdapter

    }

    class ListViewHolder(var mView : View) : RecyclerView.ViewHolder(mView)

}
