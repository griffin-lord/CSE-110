import java.util.Scanner;
  public class Gradecal{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int obtnum= sc.nextInt();
      if (obtnum>=90 && obtnum<=100){
     System.out.println("A");
      }
     else if (obtnum>=85 && obtnum<=89){
     System.out.println("A-");
     }
     else if (obtnum>=70 && obtnum<=84){
     System.out.println("B");
     }
       else if (obtnum>=57 && obtnum<=69){
     System.out.println("C");
       }
       else if (obtnum>=50 && obtnum<=56){
     System.out.println("D");
       }
      else{
       System.out.println("FAIL");
     }
   }
 }
      
       