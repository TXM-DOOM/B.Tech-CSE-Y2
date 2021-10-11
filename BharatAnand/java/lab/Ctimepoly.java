class prod 
{
    int multiply(int a, int b)
    {
        return a*b;
    }
    double multiply(double a, double b)
    {
        return a*b;
    }

}
class Ctimepoly
{
    public static void main(String args[])
    {
    prod pd=new prod();
    System.out.println(pd.multiply(7,8));
    System.out.println(pd.multiply(5.5, 6.4));
    System.out.println("\nBharat Anand");
        System.out.println("500083620");
}
}