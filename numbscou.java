import java.util.Scanner;
  public class numbscou{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int numbsa = sc.nextInt();
    int numbsb = sc.nextInt();
    int numbsc= sc.nextInt();
    if (numbsa==numbsb && numbsb==numbsc && numbsa==numbsc ){
     System.out.println("All of them are equal");
      }
      else if (numbsa==numbsb){
       System.out.println("Neither all are equal or different");
     }
      else if (numbsb==numbsc){
        System.out.println("Neither all are equal or different");
      }
       else {
        System.out.println("None of the are equal or different");
    }
   }
 }