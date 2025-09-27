import kotlin.random.Random
fun main() {
    val chislo = Random.nextInt(1, 50)
    println("Угадайте число от 1 до 50")
    while (true) {
        print("Введите число: ")
        val input = readln().toInt()
        when {
            input > chislo -> println("число меньше")
            input < chislo -> println("число больше")
            else -> {
                println("Вы угадали число: $chislo")
                break
            }
        }
    }
}