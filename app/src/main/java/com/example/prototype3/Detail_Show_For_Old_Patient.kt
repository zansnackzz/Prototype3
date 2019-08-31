package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.FragmentTransitionImpl
import com.google.firebase.database.*
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail__show__for__old__patient.*

class Detail_Show_For_Old_Patient : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail__show__for__old__patient)

        val name_lp = intent.getStringExtra(List_patient.PATIENT_NAME)
        val lastname_lp = intent.getStringExtra(List_patient.PATIENT_LASTNAME)
        val address_lp = intent.getStringExtra(List_patient.PATIENT_ADD)
        val namecare_lp = intent.getStringExtra(List_patient.PATIENT_NAME_CARE)
        val gender_lp = intent.getStringExtra(List_patient.PATIENT_GENDER)
        val agee_lp = intent.getStringExtra(List_patient.PATIENT_AGEE)
        val tel_lp = intent.getStringExtra(List_patient.PATIENT_TEL_CARE)
        val bd_lp = intent.getStringExtra(List_patient.PATIENT_BD)
        val pic_lp = intent.getStringExtra(List_patient.PATIENT_PIC)
        val patient_iid = intent.getStringExtra(List_patient.PATIENT_ID)
        val uuser_id = intent.getStringExtra(List_patient.User_Userid)

        val ref = FirebaseDatabase.getInstance().getReference("/Status/$patient_iid/Day0")
        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onDataChange(p0: DataSnapshot) {
                p0.children
                    .forEach{
                        val sympp:String = it.child("symptomp_patient").getValue().toString()
                        val actionn:String = it.child("action_patient").getValue().toString()
                        val detaillong:String = it.child("detaillongStatusList_patient").getValue().toString()
                        val detailshort:String = it.child("detailshortStatusPatient").getValue().toString()
                        val statuss_id:String = it.child("id").getValue().toString()
                        val status_numm:String = it.child("status_num").getValue().toString()

                        symtomp_de_old.setText(sympp)
                        action_symptom.setText(actionn)
                        output_status.setText(detailshort)
                        long_status_patient.setText(detaillong)
                        Log.d("DDDD","$status_numm")

                        if(status_numm.equals("1")){

                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}

                        }
                        if(status_numm.equals("2")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("3")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("4")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("5")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("6")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("7")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("8")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("9")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("10")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("11")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("12")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("13")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("14")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("15")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("16")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("17")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("18")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("19")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("20")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("21")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("22")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("23")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("24")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("25")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("26")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("27")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("28")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("29")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                        if(status_numm.equals("30")){
                            btn_notificate.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Holdd_noti_Old_Activity::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(statussss,detailshort)
                                startActivity(intent)

                            }

                            btn_evaluation.setOnClickListener {
                                val intent = Intent(this@Detail_Show_For_Old_Patient,Symptomm_Old_Patient::class.java)
                                intent.putExtra(Symptommmm,sympp)
                                intent.putExtra(Actionnn,actionn)
                                intent.putExtra(PATIENT_ID, patient_iid)
                                intent.putExtra(User_Userid, uuser_id)
                                intent.putExtra(STATUS_ID, statuss_id)
                                intent.putExtra(STATUS_NUMM, status_numm)
                                startActivity(intent)}
                        }
                    }

            }


        })




        edit_bbtn.setOnClickListener {
            val intent = Intent(this,Edit_Old_Patient::class.java)
            intent.putExtra(PATIENT_ID, patient_iid)
            intent.putExtra(PATIENT_NAME, name_lp)
            intent.putExtra(PATIENT_LASTNAME, lastname_lp)
            intent.putExtra(PATIENT_GENDER, gender_lp)
            intent.putExtra(PATIENT_AGE, agee_lp)
            intent.putExtra(PATIENT_ADD, address_lp)
            intent.putExtra(PATIENT_TEL_CARE, tel_lp)
            intent.putExtra(PATIENT_NAME_CARE, namecare_lp)
            intent.putExtra(PATIENT_BD, bd_lp)
            intent.putExtra(PATIENT_PIC, pic_lp)
            startActivity(intent)

        }


        Picasso.get().load(pic_lp).into(image_detail)
        output_name.setText(name_lp)
        output_lastname.setText(lastname_lp)
        gender_out.setText(gender_lp)
        aaggee_out.setText(agee_lp)
        output_bd.setText(bd_lp)
        output_address.setText(address_lp)
        output_care.setText(namecare_lp)
        output_phonecare.setText(tel_lp)





        del_btn.setOnClickListener {
            val del_DB = FirebaseDatabase.getInstance().getReference("Patient/$uuser_id")
            del_DB.child("$patient_iid").removeValue()
            val sta_del_DB = FirebaseDatabase.getInstance().getReference("/Status/")
            sta_del_DB.child("$patient_iid").removeValue()
            Toast.makeText(this,"Del", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,List_patient::class.java)
            startActivity(intent)
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
        val User_Userid = "User_Userid"

        val STATUS_NUMM = "STATUS_NUMM"
        val STATUS_ID = "STATUS_ID"
        val Symptommmm = "Symptommmm"
        val statussss = "statussss"
        val Actionnn = "Actionnn"

    }



}

