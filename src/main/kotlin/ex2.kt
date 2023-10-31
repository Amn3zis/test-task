fun main() {
    println("Введите строку")
    val inputString = readLine()

    if (inputString != null) {
        val words = inputString.split(" ")
        val finalWords = words.filter { it.startsWith("а", ignoreCase = true) && it.length > 3 }

        if (finalWords.isNotEmpty()) {
            println("Все слова, начинающиеся на 'a' и имеющие длину более 3 символов:")
            for (word in finalWords) {
                println(word)
            }
        } else {
            println("Слов, начинающихся на 'a' и имеющих длину более 3 символов не найдено.")
        }
    }
}
