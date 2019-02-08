package pertemuan2

import pertemuan1.a

/*
LIST = kumpulan data yang sejenis dengan array namun lebih dinamis(bisa melakukan penambahan,perubahan dan penghapusan data*/
fun main(args: Array<String>) {
    println("List Angka : $listAngka")
    println("List pertama : ${listAngka.get(1)}")
    println("list pertama = ${listAngka[1]}")
    println("List Dinamis: $listDinamis")
    listDinamis.add("x")
    println("List Dinamis: $listDinamis")
    listDinamis.remove("a") //case sensitif
    listDinamis.addAll(listNama) //menambahan list ke list
    listDinamis.set(1,"tester") //manipulasi
    println("List Dinamis: $listDinamis")

    //list convert array
   val list = listDinamis.toTypedArray();
    listDinamis.replaceAll {
       return@replaceAll if (it == "tester"){
           "xy"
       }else{
           it
       }
    }
    println("List Dinamis after replace: $listDinamis")
}

val listAngka = listOf<Int>(1,2,2)
val listNama = listOf("tester", "ok", "test")
val listDinamis = mutableListOf("a", "b", "c", "d") //list dinamis


