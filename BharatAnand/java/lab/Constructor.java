public class Constructor
{
    public static void main(String[] args) {
        Box B1 = new Box(20 , 40 , 60);
        Box B2 = new Box(20 , 40);

        int  ar = B2.area();
        int vol = B1.vol(); 
        System.out.println("\nBharat Anand");
        System.out.println("500083620");
        System.out.println("Area = " + ar);
        System.out.println("Volume = " + vol);
    }
}

class Box {

    int len, bre , hei;

    Box(int a, int b, int c) {
        len = a;
        bre = b;
        hei = c;
    }

    Box(int a, int b){
        len = a;
        bre= b;
    }

    int area(){
       int ar = len * bre;
       return ar;
    }

    int vol(){
        int vol = len * bre * hei;
        return vol;
    }
    
}
