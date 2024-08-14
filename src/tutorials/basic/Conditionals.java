package tutorials.basic;

public class Conditionals {
    public static void main(String[] args) {

        // if (some expression that evalute to true)
            // Do something

        boolean sayHello = false;
        boolean sayHey = true;

        if(sayHello) {
            System.out.println("Hello");
        } else if (sayHey){
            System.out.println("Hey");
        } else {
            System.out.println("Goodbye");
        }

        // < , > , >=, <=, !==, ==  (relational operator)
//        if(5 > 10);
//        if(10 < 5);

        // if(x = 5) assign 5 to x
        // if(x == 5) test if x has the value of 5 (will be boolean)
        // AND = &&
        // OR ||

        int playerX = 50;



        if (true && true) {
            System.out.println("AND executed");
        }

        // if player past the left side, or if player is pasty right side
        if (playerX < 0 || playerX > 800) {
            // reverse player direction
            System.out.println("OR executed");
        }
    }
}
