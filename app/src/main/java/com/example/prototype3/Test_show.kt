package com.example.prototype3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.prototype3.Adapters.UserCardAdapter
import com.example.prototype3.DBinput.reciveDB
import com.example.prototype3.DBinput.reciveDDBB
import java.util.*
import kotlin.collections.ArrayList

class Mainmenu : AppCompatActivity(), Observer {
    private var mUserListAdapter: UserCardAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_show)
        reciveDDBB

        reciveDDBB.addObserver(this)

        val dataList: ListView = findViewById(R.id.user_List)
        val date: ArrayList<reciveDB> = ArrayList()
        mUserListAdapter = UserCardAdapter(this, R.layout.user_card, date)
        dataList.adapter = mUserListAdapter
    }

    override fun update(o: Observable?, arg: Any?) {
       mUserListAdapter?.clear()

        val data = reciveDDBB.getData()
        if (data != null){
            mUserListAdapter?.clear()
            mUserListAdapter?.addAll(data)
            mUserListAdapter?.notifyDataSetChanged()
        }
    }

    override fun onResume() {
        super.onResume()
        reciveDDBB.addObserver(this)
    }

    override fun onPause() {
        super.onPause()
        reciveDDBB.deleteObserver(this)
    }

    override fun onStop() {
        super.onStop()
        reciveDDBB.deleteObserver(this)
    }
}

open class AppCompatActivity {

}
