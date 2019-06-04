package com.example.prototype3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.activity_detail_.*
import kotlinx.android.synthetic.main.patien_c_patien.view.*

class Detail_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_)

        val name_de = intent.getStringExtra(List_patient.USER_NAME)
        val lastname_de = intent.getStringExtra(List_patient.USER_LASTNAME)
        val bd_de = intent.getStringExtra(List_patient.USER_BD)
        val add_de = intent.getStringExtra(List_patient.USER_ADD)
        val name_care_de = intent.getStringExtra(List_patient.USER_NAME_CARE)
        val tel_de = intent.getStringExtra(List_patient.USER_TEL_CARE)
        val add_care_de = intent.getStringExtra(List_patient.USER_ADD_CARE)
        val pic_de = intent.getStringExtra(List_patient.USER_PIC)

        name_detail.setText(name_de)
        lastname_detail.setText(lastname_de)
        bd_detail.setText(bd_de)
        add_detail.setText(add_de)
        name_care_detail.setText(name_care_de)
        add_care_detail.setText(add_care_de)
        tel_care_detail.setText(tel_de)
        Picasso.get().load(pic_de).into(image_detail)

    }

}





