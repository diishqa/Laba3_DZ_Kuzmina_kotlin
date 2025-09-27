import kotlin.random.Random
fun main(){
    val a=Random.nextInt(0, 6)
    val b=Random.nextInt(0, 6)
    val c=Random.nextInt(0, 6)
    println("$a, $b, $c")
    if (a==b && b==c){
        println("Джекпот")
    }


}