public class hexagon{
  public static void main(String[]args){
   double a=4.5;
   double b=9.5;
   double c= (Math.sqrt(a)+Math.sqrt(b));;
      System.out.println("The value of C: " +c);
      double sinA=a/c;
      System.out.println("The value of sin(A): " +sinA);
      double sinB=b/c;
      System.out.println("The value of sin(B): " +sinB);
      double cosA=b/c;
      System.out.println("The value of cos(A): " +cosA);
      double cosb=a/c;
      System.out.println("The value of cos(B): " +cosb);
  }
}