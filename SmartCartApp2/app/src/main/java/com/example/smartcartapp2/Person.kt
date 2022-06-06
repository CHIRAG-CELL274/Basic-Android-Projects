package com.example.smartcartapp2

import java.security.acl.LastOwnerException

data class Person(
    var Product: String = "",  // We are giving default values so that app will not crash firstName
    var Quantity: Int=-1,  //lastName
    var Price: Int =-1 ,   //age
    var Code : Int = -1
)