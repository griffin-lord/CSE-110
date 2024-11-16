import java.util.Scanner;
  public class MANN{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int xi= sc.nextInt();
    int yi= sc.nextInt();
    int zi= sc.nextInt();
      if (xi>yi && xi>zi){
     System.out.println("X is the largest");
      }
     else if (yi>zi && yi>xi){
     System.out.println("Y is the largest");
     }
      else {
       System.out.println("Z is the largest");
     }
   }
 }
      
       