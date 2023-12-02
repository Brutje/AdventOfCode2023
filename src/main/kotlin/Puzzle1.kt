import java.util.stream.Collectors

//https://adventofcode.com/2023/day/1
fun main(args: Array<String>) {
    var input = getResourceAsText("inputPuzzle1.txt");
    var sum = input?.split("\r\n")
            ?.stream()
            ?.map { line -> getFirstAndLastDigitAsSConcatenationFromString(line) }
            ?.collect(Collectors.toList())
            ?.sum();

    println(sum);

}

fun getResourceAsText(path: String): String? = object {}.javaClass.getResource(path)?.readText();

fun getFirstAndLastDigitAsSConcatenationFromString(line: String): Int {
    var firstNumber = line.find { c: Char -> c.isDigit() }
    var lastNumber = line.findLast { c: Char -> c.isDigit() }

    return (firstNumber.toString() + lastNumber.toString()).toInt()
}


