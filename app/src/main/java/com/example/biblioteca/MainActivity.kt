package com.example.biblioteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaracion de variables
        var libro1=Book("El principito",110,1994,"Nomade",120,10300.0,"Fernando Morales", true)
        var libro2=Book("Romeo y Julieta",120,1678,"Nomade",432,23450.0,"Shakespeare",true) //hacer clase con dos opciones???
        var libro3=Book("Batman y Robin",130,1999,"Marvel",34,6990.0,"Stan Lee", false)

        //Inmutable
        val libro4 = Book("El Quijote",140,1877,"Nomade",544,25990.0,"Cervantes",true)

        //Esto entrega el precio del libro
        libro1.obtBookPrice().toLogd()

        //Esto imprime toda la informacion del libro
        libro1.printBookDetails().toLogd()
        libro2.printBookDetails().toLogd()
        libro3.printBookDetails().toLogd()
        libro4.printBookDetails().toLogd()

    }
}