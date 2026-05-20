interface circle
{
    // Characteristics  (public static final)
    float PI = 3.14f;       

    // Behaviors    (public abstract)
    float area(float Radius);
    float circumference(float Radius);

}

class Marvellous implements circle
{
    // error due to missing body of area and circumfernce
}

class DemoInterfaceMethod
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
    }
}