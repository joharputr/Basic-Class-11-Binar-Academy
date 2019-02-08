package pertemuan2
import java.util.*

fun main(args: Array<String>) {
    val arrayOfInt = arrayOf(1, 3, 2, 2, 2)
    val arrayOfString = arrayOf("test", "aa", "cc")
    val arrayOfboolean = arrayOf(true, false, true)
    println(arrayOfInt[2])
    println("array angka " + Arrays.toString(arrayOfboolean))
    arrayOfString[1] = "upin" //manipulasi array
    //aray tidak bisa menambahkan data seperti arrayOfString[30] = "sssd""
    println("jumlah semua data : ${arrayOfInt.size} data")
    println(arrayOfString[1])
    //perulangan array kotlin
    arrayOfString.forEach {
        println("nama :$it")
    }
    //menampilkan dengan indeks
    arrayOfString.forEachIndexed { index, s ->
        println("nama ke-$index : "+s)
    }
    //ambil data pertama
    println("Data pertama dari nama :"+arrayOfString.first())
    //ambil data terakhir
    println("data terakhir dari nama :"+arrayOfString.last())

    //convert array to list

    val arrayNama = arrayOfString.toList()
    println(arrayNama)
    val array2d = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    println("nampilin angka 4 : ${array2d[1][0]}") //baris kolom
}
