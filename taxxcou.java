import java.util.Scanner;
  public class taxxcou{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int salary= sc.nextInt();
    int age=sc.nextInt();
       if ( salary<10000){
        System.out.println("LUCKY! NO TAXX");
     }
     else if ( salary>=10000 && salary<=20000 && age>18){
       System.out.println("Your tax amounts is:" +(salary*0.05)+ "TK");
     }
     else if (salary>20000 && age>18){
       System.out.println("Your tax amounts is:" +(salary*0.1)+ "TK");
          }
     else{
       System.out.println("LUCKY! NO TAXX");
     }
   }
  }