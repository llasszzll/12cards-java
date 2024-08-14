package tutorials.basic;

public class Scope {
    // x is declared outside of the method
    // any method can access x
    static int x; // declaring variable X

    public static void main(String[] args) {
        x = 5; // assigning a value to x
        System.out.println(x);

        doSomething();

        System.out.println(x);
    }

    static void doSomething() {
        x = 10;
    }

    static void doSomethingLocally() {
        // Y is declared inside of the method, it is local to the method
        // no method can access Y
        int y = 100;
    }

}
