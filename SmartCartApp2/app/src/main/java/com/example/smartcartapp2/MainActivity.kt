package com.example.smartcartapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import com.google.rpc.Code
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext


class MainActivity : AppCompatActivity() {

    private val personCollectionRef = Firebase.firestore.collection("Things") // here we are getting a reference with database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val btn:Button = findViewById(R.id.button)
        val btn2:Button = findViewById(R.id.button2)
      /*  val f:EditText = findViewById(R.id.first)
        val l:EditText = findViewById(R.id.last)
        val v: EditText = findViewById<EditText>(R.id.age) */


     /*  btn.setOnClickListener{   // To input data
            val firstName = f.text.toString()  //
            val lastName = l.text.toString().toInt()  //
            val age = v.text.toString().toInt()  //
            val person = Person(firstName, lastName, age)
            savePerson(person)

        } */

        btn2.setOnClickListener{
            retrievePersons()
        }
    }

    private fun retrievePersons() = CoroutineScope(Dispatchers.IO).launch {
        val v: EditText = findViewById<EditText>(R.id.age)
        val code = v.text.toString().toInt()
        try{
            val g: TextView = findViewById<TextView>(R.id.tvPersons)
            val querySnapshot = personCollectionRef
                .whereEqualTo("Code",code)       //to retrieve a particular data   //  .whereGreaterThan("Code",v)
                                                          // .whereLessThan("Code",v)
                                                          //.orderBy("Code")
                .get()
                .await()// Here we are getting all the documents from firebase
            val sb =  StringBuilder()
            for(document in querySnapshot.documents)
            {
               // main write the code here
                val Groceries = document.toObject<Person>() // We are getting the document and we are converting it to our data class
                sb.append("$Groceries\n")
            }
            withContext(Dispatchers.Main){
                g.text = sb.toString()
            }

        } catch (e:Exception){
            withContext(Dispatchers.Main){
                Toast.makeText(this@MainActivity,e.message,Toast.LENGTH_LONG).show()
            }


        }
    }

   /* private fun savePerson(person: Person) = CoroutineScope(Dispatchers.IO).launch {
        try {
            personCollectionRef.add(person).await()
            withContext(Dispatchers.Main) {

                Toast.makeText(this@MainActivity, "Successfully saved data", Toast.LENGTH_LONG)
                    .show()
            }

        } catch (e: Exception){
            withContext(Dispatchers.Main){
                Toast.makeText(this@MainActivity,e.message,Toast.LENGTH_LONG).show()
            }
        }*/
    }

