package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register_acc.*
import kotlinx.android.synthetic.main.activity_symptomm.*

class SymptommActivity : AppCompatActivity() {
    var r: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptomm)


        Rg1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB1_1 -> r = r+0
                R.id.rB1_2 -> r = r+1
                R.id.rB1_3 -> r = r+2
            }




        })
        Rg2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB2_1 -> r = r+0
                R.id.rB2_2 -> r = r+1

            }




        })
        Rg3.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB3_1 -> r = r+0
                R.id.rB3_2 -> r = r+1
                R.id.rB3_3 -> r = r+2
                R.id.rB3_4 -> r = r+3
            }




        })
        Rg4.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB4_1 -> r = r+0
                R.id.rB4_2 -> r = r+1
                R.id.rB4_3 -> r = r+2
            }




        })
        Rg5.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB5_1 -> r = r+0
                R.id.rB5_2 -> r = r+1
                R.id.rB5_3 -> r = r+2
            }




        })
        Rg6.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB6_1 -> r = r+0
                R.id.rB6_2 -> r = r+1

            }




        })
        Rg7.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB7_1 -> r = r+0
                R.id.rB7_2 -> r = r+1
                R.id.rB7_3 -> r = r+2
            }




        })
        Rg8.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB8_1 -> r = r+0
                R.id.rB8_2 -> r = r+1
                R.id.rB8_3 -> r = r+2
                R.id.rB8_4 -> r = r+3
            }




        })
        Rg9.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB9_1 -> r = r+0
                R.id.rB9_2 -> r = r+1
                R.id.rB9_3 -> r = r+2
            }




        })
        Rg10.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{radioGroup, i ->
            when(i){
                R.id.rB10_1 -> r = r+0
                R.id.rB10_2 -> r = r+1
                R.id.rB10_3 -> r = r+2
            }




        })


        btn_save.setOnClickListener{
            Toast.makeText(this,"R = $r",Toast.LENGTH_SHORT).show()
            val str :String = when(r){
                0-> "อยู่ในสภาวะที่ 3"
                1-> "อยู่ในสภาวะที่ 3"
                2-> "อยู่ในสภาวะที่3"
                3-> "อยู่ในสภาวะที่ 3"
                4-> "อยู่ในสภาวะที่ 3"
                5-> "อยู่ในสภาวะที่ 2"
                6-> "อยู่ในสภาวะที่ 2"
                7-> "อยู่ในสภาวะที่ 2"
                8-> "อยู่ในสภาวะที่ 2"
                9-> "อยู่ในสภาวะที่ 1"
                10-> "อยู่ในสภาวะที่ 1"
                11-> "อยู่ในสภาวะที่ 1"
                12-> "อยู่ในสภาวะที่ 1"
                13-> "อยู่ในสภาวะที่ 1"
                14-> "อยู่ในสภาวะที่ 1"
                15-> "อยู่ในสภาวะที่ 1"
                16-> "อยู่ในสภาวะที่ 1"
                17-> "อยู่ในสภาวะที่ 1"
                18-> "อยู่ในสภาวะที่ 1"
                19-> "อยู่ในสภาวะที่ 1"
                20-> "อยู่ในสภาวะที่ 1"
                else -> "Not Matched"
            }
            val strr :String = when(r){
                0-> "คือ สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                1-> "คือ สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                2-> "คือ สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                3-> "คือ สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                4-> "คือ สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                5-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                6-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                7-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                8-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                9-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                10-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                11-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                12-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                13-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                14-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                15-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                16-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                17-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                18-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                19-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                20-> "คือ สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                else -> "Not Matched"
            }
            val intent = Intent(this,Status_Activity::class.java)
            intent.putExtra(RESULLT,str)
            intent.putExtra(RESULLTT,strr)
            startActivity(intent)
        }



    }
    companion object{
        val RESULLT = "RESULLT"
        val RESULLTT = "RESULLTT"
    }
}





