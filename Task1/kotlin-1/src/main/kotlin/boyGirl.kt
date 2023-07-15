import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    val word = reader.next()
    var count = 1
    var res = ""
    val ch = word.toCharArray()
    Arrays.sort(ch)
    for (i in 1 until ch.size) if (ch[i - 1] != ch[i]) ++count
    res = if (count % 2 == 0) "CHAT WITH HER!" else "IGNORE HIM!"
    println(res)
}