package tutorials.basic;

public class Constants {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final Person P1 = new Person("");
    public static final int NUM_ENEMIES = 5;

    public static void main(String[] args) {

        // constants never change once a value is assigned
        // usually static
        // Uppercase by convention
        // declare constants by using "FINAL" modifier
        // constants can be public as there is no harm accessing variables if you cant alter it

        System.out.println(WIDTH);
        System.out.println(Math.PI);
    }
}
