package com.example.prototype3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_girl_input.*


class Detail_input : AppCompatActivity() {
    lateinit var nnamepatient: EditText
    lateinit var llastnamepatient: EditText
    lateinit var bbd: EditText
    lateinit var aaadress: EditText
    lateinit var aaadresscare: EditText
    lateinit var nnamecare: EditText
    lateinit var ttelcare: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_girl_input)


        nnamepatient = findViewById(R.id.name_patient)
        llastnamepatient = findViewById(R.id.lastname_patient)
        bbd = findViewById(R.id.bd_patient)
        aaadress = findViewById(R.id.address_patient)
        aaadresscare = findViewById(R.id.addresscare_patient)
        nnamecare = findViewById(R.id.namecare_patient)
        ttelcare = findViewById(R.id.telcare_patient)


        spangirl_btn.setOnClickListener {

            val nnamepatientt = nnamepatient.text.toString()
            val llastnamepatientt = llastnamepatient.text.toString()
            val bbdd = bbd.text.toString()
            val aaadresss = aaadress.text.toString()
            val aaadresscaree = aaadresscare.text.toString()
            val nnamecaree = nnamecare.text.toString()
            val tttelcare = ttelcare.text.toString()


            if (nnamepatientt.isEmpty() || llastnamepatientt.isEmpty()|| bbdd.isEmpty() || aaadresss.isEmpty()|| aaadresss.isEmpty()|| aaadresscaree.isEmpty()|| nnamecaree.isEmpty()|| tttelcare.isEmpty()){
                Toast.makeText(this, "กรุณากรอกข้อมูลให้ครบ.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, span_symptom::class.java)
                startActivity(intent)
                sentDb()
                return@setOnClickListener
            }
        }
    }
    private fun sentDb(){
        val nnnamepatient = nnamepatient.text.toString().trim()
        val lllastnamepatient = llastnamepatient.text.toString().trim()
        val bbbd = bbd.text.toString().trim()
        val aaaadress = aaadress.text.toString().trim()
        val aaaadresscare = aaadresscare.text.toString().trim()
        val nnnamecare = nnamecare.text.toString().trim()
        val tttelcare = ttelcare.text.toString().trim()


        val userId = FirebaseAuth.getInstance().uid
        val ref = FirebaseDatabase.getInstance().getReference("/Patient/$userId")

        val patientId = ref.push().key
        val patient = sentToDbpatient(patientId.toString(),nnnamepatient,lllastnamepatient,bbbd,aaaadress,aaaadresscare,nnnamecare,tttelcare)

        ref.child(patientId.toString()).setValue(patient).addOnCompleteListener {
            Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()
        }
    }
}





