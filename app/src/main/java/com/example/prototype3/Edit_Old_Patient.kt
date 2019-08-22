package com.example.prototype3

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.*
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail__show__for__old__patient.*
import kotlinx.android.synthetic.main.activity_detail_input_.*
import java.util.*

class Edit_Old_Patient : AppCompatActivity() {
    lateinit var nnamepatient: EditText
    lateinit var llastnamepatient: EditText
    lateinit var bbd: EditText
    lateinit var aaadress: EditText
    lateinit var nnamecare: EditText
    lateinit var ttelcare: EditText
    lateinit var radioGroup: RadioGroup
    lateinit var agee: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit__old__patient)

        val name_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_NAME)
        val lastname_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_LASTNAME)
        val address_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_ADD)
        val namecare_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_NAME_CARE)
        val gender_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_GENDER)
        val agee_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_AGE)
        val tel_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_TEL_CARE)
        val bd_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_BD)
        val pic_lp = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_PIC)
        Picasso.get().load(pic_lp).into(image_detail2)
        name_patient2.setText(name_lp)
        lastname_patient2.setText(lastname_lp)
        age_patient.setText(agee_lp)
        address_patient2.setText(address_lp)
        bd_patient2.setText(bd_lp)
        namecare_patient2.setText(namecare_lp)
        telcare_patient2.setText(tel_lp)


        nnamepatient = findViewById(R.id.name_patient2)
        llastnamepatient = findViewById(R.id.lastname_patient2)
        bbd = findViewById(R.id.bd_patient2)
        aaadress = findViewById(R.id.address_patient2)
        nnamecare = findViewById(R.id.namecare_patient2)
        ttelcare = findViewById(R.id.telcare_patient2)
        radioGroup = findViewById(R.id.radioGroup77)
        agee = findViewById(R.id.age_patient)
        img_p_upload2.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent,0)
        }

        detail_input_DB.setOnClickListener {
            checkblank()
            val builder = AlertDialog.Builder(this)
            val dialogView = layoutInflater.inflate(R.layout.loading_progress,null)
            val message = dialogView.findViewById<TextView>(R.id.message)
            message.text = "  กำลังดำเนินการ..... "
            builder.setView(dialogView)
            builder.setCancelable(false)
            val dialog = builder.create()
            dialog.show()

            Handler().postDelayed({dialog.dismiss()},5000)
        }

    }
    companion object {
        val PATIENT_ID = "PATIENT_ID"
        val PATIENT_NAME = "PATIENT_NAME"
        val PATIENT_LASTNAME = "PATIENT_LASTNAME"
        val PATIENT_ADD = "PATIENT_ADD"
        val PATIENT_NAME_CARE = "PATIENT_NAME_CARE"
        val PATIENT_AGE = "PATIENT_AGE"
        val PATIENT_TEL_CARE = "PATIENT_TEL_CARE"
        val PATIENT_PIC = "PATIENT_PIC"
        val PATIENT_BD = "PATIENT_BD"
        val PATIENT_GENDER = "PATIENT_GENDER"

        val Symptomm = "Symptomm"
        val Actionn = "Actionn"

    }


    private fun checkblank(){
        val nnamepatientt = nnamepatient.text.toString()
        val llastnamepatientt = llastnamepatient.text.toString()
        val bbdd = bbd.text.toString()
        val aaadresss = aaadress.text.toString()
        val nnamecaree = nnamecare.text.toString()
        val tttelcare = ttelcare.text.toString()
        val aagee = agee.text.toString()

        if (nnamepatientt.isEmpty() || llastnamepatientt.isEmpty()|| bbdd.isEmpty() || aaadresss.isEmpty()|| aaadresss.isEmpty()|| nnamecaree.isEmpty()|| tttelcare.isEmpty()|| aagee.isEmpty()){
            Toast.makeText(this, "กรุณากรอกข้อมูลให้ครบ.", Toast.LENGTH_SHORT).show()

            return
        }else{
            imageUpload()
        }

    }
    private fun sentDb(imageuurl: String){
        val nnnamepatient = nnamepatient.text.toString().trim()
        val lllastnamepatient = llastnamepatient.text.toString().trim()
        val bbbd = bbd.text.toString().trim()
        val aaaadress = aaadress.text.toString().trim()
        val nnnamecare = nnamecare.text.toString().trim()
        val tttelcare = ttelcare.text.toString().trim()
        val valuetwo = radioGroup.checkedRadioButtonId
        val rb = findViewById<RadioButton>(valuetwo)
        val rbb = rb.text.toString().trim()
        val aagee = agee.text.toString()
        val patientId = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_ID)
        val userId = FirebaseAuth.getInstance().uid
        val ref = FirebaseDatabase.getInstance().getReference("/Patient/$userId/")

        ref.push().key
        val patient = edit_toDB(patientId,nnnamepatient,lllastnamepatient,bbbd,aaaadress,nnnamecare,tttelcare,rbb,aagee,imageuurl)

        ref.child(patientId.toString()).setValue(patient).addOnCompleteListener {


            Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, List_patient::class.java)

            startActivity(intent)
        }


    }

    var selectedPhotoUri: Uri? = null
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 0 && resultCode == Activity.RESULT_OK && data != null){
            Log.d("Detail_input","Photo Select")

            selectedPhotoUri = data.data
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedPhotoUri)
            image_detail2.setImageBitmap(bitmap)
            img_p_upload2.alpha = 0f



        }
    }
    private fun imageUpload() {
        if (selectedPhotoUri == null){
            Log.d("Detail_input","I AM HERE")
            return
        }
        val filename = UUID.randomUUID().toString()
        val ref = FirebaseStorage.getInstance().getReference("/images/$filename")
        ref.putFile(selectedPhotoUri!!)
            .addOnSuccessListener {
                Log.d("Detail_input","Upload SS : ${it.metadata?.path}")

                ref.downloadUrl.addOnSuccessListener {
                    Log.d("Detail_input","Location: $it")
                    sentDb(it.toString())
                }

            }
            .addOnFailureListener{

            }

    }
}
