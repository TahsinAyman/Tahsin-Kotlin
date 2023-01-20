fun main() {
    var number: Int = Integer.valueOf(readLine());
    var string: String = when(number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Invalid Number"
    }
    print(string);
}