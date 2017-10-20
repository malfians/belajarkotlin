fun main(args: Array<String>) {
    var map = HashMap<Int, String>()
    map.put(1, "muhammad")
    map.put(2, "alfian")
    map.put(33, "saputra")
    println(map.get(33))

    map.put(33, "unisnu jepara")
    for (k in map.keys) {
    println(map.get(k))
  }
}