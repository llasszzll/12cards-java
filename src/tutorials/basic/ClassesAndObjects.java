package tutorials.basic;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person scot = new Person("Scot");
        scot.setAge(28);
        Person tammy = new Person("Tammy");
        tammy.setAge(26);

        scot.sayHelloTo(tammy);
        tammy.sayHelloTo((scot));

        System.out.println(scot.getName() + " is "+ scot.getAge() + " years old.");
        System.out.println(tammy.getName() + " is " + tammy.getAge() + " years old.");
    }
}

// classes are blueprints
