import java.util.Scanner;
  public class numbercou{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    double nx = sc.nextDouble();
    double ny = sc.nextDouble();
    double nz = sc.nextDouble();
      double max = Math.max(nx, Math.max(ny,nz));
      double min = Math.min(nx, Math.min(ny, nz));
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
   }
 }