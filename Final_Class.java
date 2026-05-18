final class Demo
{
    public void fun() 
    {
        System.out.println("Inside Demo Fun");
    }

    public void gun() 
    {
        System.out.println("Inside Demo Gun");
    }
}

class Hello extends Demo        // Error
{
    public void gun()
    {
        System.out.println("Inside HEllo Gun");
    }
}

class Final_Class
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
        Demo dobj = new Demo();     // Allowed

        
    }

}
