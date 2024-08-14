package tutorials.basic;

public class AccessModifiers {

    // private is the most restrictive
    // default
    // protected
    // public

    private int x;
    public int y;


    public static void main(String[] args) {

    }
    // public visibility can be accessed from anywhere
    public void doSomethingPublic(){

    }

    // private visibility cannot be accessed anywhere besides this class
    private void doSomethingPrivate(){

    }

    // Protected visibility can only be accessed inside of this package and sub classes of this class
    protected void doSomethingProtected(){

    }

    // default visibility, can only be accessed inside of this package
    void doSomething () {

    }
}
