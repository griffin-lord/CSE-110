import java.util.Scanner;
  public class buid{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int buid= sc.nextInt();
     int year = buid/1000000;
       if ( (buid/100000)%10 == 1){
        System.out.println("Student Joined BRAC in Spring"+year);
     }
     else if ( (buid/100000)%10 == 2){
       System.out.println("Student Joined BRAC in Fall"+year);
     }
     else{
       System.out.println("Student Joined BRAC in Summer"+year);
     }
   }
  }