import java.util.Scanner;
public class Task01{
  public static void main (String[]args){
    Scanner sc= new Scanner (System.in);
     int numb = sc.nextInt();
       
     for (int i=0; i>=1; i--){
       System.out.println(" ");
     }
     for (int j=1;j<=numb;j++){
       System.out.println(j);
     }
  }
}