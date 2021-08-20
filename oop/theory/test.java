public class test {
    class Student
{
   private String name, city;
   private int age;
   public void getData(String x, String 
   y, int t)
   {
      name=x;
      city=y;
      age=t;
   }
   public void printData()
   {
       
    System.out.println("Student name = " + name);
    System.out.println("Student city = " + city);
    System.out.println("Student age = " + age);
   }
}
class Cs
{
  public static void main(String args[])
  {
      Student s1=new Student();
      Student s2=new Student();
	S2.getData(“Kapil”,”Delhi”,23);
	S2.printData();
	s1.getData(“Amit”,”Dehradun”,22);
	s1.printData();
  }
}

}
