interface Test
{
    void square();
}
class Arthematic implements Test
{
    public void square()
    {
        System.out.println("The Sun always rises in easy and sets in west");
    }
}
class Totestint extends Arthematic
{
    public static void main(String[] args) 
    {
        Arthematic a = new Arthematic();
        a.square();    
        System.out.println("Bharat Anand");
        System.out.println("500083620");
    }
}
