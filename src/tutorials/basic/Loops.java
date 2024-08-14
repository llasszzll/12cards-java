package tutorials.basic;

public class Loops {
    public static void main(String[] args) {

        //whileLoop();
        // doWhile();
        forLoop();

    }
    static void whileLoop() {
        int counter = 0;
        while (counter < 10) {
            counter = counter + 1;
            System.out.println(counter);
        }
    }

    static void doWhile() {
        int counter = 0;
        do{
            counter = counter + 1;
            System.out.println(counter);
        } while(counter < 10);
    }

    static void forLoop() {
        // FOR LOOP
        // initialize counter
        // condition to see if we should run the loop
        // change counter variable
        for(int counter = 1; counter <= 10; counter = counter +1) {
            System.out.println(counter);
        }
    }
}
