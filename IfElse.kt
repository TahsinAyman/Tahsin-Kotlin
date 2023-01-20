fun main() {
    var age: Int = Integer.valueOf(readLine());
    if (age > 18) {
        print("Welcome!");
    } else {
        print("Age Must Be greater then 18");
    }
    var message: String = if (age > 18) {
        "Welcome!";
    } else {
        "Age Must Be greater then 18";
    }
    print(message);
}