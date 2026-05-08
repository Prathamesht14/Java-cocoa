
class MainThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside Main Method");

        Thread tobj = Thread.currentThread();

        String name = tobj.getName();

        System.out.println("Name of Current Thread: "+name);

        System.err.println("Priority of Thread is : "+tobj.getPriority());
    }
}
