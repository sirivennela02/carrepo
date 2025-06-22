public class ClassA
{
    public void meth1()
    {
        System.out.println("meth1() called");
        new ClassA(1000);
    }
    public ClassA ()
    {
        System.out.println("classA Non-parameterized constructor");
        new ClassA(100);
    }
    public ClassA (int x)
    {
        System.out.println("classA parameterized constructor :"+x);
    }
    public static void main(String[] args)
    {
        ClassA aobj = new ClassA();
        aobj.meth1();
        new ClassA(500);
        new ClassA(10).meth1();
    }
}