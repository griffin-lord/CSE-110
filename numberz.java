import java.util.Scanner;
  public class numberz{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int numb= sc.nextInt();
      if (numb<0){
     System.out.println("Number is negative");
      }
     else if (numb == 0){
     System.out.println("Number is zer0");
     }
      else if (numb>0 && numb%2 == 0){
       System.out.println("Number is positive and even");
     }
       else {
        System.out.println("Number is positive and odd");
    }
   }
 }