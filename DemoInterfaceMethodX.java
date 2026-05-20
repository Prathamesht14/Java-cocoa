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
    public float area(float Radius)
    {
        return circle.PI* Radius*Radius;
    }
    public float circumference(float Radius)
    {
        return 2*circle.PI*Radius;
    }
}

class DemoInterfaceMethodX
{
    public static void main(String A[])
    {
       //  circle cobj = new circle();              - Not Allowed 
       
        Marvellous mobj = new Marvellous();
        float ret = 0.0f;

        ret = mobj.area(10.5f);
        System.out.println("Area is : "+ret);

        ret = mobj.circumference(10.5f);
        System.out.println("Circumeference is : "+ret);
    }
}