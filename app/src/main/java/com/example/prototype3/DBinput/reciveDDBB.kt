package com.example.prototype3.DBinput

import com.example.prototype3.sentToDb
import com.google.firebase.database.*
import java.util.*
import kotlin.collections.ArrayList

object reciveDDBB: Observable() {
    private var mValueDataListener: ValueEventListener? = null
    private var mUserlist: ArrayList<reciveDB>? = ArrayList()

    private fun getDatabaseRef(): DatabaseReference? {
        return FirebaseDatabase.getInstance().reference.child("Users")
    }


    init {
        if (mValueDataListener != null){
            getDatabaseRef()?.removeEventListener(mValueDataListener!!)
        }
        mValueDataListener = null
        mValueDataListener = object: ValueEventListener{

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                try {
                    val data: ArrayList<reciveDB> = ArrayList()
                    if (dataSnapshot !=null){
                        for (snapshot: DataSnapshot in dataSnapshot.children) {
                            try {
                                data.add(reciveDB(snapshot))
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }

                        }
                        mUserlist = data
                        setChanged()
                        notifyObservers()
                    }

                }catch (e: Exception){
                    e.printStackTrace()
                }
            }

            override fun onCancelled(p0: DatabaseError) {
                if (p0 !=null){

                }
            }


        }
        getDatabaseRef()?.addValueEventListener(mValueDataListener as ValueEventListener)
    }
    fun getData(): ArrayList<reciveDB>?{
        return mUserlist
    }

}