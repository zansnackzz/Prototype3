package com.example.prototype3

import android.widget.RadioButton

class sentToDbpatient(
    val id: String, val name: String, val lastname: String, val bd: String, val address: String,val namecare: String
    ,val tel: String, val geldle:String, val age: String, val imageuurl: String){
    constructor() : this("","","","","","","","","","")
}