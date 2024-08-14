package tutorials.basic;

public class Methods {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorld();
        sayHelloWorld();

        sayHello2("Josh");
        sayHello2("Jack");

        int x = returnFive();

        System.out.println(x);

        // f(i) = i * i
    int result = square(returnFive());

        System.out.println(result);

    }
    static int square(int x) {
        return x * x;
    }

    // Method return INT type with value of 5
    static int returnFive() {
        return 5;
    }

    static void sayHello2(String name) {
        System.out.println("Hello, " + name);
    }

    static void sayHelloWorld() {
        System.out.println("Hello World");

    }
}
