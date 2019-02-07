fun main(args: Array<String>){
    println("nama = "+nama)
    //fun2(); //hasil kosong
 //   println(fun2())
    jumlah2(4,2)

}
val  nama: String ="test" //final static
var angka:Int = 1; //dinamic, memory lebih besar
//void
fun fun1(){
}
fun  fun2(): String{
    return "tester"
}
//any = semua tipe data
fun jumlah(x:Int, y:Int){
    val hasil = x.plus(y)
    //kalau ingin merubah nilai seperti
    // hasil = 0;
    // maka pakai var
    println("hasil $x + $y = $hasil")
}
fun jumlah1 (x:Any, y:Int){
    if (x is Int){
        print("hasil ${x.plus(y)}")
    }
}
//contoh extension function
fun jumlah2(x:Int, y:Int){
    val hasil = x.tambah(y)
    println("hasil $x / $y = $hasil")
}
//extension function jangan dibungkus kelas(top level)
 fun Int.tambah(y: Int): Any {
return this/y
}
