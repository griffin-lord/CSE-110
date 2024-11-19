import java.util.Scanner;
  public class trianglecou{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    double aio = sc.nextDouble();
    double bio = sc.nextDouble();
    double cio = sc.nextDouble();
    if (aio==bio && bio==cio && aio==cio ){
     System.out.println("This is a Equilateral triangle");
      }
      else if (aio==bio){
       System.out.println("This is a Isosceles triangle");
     }
      else if (bio==cio){
        System.out.println("This is a Isosceles triangle");
      }
       else {
        System.out.println("This is a Scalene triangle");
    }
   }
 }