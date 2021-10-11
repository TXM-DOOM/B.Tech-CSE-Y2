interface MD
{
    public void division(int n,int m);
    public void moudules(int a , int b);

}
class Calc implements MD
{   
    public void division(int n, int m)
    {
        System.out.println("Division:" +(n/m));
    }
    public void moudules(int a,int b)
    {
        System.out.println("Mod:"+(a%b));
    }
    public static void main(String[] args) 
    {
        Calc c = new Calc();    
        c.division(40,6);
        c.moudules(70,4);
        System.out.print("Bharat Anand\n500083620");
    }
}
