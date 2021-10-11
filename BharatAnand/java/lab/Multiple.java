interface n1{
    int  area=60;
    public void breadth();
}

interface n2{
    int breadth=48;
    public void area();
}

class rectangle  implements n1,n2
{
    int area;
    int length =30;
    public void area()
    {
        area=length*breadth; 
        System.out.println("Area:"+area);
    }
    public void breadth()
    {
        int breadth=area/length;
        System.out.println("Breadth:"+breadth);
    }
}

class Multiple extends rectangle
{
    public static void main(String args[]){
        rectangle c =new rectangle();
        c.area();
        c.breadth();
        System.out.println("Bharat Anandn500083620");
    }
}
