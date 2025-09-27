import kotlin.random.Random
fun main(){
    val days=listOf( "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    for (i in days){
        val temp=Random.nextInt(-10, 31)
        if (temp<0){
            println("$i: $temp°C")
        }

    }
}