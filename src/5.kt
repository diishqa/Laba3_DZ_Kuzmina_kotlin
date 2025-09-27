import kotlin.random.Random
fun main(){
    print("Введите ваше имя: ")
    val name=readln()
    print("Какой ваш любимый цвет?: ")
    val color=readln()
    print("Какая музыка вам нравится?: ")
    val music=readln()
    val otz=listOf("Ты крутой!", "Хорошая работа!", "Отлично получилось!", "Ты молодец!", "Супер!")
    var rand=otz.random()
    println(name)
    println(color)
    println(music)
    println(rand)
}