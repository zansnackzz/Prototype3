package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.squareup.picasso.Picasso
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_list_patient.*
import kotlinx.android.synthetic.main.patien_c_patien.view.*

class List_patient : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_patient)

   //     val adapter = GroupAdapter<ViewHolder>()
   //     adapter.add(UserItem())
   //     adapter.add(UserItem())
   //     adapter.add(UserItem())

   //     patient_view.adapter = adapter

        fetchUsers()

        }
    private fun fetchUsers(){
        val userId = FirebaseAuth.getInstance().uid
        Log.d("List_patient","My uid :$userId")
        val ref = FirebaseDatabase.getInstance().getReference("/Patient/$userId")
        ref.addListenerForSingleValueEvent(object : ValueEventListener{
            override fun onDataChange(p0: DataSnapshot) {
                val adapter = GroupAdapter<ViewHolder>()
                p0.children.forEach {
                    Log.d("List_patient",it.toString())
                    val user = it.getValue(sentToDbpatient::class.java)
                    if (user != null ){
                        adapter.add(UserItem(user))
                    }

                }
                patient_view.adapter = adapter
            }

            override fun onCancelled(p0: DatabaseError) {

            }
        })
    }
}

class UserItem(val user: sentToDbpatient): Item<ViewHolder>(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.name_text.text = user.name

        Picasso.get().load(user.imageuurl).into(viewHolder.itemView.image_list)
    }

    override fun getLayout(): Int {
        return R.layout.patien_c_patien
    }
}