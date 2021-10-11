interface A 
{
    void meth1();
    void meth2();
}
class Myclass implements A
{
    public void meth1()
    {
        int c =80,d=90;
        System.out.println("Sum:"+(c+d));
    }
    public void meth2()
    {
        int a=10,b=15;
        System.out.println("Product:"+(a*b));
    }
public static void main(String[] args) 
 {
    Myclass m = new Myclass();
    m.meth1();
    m.meth2();
    System.out.print("Bharat Anand\n500083620");
}
}
