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
import java.lang.reflect.InvocationTargetException

class List_patient : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_patient)


        fetchUsers()

        }
    companion object {

        val USER_NAME = "USER_NAME"
        val USER_LASTNAME = "USER_LASTNAME"
        val USER_ADD = "USER_ADD"
        val USER_NAME_CARE = "USER_NAME_CARE"
        val USER_ADD_CARE = "USER_ADD_CARE"
        val USER_TEL_CARE = "USER_TEL_CARE"
        val USER_PIC = "USER_PIC"
        val USER_BD = "USER_BD"
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

                adapter.setOnItemClickListener{ item, view ->
                    val userItem = item as UserItem
                    val intent = Intent(view.context, Detail_Show::class.java)
                    intent.putExtra(USER_NAME, userItem.user.name)
                    intent.putExtra(USER_LASTNAME, userItem.user.lastname)
                    intent.putExtra(USER_ADD, userItem.user.address)
                    intent.putExtra(USER_NAME_CARE, userItem.user.namecare)
                    intent.putExtra(USER_TEL_CARE, userItem.user.tel)
                    intent.putExtra(USER_BD, userItem.user.bd)
                    intent.putExtra(USER_PIC, userItem.user.imageuurl)
                    startActivity(intent)

                    finish()
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
        viewHolder.itemView.lastname_text.text = user.lastname
        Picasso.get().load(user.imageuurl).rotate(90f).into(viewHolder.itemView.image_list)
    }

    override fun getLayout(): Int {
        return R.layout.patien_c_patien
    }
}