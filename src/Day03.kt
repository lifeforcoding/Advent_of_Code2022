import java.io.File
val menuData = File("data/tavern-menu-data.txt").readText().split("\n")
private var ans : Long = 0
fun main() {
    menuData.forEach {
        val set1: Set<Char> = it.substring(0, (it.length / 2)).toMutableList().toMutableSet()
    val set2: Set<Char> = it.substring(it.length / 2, it.length).toMutableList().toMutableSet()
    set2.forEach { data ->
        if (set1.contains(data))
            ans += process(data)
    }
}
    println(ans)
}
fun process(key:Char) : Int {
    return if (key.isLowerCase())
        (key.code - 'a'.code) + 1
    else (key.code - 'A'.code) + 27
}


//Part 2
fun main() {
    var i = 0
    while (i < menuData.size) {
        val set1: Set<Char> = menuData[i++].toMutableList().toMutableSet()
    val set2: Set<Char> = menuData[i++].toMutableList().toMutableSet()
        val set3: Set<Char> = menuData[i++].toMutableList().toMutableSet()
    set3.forEach { data ->
        if (set1.contains(data) && set2.contains(data))
            ans += process(data)
    }
}
    println(ans)
}
