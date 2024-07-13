import java.util.Scanner;
class Circle{
    public static void main (String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the radius: ");
    int radius=scanner.nextInt();
    float area=3.14f*radius*radius;
    System.out.println("Area of circle is"+ area);

    }
}