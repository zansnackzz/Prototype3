package com.example.prototype3

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_symptomm.*

class Symptomm_Old_Patient : AppCompatActivity() {
    var r: Int = 0
    var rr: Int = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptomm__old__patient)


        val patient_id = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_ID)
        val symptomm_de = intent.getStringExtra(Detail_Show_For_Old_Patient.Symptommmm)
        val actionn_de = intent.getStringExtra(Detail_Show_For_Old_Patient.Actionnn)
        val userr_id = intent.getStringExtra(Detail_Show_For_Old_Patient.User_Userid)
        val statuss_id = intent.getStringExtra(Detail_Show_For_Old_Patient.STATUS_ID)
        val status_numm = intent.getStringExtra(Detail_Show_For_Old_Patient.STATUS_NUMM)




        Rg1.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB1_1 -> r = r+0
                R.id.rB1_2 -> r = r+1
                R.id.rB1_3 -> r = r+2
            }

        })
        Rg2.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB2_1 -> r = r+0
                R.id.rB2_2 -> r = r+1

            }

        })
        Rg3.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB3_1 -> r = r+0
                R.id.rB3_2 -> r = r+1
                R.id.rB3_3 -> r = r+2
                R.id.rB3_4 -> r = r+3
            }

        })
        Rg4.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB4_1 -> r = r+0
                R.id.rB4_2 -> r = r+1
                R.id.rB4_3 -> r = r+2
            }

        })
        Rg5.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB5_1 -> r = r+0
                R.id.rB5_2 -> r = r+1
                R.id.rB5_3 -> r = r+2
            }

        })
        Rg6.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB6_1 -> r = r+0
                R.id.rB6_2 -> r = r+1

            }

        })
        Rg7.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB7_1 -> r = r+0
                R.id.rB7_2 -> r = r+1
                R.id.rB7_3 -> r = r+2
            }

        })
        Rg8.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB8_1 -> r = r+0
                R.id.rB8_2 -> r = r+1
                R.id.rB8_3 -> r = r+2
                R.id.rB8_4 -> r = r+3
            }

        })
        Rg9.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB9_1 -> r = r+0
                R.id.rB9_2 -> r = r+1
                R.id.rB9_3 -> r = r+2
            }

        })
        Rg10.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ _, i ->
            when(i){
                R.id.rB10_1 -> r = r+0
                R.id.rB10_2 -> r = r+1
                R.id.rB10_3 -> r = r+2
            }

        })


        btn_save.setOnClickListener{

            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.loading_progress,null)
            val message = dialogView.findViewById<TextView>(R.id.message)
            message.text = "  กำลังดำเนินการ..... "
            builder.setView(dialogView)
            builder.setCancelable(false)
            val dialog = builder.create()
            dialog.show()
            Handler().postDelayed({dialog.dismiss()},3000)

            Toast.makeText(this,"R = $r", Toast.LENGTH_SHORT).show()
            val str :String = when(r){
                0-> "สภาวะที่ 3"
                1-> "สภาวะที่ 3"
                2-> "สภาวะที่ 3"
                3-> "สภาวะที่ 3"
                4-> "สภาวะที่ 3"
                5-> "สภาวะที่ 2"
                6-> "สภาวะที่ 2"
                7-> "สภาวะที่ 2"
                8-> "สภาวะที่ 2"
                9-> "สภาวะที่ 1"
                10-> "สภาวะที่ 1"
                11-> "สภาวะที่ 1"
                12-> "สภาวะที่ 1"
                13-> "สภาวะที่ 1"
                14-> "สภาวะที่ 1"
                15-> "สภาวะที่ 1"
                16-> "สภาวะที่ 1"
                17-> "สภาวะที่ 1"
                18-> "สภาวะที่ 1"
                19-> "สภาวะที่ 1"
                20-> "สภาวะที่ 1"
                else -> "Not Matched"
            }
            val strr :String = when(r){
                0-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                1-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                2-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                3-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                4-> "สภาวะที่ผู้ป่วยไม่สามารถช่วยเหลือตัวเองได้เลย"
                5-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                6-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                7-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                8-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้บ้าง"
                9-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                10-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                11-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                12-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                13-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                14-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                15-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                16-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                17-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                18-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                19-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                20-> "สภาวะที่ผู้ป่วยสามารถช่วยเหลือตัวเองได้"
                else -> "Not Matched"
            }

            val sttaresult = status_numm.toInt()+1
            val status_nnumm = status_numm
            val rresult = r.toString()
            val detailshort = str
            val detaillong = strr
            val symptommmm = symptomm_de
            val actionnnn = actionn_de
            val patientID = patient_id
            val statuss_num = sttaresult.toString()
            val ref = FirebaseDatabase.getInstance().getReference("/Status/$patientID/")

            val statusID = ref.push().key
            val statuss = sentToStatusDB(statusID.toString(),rresult,detailshort,detaillong,symptommmm,actionnnn,statuss_num)

            ref.child("/Day$status_nnumm/$statusID").setValue(statuss).addOnCompleteListener{
                Log.d("Status_input","Upload All DATA SS")
                Log.d("Status_input","R = $rresult")
                Log.d("Status_input","DetailShort = $detailshort")
                Log.d("Status_input","DetailLong = $detaillong")
                Log.d("Status_input","PatientID = $patientID")*
                        Log.d("Status_input","Patient_id = $patient_id")
                Log.d("Status_input","StatusID = $statusID")
                Log.d("SSOOP","$status_numm after $sttaresult")
                Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()


            }

            val rresult2 = r.toString()
            val detailshort2 = str
            val detaillong2 = strr
            val symptommmm2 = symptomm_de
            val actionnnn2 = actionn_de
            val patientID2 = patient_id
            val statuss_num2 = rr.toString()
            val ref2 = FirebaseDatabase.getInstance().getReference("/Status/$patientID2/")

            val statusID2 = statuss_id
            val statuss2 = sentToStatusDB(statusID2,rresult2,detailshort2,detaillong2,symptommmm2,actionnnn2,statuss_num)

            ref2.child("/Day0/$statusID2").setValue(statuss2).addOnCompleteListener{
                Log.d("Status_input","Upload All DATA SS")
                Log.d("Status_input","R = $rresult")
                Log.d("Status_input","DetailShort = $detailshort")
                Log.d("Status_input","DetailLong = $detaillong")
                Log.d("Status_input","PatientID = $patientID")*
                        Log.d("Status_input","Patient_id = $patient_id")
                Log.d("Status_input","StatusID = $statusID")
                Log.d("SSOOP","$status_numm AfteR $sttaresult")
                Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()

            }


            val intent = Intent(this, List_patient::class.java)
            startActivity(intent)

        }







    }
}


