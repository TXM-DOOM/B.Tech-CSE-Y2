class promo 
{
    void sum(int x, double y)
    {
        System.out.println(x+y);
    }
    void sum(int x, double y, int z)
    {
        System.out.println(x+y+z);
    }
    public static void main(String[] args)
    {
        promo s = new promo();
        s.sum(70, 40);
        s.sum(80, 300, 403);
        System.out.println("Bharat Anand \n500083620");
    }
}