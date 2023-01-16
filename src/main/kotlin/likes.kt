import java.util.*

fun main (){
    println("введите количество лайков ")
    val scanner = Scanner(System.`in`)
    val likes = scanner.nextInt()

    if (likes == 1 || likes % 10 == 1 || likes % 100 == 1 || likes % 1000 == 1 || likes % 10000 == 1){
        println ("понравилось " + likes + " человеку")
    } else println("понравилось " + likes + " людям")


}