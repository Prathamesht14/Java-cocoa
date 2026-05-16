import java.util.*;

class ArrayIndex
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int arr[] = {11,21,51,101,111};

        System.out.println("Enter the index of Array: ");
        int index = sobj.nextInt();

        System.out.println("Element at that index is :"+arr[index]);

        System.out.println("End of Application");
       
    }
}
