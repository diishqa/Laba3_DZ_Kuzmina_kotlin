import kotlin.random.Random
fun password():String{
    val sym="!@#$%^&/?ЁЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮёйцукенгшщзхъфывапролджэячсмитьбю1234567890"
    val p=Random.nextInt(8, 16)
    var op=""
    var i=0
    while (i<p){
        op+=sym.random()
        i++
    }
    return op

}
fun main() {
    println("Пароль: ${password()}")
}