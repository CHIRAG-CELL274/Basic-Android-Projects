package com.example.listview

import kotlin.random.Random

class Fruits (val name:String,val origin:String,val quantity:Int) {
    object ge {

        val Fruitnames = arrayOf("MANGO", "APPLE", "Orange")
        val Fruitorigin = arrayOf("ROURKELA", "CUTTACK", "KORAPUT")

        fun getrandomfruits(n: Int): ArrayList<Fruits> {
            val fruitarray = ArrayList<Fruits>(n)

            for (i in 1..n) {
                fruitarray.add(
                    Fruits(
                        Fruitnames[Random.nextInt(3)],
                        Fruitorigin[Random.nextInt(3)],
                        Random.nextInt(10) * 100


                    )
                )

            }

            return fruitarray


        }
    }
}