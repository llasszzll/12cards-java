package tutorials.basic;

public class Arrays {
    public static void main(String[] args) {
        int x; // creating a box in memory that can store 1 INT value

        int [] myArray; // declaring array that will store INT's

        // myArray = new int[50000]; // initializing array to hold 50000 INT's
        myArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        /*
        x = 5;

        myArray[0] = x;
        myArray[1] = 4;
        myArray[2] = 3;
        myArray[3] = 2;
        */


//        for (int counter = 0; counter < 50000; counter++) {
//            myArray[counter] = counter;
//        }


        // iterating over an array
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }

        for (int number : myArray) {
            System.out.println(number);
        }
    }
}
