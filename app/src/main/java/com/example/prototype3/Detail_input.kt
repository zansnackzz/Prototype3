package com.example.prototype3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_girl_input.*
import java.util.*


class Detail_input : AppCompatActivity() {lateinit var nnamepatient: EditText
    lateinit var llastnamepatient: EditText
    lateinit var bbd: EditText
    lateinit var aaadress: EditText
    lateinit var aaadresscare: EditText
    lateinit var nnamecare: EditText
    lateinit var ttelcare: EditText
    lateinit var radioGroup: RadioGroup
    lateinit var agee: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_girl_input)

        nnamepatient = findViewById(R.id.name_patient)
        llastnamepatient = findViewById(R.id.lastname_patient)
        bbd = findViewById(R.id.bd_patient)
        aaadress = findViewById(R.id.address_patient2)
        aaadresscare = findViewById(R.id.addresscare_patient)
        nnamecare = findViewById(R.id.namecare_patient)
        ttelcare = findViewById(R.id.telcare_patient)
        radioGroup = findViewById(R.id.radioGroup)
        agee = findViewById(R.id.age_patient5)

        img_p_upload.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent,0)
        }
        spangirl_btn.setOnClickListener {
            checkblank()

            //sentDb()


        }

    }

    private fun checkblank(){
        val nnamepatientt = nnamepatient.text.toString()
        val llastnamepatientt = llastnamepatient.text.toString()
        val bbdd = bbd.text.toString()
        val aaadresss = aaadress.text.toString()
        val aaadresscaree = aaadresscare.text.toString()
        val nnamecaree = nnamecare.text.toString()
        val tttelcare = ttelcare.text.toString()


        if (nnamepatientt.isEmpty() || llastnamepatientt.isEmpty()|| bbdd.isEmpty() || aaadresss.isEmpty()|| aaadresss.isEmpty()|| aaadresscaree.isEmpty()|| nnamecaree.isEmpty()|| tttelcare.isEmpty()){
            Toast.makeText(this, "กรุณากรอกข้อมูลให้ครบ.", Toast.LENGTH_SHORT).show()

            return
        }else{
            val intent = Intent(this, SymptommActivity::class.java)
            imageUpload()
            startActivity(intent)
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

        val userId = FirebaseAuth.getInstance().uid
        val ref = FirebaseDatabase.getInstance().getReference("/Patient/$userId")

        val patientId = ref.push().key
        val patient = sentToDbpatient(patientId.toString(),nnnamepatient,lllastnamepatient,bbbd,aaaadress,nnnamecare,tttelcare,rbb,aagee,imageuurl)

        ref.child(patientId.toString()).setValue(patient).addOnCompleteListener {

            Log.d("Detail_input","Upload All DATA SS")
            Toast.makeText(this,"บันทึกสำเร็จ", Toast.LENGTH_SHORT).show()

        }


    }

    var selectedPhotoUri: Uri? = null
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 0 && resultCode == Activity.RESULT_OK && data != null){
            Log.d("Detail_input","Photo Select")

            selectedPhotoUri = data.data
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedPhotoUri)
            image_detail.setImageBitmap(bitmap)
            img_p_upload.alpha = 0f



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





