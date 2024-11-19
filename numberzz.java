import java.util.Scanner;
  public class numberzz{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int numb= sc.nextInt();
      if (numb%4 == 0){
     System.out.println("Leap year");
      }
      else if (numb%100 == 0 && numb%400 == 0){
       System.out.println("Leap year");
     }
       else {
        System.out.println("Not a leap year");
    }
   }
 }