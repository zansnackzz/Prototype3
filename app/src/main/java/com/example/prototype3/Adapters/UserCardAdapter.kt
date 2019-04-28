package com.example.prototype3.Adapters

import android.widget.ArrayAdapter
import com.example.prototype3.DBinput.reciveDB
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.prototype3.R
import kotlinx.android.synthetic.main.user_card.*
import kotlinx.android.synthetic.main.user_card.view.*
import java.lang.Exception
import java.security.AccessControlContext

class UserCardAdapter(context: Context, resource: Int, list: ArrayList<reciveDB>): ArrayAdapter<reciveDB>(context, resource, list) {
    private var mResource: Int =0
    private var mList: ArrayList<reciveDB>
    private var mLayoutInflator: LayoutInflater
    private var mContext: Context = context

    init {
        this.mResource =resource
        this.mList = list
        this.mLayoutInflator = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val returnView: View?
        if (convertView == null){
            returnView = try {
                mLayoutInflator.inflate(mResource, null)
            }catch (e: Exception){
                e.printStackTrace()
                View(context)
            }
            setUI(returnView, position)
            return returnView
        }
        setUI(convertView, position)
        return convertView
    }

    private fun setUI(view: View, position: Int){
        val user: reciveDB? = if (count > position) getItem(position) else null
        val email: TextView? = view.findViewById(R.id.mail_card)
        email?.text = user?.email ?:""

        val password: TextView? = view.findViewById(R.id.pass_card)
        password?.text = user?.pass ?:""

        val usId: TextView? = view.findViewById(R.id.id_card)
        usId?.text = user?.id ?:""
    }
}