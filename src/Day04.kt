import java.io.File

private val menuData = File("data/tavern-menu-data.txt").readText().split("\n")
fun main() {
    var i = 0
    var count = 0
    while (i in menuData.indices) {
        val crrData = menuData[i++].replace("-", ",").split(",")
        if (crrData[0] <= crrData[2] && crrData[1] >= crrData[3]) {
            count++
        }
        else if (crrData[0] >= crrData[2] && crrData[1] >= crrData[3]) {
            count++
        }
    }
    println(count)
}
