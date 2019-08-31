package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Holdd_noti_Old_Activity : AppCompatActivity() {
    val checksymptom = "โรคหลอดเลือด"
    val checksymptom2 = "โรคพาร์กินสัน"
    val checksymptom3 = "โรคอัมพฤกษ์-อัมพาต"

    val getstatus1 = "สภาวะที่ 1"
    val getstatus2 = "สภาวะที่ 2"
    val getstatus3 = "สภาวะที่ 3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holdd_noti__old_)

        val getstatus = intent.getStringExtra(Detail_Show_For_Old_Patient.statussss) // Get From Firebase
        val getsymptom = intent.getStringExtra(Detail_Show_For_Old_Patient.Symptommmm) // Get From Firebase

        if (getsymptom.equals(checksymptom)){

            if (getstatus.equals(getstatus1)){

                val M1 = "07.00-08.00 น. ออกกำลังกาย เช่น เดินเร็ว แกว่งแขน"
                val M2 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M3 = "09.00-11.00 น. ทำกิจวัตรประจำวันตามปกติ"
                val M4 = "11.00-12.00 น. หากิจกรรมทำเพื่อให้รู้สึกผ่อนคลาย"
                val M5 = "12.00-13.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M6 = "13.00-14.00 น. พาผู้ป่วยออกไปเดินเล่น เพื่อให้ผู้ป่วยผ่อนคลาย"
                val M7 = "14.00-16.00 น. ทำกิจวัตรประจำวันตามปกติ"
                val M8 = "16.00-17.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วย"
                val M9 = "17.00-18.00 น. ออกกำลังกาย เช่น เดินเร็ว โยคะ"
                val M10 = "18.00-19.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M11 = "19.00-21.00 น. หากิจกรรมทำเพื่อให้รู้สึกผ่อนคลาย"
                val M12 = "22.00 น. รับประทานยาที่แพทย์สั่งและให้ผู้ป่วยพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }
            else if (getstatus.equals(getstatus2)){

                val M1 = "07.00-08.00 น. ออกกำลังกาย เช่น เดินเร็ว ขยับแขนขา"
                val M2 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M3 = "09.00-10.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M4 = "10.00-11.00 น. ทำกายภาพบำบัดหรือออกกำลังกายเบาๆ"
                val M5 = "11.00-12.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M6 = "12.00-15.00 น. ให้ผู้ป่วยได้พักผ่อน"
                val M7 = "15.00-16.00 น. ทำกายภาพบำบัดหรือออกกำลังกายเบาๆ เช่น แอโรบิค ปั่นจักรยาน ขยับแขนขา"
                val M8 = "16.00-17.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M9 = "17.00-18.00 น. พาผู้ป่วยออกไปเดินเล่น เพื่อให้ผู้ป่วยผ่อนคลาย "
                val M10 = "18.00-19.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M11 = "19.00-21.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วยทำให้ผูป่วยรู้สึกผ่อนคลาย"
                val M12 = "22.00 น. รับประทานยาตามที่แพทย์สั่งและให้ผู้ป่วยพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }
            else if (getstatus.equals(getstatus3)){

                val M1 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M2 = "09.00-10.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M3 = "10.00-11.00 น. ทำกายภาพบำบัด พาผู้ป่วยออกกำลังกายเบาๆ"
                val M4 = "11.00-12.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M5 = "12.00-14.00 น. ให้ผู้ป่วยได้พักผ่อน "
                val M6 = "14.00-15.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พูดคุยให้กำลังใจ เข็นผู้ป่วยออกไปข้างนอกเพิ่อเปลี่ยนบรรยากาศ"
                val M7 = "15.00-16.00 น. ทำกายภาพบำบัด เช่น ยกแขนยกขาอย่างละไม่น้อยกว่า 30 นาที เพื่อให้ข้อต่อไม่ยึด"
                val M8 = "16.00-17.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม เพื่อให้ผู้ป่วยผ่อนคลาย"
                val M9 = "17.00-18.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M10 = "18.00-19.00 น. ให้ผู้ป่วยได้พักผ่อน "
                val M11 = "19.00-20.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พูดคุยให้กำลังใจ เข็นผู้ป่วยออกไปข้างนอกเพิ่อเปลี่ยนบรรยากาศ"
                val M12 = "22.00 น. รับประทานยาตามที่แพทย์สั่งและให้ผู้ป่วยพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }


        }
        else if (getsymptom.equals(checksymptom2)){

            if (getstatus.equals(getstatus1)){

                val M1 = "07.00-08.00 น. ออกกำลังกาย เช่น เดินเร็ว แกว่งแขน"
                val M2 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M3 = "09.00-11.00 น. ทำกิจวัตรประจำวันตามปกติ"
                val M4 = "11.00-12.00 น. หากิจกรรมทำเพื่อให้รู้สึกผ่อนคลาย"
                val M5 = "12.00-13.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M6 = "13.00-14.00 น. พาผู้ป่วยออกไปเดินเล่น เพื่อให้ผู้ป่วยผ่อนคลาย"
                val M7 = "14.00-16.00 น. ทำกิจวัตรประจำวันตามปกติ"
                val M8 = "16.00-17.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วย"
                val M9 = "17.00-18.00 น. ออกกำลังกาย เช่น เดินเร็ว โยคะ"
                val M10 = "18.00-19.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M11 = "19.00-21.00 น. หากิจกรรมทำเพื่อให้รู้สึกผ่อนคลาย"
                val M12 = "22.00 น. รับประทานยาที่แพทย์สั่งและให้ผู้ป่วยพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }
            else if (getstatus.equals(getstatus2)){

                val M1 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M2 = "09.00-10.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M3 = "10.00-11.00 น. ให้ผู้ป่วยฝึกใช้กล้ามเนื้อมือ เช่น เขียนหนังสือ"
                val M4 = "11.00-12.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M5 = "12.00-13.00 น. ทำกายภาพบำบัดตามที่แพทย์สั่ง"
                val M6 = "13.00-14.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M7 = "14.00-16.00 น. ทำกายภาพบำบัดหรือออกกำลังกายเบาๆตามที่แพทย์สั่ง"
                val M8 = "16.00-17.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M9 = "17.00-18.00 น. พาผู้ป่วยออกไปเดินเล่น เพื่อให้ผู้ป่วยผ่อนคลาย "
                val M10 = "18.00-19.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M11 = "19.00-20.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วยทำให้ผูป่วยรู้สึกผ่อนคลาย"
                val M12 = "21.00 น. รับประทานยาที่แพทย์สั่งแลให้ผู้ป่วยะพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }
            else if (getstatus.equals(getstatus3)){

                val M1 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M2 = "09.00-10.00 น. ให้ผู้ป่วยฝึกใช้กล้ามเนื้อมือ เช่น เขียนหนังสือ"
                val M3 = "10.00-11.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสมและดูแลผู้ป่วยอย่างใกล้ชิด"
                val M4 = "11.00-12.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่งและดูแลผู้ป่วยอย่างใกล้ชิด"
                val M5 = "12.00-13.00 น. ทำกายภาพบำบัดตามที่แพทย์สั่ง"
                val M6 = "13.00-14.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M7 = "14.00-16.00 น. ทำกายภาพบำบัดหรือออกกำลังกายเบาๆตามที่แพทย์สั่ง"
                val M8 = "16.00-17.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M9 = "17.00-18.00 น. พาผู้ป่วยออกไปเดินเล่น เพื่อให้ผู้ป่วยผ่อนคลาย "
                val M10 = "18.00-19.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M11 = "19.00-20.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วยทำให้ผูป่วยรู้สึกผ่อนคลาย"
                val M12 = "21.00 น. รับประทานยาที่แพทย์สั่งแลให้ผู้ป่วยะพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }

        }
        else if (getsymptom.equals(checksymptom3)){

            if (getstatus.equals(getstatus1)){

                val M1 = "07.00-08.00 น. ทำกายภาพบำบัด"
                val M2 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M3 = "09.00-10.00 น. ทำกิจวัตรประจำวันช่วยผู้ป่วย"
                val M4 = "10.00-12.00 น. ให้ผู้ป่วยฝึกใช้กล้ามเนื้อมือ เช่น เขียนหนังสือ"
                val M5 = "12.00-13.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M6 = "13.00-16.00 น. ทำกิจวัตรประจำวันช่วยผู้ป่วย"
                val M7 = "16.00-17.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วยทำให้ผูป่วยรู้สึกผ่อนคลาย"
                val M8 = "17.00-18.00 น. ทำกายภาพบำบัด"
                val M9 = "18.00-19.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M10 = "19.00-20.00 น. ทำกิจวัตรประจำวัน"
                val M11 = "20.00-21.00 น. หากิจกรรมทำเพื่อให้รู้สึกผ่อนคลาย"
                val M12 = "22.00 น. รับประทานยาที่แพทย์สั่งและให้ผู้ป่วยพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }
            else if (getstatus.equals(getstatus2)){

                val M1 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M2 = "09.00-10.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M3 = "10.00-11.00 น. ให้ผู้ป่วยฝึกใช้กล้ามเนื้อมือ เช่น เขียนหนังสือ"
                val M4 = "11.00-12.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M5 = "12.00-13.00 น. ทำกายภาพบำบัดตามที่แพทย์สั่ง"
                val M6 = "13.00-14.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M7 = "14.00-16.00 น. ทำกายภาพบำบัดหรือออกกำลังกายเบาๆตามที่แพทย์สั่ง"
                val M8 = "16.00-17.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M9 = "17.00-18.00 น. พาผู้ป่วยออกไปเดินเล่น เพื่อให้ผู้ป่วยผ่อนคลาย "
                val M10 = "18.00-19.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M11 = "19.00-20.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วยทำให้ผูป่วยรู้สึกผ่อนคลาย"
                val M12 = "21.00 น. รับประทานยาที่แพทย์สั่งแลให้ผู้ป่วยะพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }
            else if (getstatus.equals(getstatus3)){

                val M1 = "07.00-08.00 น. เปลี่ยนท่านอนให้ผู้ป่วย"
                val M2 = "08.00-09.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M3 = "09.00-10.00 น. ช่วยผู้ป่วยในอาบน้ำ จัดที่นั่งหรือนอนให้ผู้ป่วยอย่างเหมาะสม"
                val M4 = "10.00-12.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M5 = "12.00-15.00 น. ให้ผู้ป่วยได้พักผ่อน"
                val M6 = "15.00-16.00 น. ทำกายภาพบำบัดตามที่แพทย์สั่ง"
                val M7 = "16.00-17.00 น. ช่วยผู้ป่วยในการอาบน้ำ จัดที่นั่งหรือนอนให้เหมาะสม"
                val M8 = "17.00-18.00 น. รับประทานอาหาร + รับประทานยาตามที่แพทย์สั่ง"
                val M9 = "18.00-19.00 น. พาผู้ป่วยออกไปชมวิว เพื่อให้ผู้ป่วยผ่อนคลาย"
                val M10 = "19.00-20.00 น. หากิจกรรมและพาผู้ป่วยทำ เช่น พาผู้ป่วยดูหนัง ฟังเพลง พูดคุยกับผู้ป่วยทำให้ผู้ป่วยรู้สึกผ่อนคลาย"
                val M11 = "20.00-21.00 น. ทำกายภาพบำบัดตามที่แพทย์สั่ง"
                val M12 = "22.00 น. รับประทานยาที่แพทย์สั่งแลให้ผู้ป่วยะพักผ่อนให้เพียงพอ"

                Handler().postDelayed({
                    val intent = Intent(this,Notificate_OldActivity::class.java) //MainActivity NotificateActivity
                    intent.putExtra(M1M,M1)
                    intent.putExtra(M2M,M2)
                    intent.putExtra(M3M,M3)
                    intent.putExtra(M4M,M4)
                    intent.putExtra(M5M,M5)
                    intent.putExtra(M6M,M6)
                    intent.putExtra(M7M,M7)
                    intent.putExtra(M8M,M8)
                    intent.putExtra(M9M,M9)
                    intent.putExtra(M10M,M10)
                    intent.putExtra(M11M,M11)
                    intent.putExtra(M12M,M12)
                    intent.putExtra(Symptommmm,getsymptom)
                    intent.putExtra(statussss,getstatus)
                    startActivity(intent)
                },3500)

            }

        }











    }
    companion object{
        val Symptommmm = "Symptommmm"
        val statussss = "statussss"
        val M1M = "M1M"
        val M2M = "M2M"
        val M3M = "M3M"
        val M4M = "M4M"
        val M5M = "M5M"
        val M6M = "M6M"
        val M7M = "M7M"
        val M8M = "M8M"
        val M9M = "M9M"
        val M10M = "M10M"
        val M11M = "M11M"
        val M12M = "M12M"
    }
}
