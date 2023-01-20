import java.util.Scanner;

fun main() {
    print("Name: ");
    var name = readLine(); // Input
    print("Age: ");
    val scanner: Scanner = Scanner(System.`in`);
    var age = scanner.nextInt();
    print(String.format("Name: %s, Age: %d", name, age))
    
}