import java.util.Scanner;
  public class numberzer{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();
      if (x<0){
     System.out.println("out:"+2*x);
      }
     else if ( x>=0 && x<2){
     System.out.println("out:"+(x+1));
     }
      else if (x>=2 && x<5){
       System.out.println("out:"+((x*x)-1));
     }
       else {
        System.out.println("out:"+(3*(x*x)+2));
    }
   }
 }