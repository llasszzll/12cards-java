package tutorials.basic;

public class ReferenceAndValueTypes {
    public static void main(String[] args) {
        // byte, short, int, long, float, double, boolean, char

        int x = 5;
        addOneTo(x); // passing a value type, pass a copy of value of x, which is 5

        System.out.println(x);

        Person john;
        john = new Person("John");  // creating new person object, assigning john to refer to it
        john.setAge(25);
        celebrateBirthday(john); // passing the reference to the method

        System.out.println(john.getAge());
    }

    private static void celebrateBirthday(Person john) {
        john.setAge(john.getAge() + 1);
    }

    static void addOneTo(int number) {
        number = number +1;
    }
}
