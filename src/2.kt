fun countVowels(str: String): Int{
    var col=0
    val stok="аеёиоуыэюя"
    for (i in str){
        if (i in stok){
            col++
        }
    }
    return col
}


fun main(){
    println("Введите строку")
    val stroca=readLine().toString()
    println("Гласные ${countVowels(stroca)}")

}