import kotlin.random.Random
fun main(){
    var sum=Random.nextInt(100, 1000)
    while(true){
        var minsum=Random.nextInt(10, 100)
        println(sum)
        sum-=minsum
        if (sum<=0){
            println("Деньги закончились :(")
            break
        }
    }
}