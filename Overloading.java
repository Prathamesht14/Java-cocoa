class Overloading {
    public static void main(String A[]) {
        Demo dobj = new Demo();

        System.out.println(dobj.Addition(10, 11));
        System.out.println(dobj.Addition(10.29, 11.29));
        System.out.println(dobj.Addition(10.3f, 11.3f));
    }
}

class Demo {
    public int Addition(int A, int B) // Adition@2ii
    {
        return A + B;
    }

    public double Addition(double A, double B) // Adition@2dd
    {
        return A + B;
    }

    public float Addition(float A, float B, float C) // Adition@3fff
    {
        return A + B + C;
    }
}