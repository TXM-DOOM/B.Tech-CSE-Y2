class Student
{
    int roll;
    Double marks;
    String name;
    Student()
    {
        System.out.println("constructor created");
    }
    void setData(int r,Double m,String n )
    {
        roll=r;
        marks=m;
        name=n;
    }
    void getData()
    {
        System.out.println("roll number is"+roll);
        System.out.println("marks are "+marks);
        System.out.println("name is "+name);
    }
}
class Getset
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.setData(101, 90.4, "Bharat");
        s1.getData();
        System.out.println("Bharat Anand \n500083620");  
    }
}

