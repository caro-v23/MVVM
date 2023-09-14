package com.example.mymvvm.models

class User{
    var email:String=""
    var pass:String=""

    var userid:String=""


    constructor(email:String,pass:String,confirmpass:String,userid:String){
        this.email=email
        this.pass=pass

        this.userid=userid
    }
    constructor()
}
