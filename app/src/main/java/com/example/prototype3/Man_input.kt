package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_man_input.*
import kotlinx.android.synthetic.main.activity_register_acc.*

class Man_input : AppCompatActivity() {
    lateinit var nnamepatient: EditText
    lateinit var llastnamepatient: EditText
    lateinit var bbd: EditText
    lateinit var aaadress: EditText
    lateinit var aaadresscare: EditText
    lateinit var nnamecare: EditText
    lateinit var ttelcare: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_input)

        nnamepatient = findViewById(R.id.name_patient)
        llastnamepatient = findViewById(R.id.lastname_patient)
        bbd = findViewById(R.id.bd_patient)
        aaadress = findViewById(R.id.address_patient)
        aaadresscare = findViewById(R.id.addresscare_patient)
        nnamecare = findViewById(R.id.namecare_patient)
        ttelcare = findViewById(R.id.telcare_patient)


        spanman_btn.setOnClickListener {
            val name = name_patient.text.toString()
            val lastname = lastname_patient.text.toString()
            val bd = bd_patient.text.toString()
            val address = address_patient.text.toString()
            val nname = namecare_patient.text.toString()
            val aaddress = addresscare_patient.text.toString()
            val tel = telcare_patient.text.toString()


            if (name.isEmpty() || lastname.isEmpty()||bd.isEmpty() || address.isEmpty()|| bd.isEmpty()|| nname.isEmpty()
                || aaddress.isEmpty()|| tel.isEmpty()){
                Toast.makeText(this, "กรุณากรอกข้อมูลให้ครบ.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            sentDb()
        }


    private fun sentDb(){
        val nnnamepatient = nnamepatient.text.toString().trim()
        val lllastnamepatient = llastnamepatient.text.toString().trim()
        val bbbd = bbd.text.toString().trim()
        val aaaadress = aaadress.text.toString().trim()
        val aaaadresscare = aaadresscare.text.toString().trim()
        val nnnamecare = nnamecare.text.toString().trim()
        val tttelcare = ttelcare.text.toString().trim()



        val ref = FirebaseDatabase.getInstance().getReference("Patient")

        val patientId = ref.push().key
        val patient = sentToDbpatient(patientId.toString(),nnnamepatient,lllastnamepatient,bbbd,aaaadress,aaaadresscare,nnnamecare,tttelcare)

        ref.child(patientId.toString()).setValue(patient).addOnCompleteListener {
            Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()
        }
    }
}
