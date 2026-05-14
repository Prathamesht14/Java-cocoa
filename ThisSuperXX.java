class Base
{
    public int i;

    public Base()
    {
        System.out.println("Inside Base Constructor");
        this.i = 11;
    }

    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base
{
    public int i;

    public Derived()
    {
        System.out.println("Inside Derived Constructor");
        this.i = 21;
    }

    public void gun()
    {
        System.out.println("Inside gun of Derived");
        System.out.println("Value of i: "+i);
        System.out.println("Value of i from base: "+super.i);
    }
}

class ThisSuperXX
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.gun();
        

    }
}

// Compile -> javac Single.java
// run -> java Single

// Compile + run -> java Single.java