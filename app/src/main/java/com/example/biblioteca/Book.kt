package com.example.biblioteca

class Book (
    val book_name:String,
    val isbn :Int,
    val publish_year:Int,
    val editorial:String,
    var pages_number:Int,
    var price:Double,
    val book_autor:String,
    var book_type: Boolean
){

    //3. Crear función “precioFormateado” de forma correcta.
    fun obtBookPrice():String{
        return "$book_name - Precio: $"+this.price

    }
    //transforma true a "fisico" y false a "digital"
    fun digOfis(book_type: Boolean):String{
        if (book_type==true){
            return "Fisico"
        };if (book_type==false){
            return "Digital"
        }else{
            return "No existe"
        }
    }
    //4. Crear función “imprimir” de forma correcta
    fun printBookDetails():String{
        return "Nombre: $book_name - ISBN: $isbn - Año Publicación: $publish_year - Editorial: $editorial - N°Paginas: $pages_number - Precio:$ $price - Autor: $book_autor - Tipo: ${digOfis(book_type)}"
    }

}