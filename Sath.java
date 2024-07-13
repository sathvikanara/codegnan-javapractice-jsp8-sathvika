
import java.util.Scanner;
class Sath{
    public static void main (String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the base: ");
    int base = scanner.nextInt ();
    System.out.println("enter the height:");
    int height=scanner.nextInt();
    float area=0.5f*base*height;
    System.out.println("Area of triangle is"+ area);

    }
}