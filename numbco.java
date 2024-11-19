import java.util.Scanner;
  public class numbco{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
        int amou = sc.nextInt();
        int gave = sc.nextInt();
        int ret = (gave - amou);
        int esult = ret ;
        int taka100, taka50, taka20, taka10, con5, con2, con1;
        taka100 = taka50 = taka20 = taka10 = con5 = con2 = con1 = 0;
        if (ret > 0) {
            if (ret >= 100) {
                taka100 = ret / 100;
                ret = ret - (100 * taka100);
            }
            if (ret >= 50) {
                taka50 = 1;
                ret = ret - 50;
            }
            if (ret >= 20) {
                taka20 = ret / 20;
                ret = ret - (20 * taka20);
            }
            if (ret >= 10) {
                taka10 = ret / 10;
                ret = ret - (10 * taka10);
            }
            if (ret  >= 5) {
                con5 = 1;
                ret = ret  - 5;
            }
            if (ret  >= 2) {
                con2 = ret  / 2;
                ret  = ret  - (2 * con2);
            }
            if (ret  == 1) {
                con1 = 1;
            }
            System.out.println("The returned amount is " + esult);
            System.out.println("100 taka note: " + taka100);
            System.out.println("50 taka note: " + taka50);
            System.out.println("20 taka note: " + taka20);
            System.out.println("10 taka note: " + taka10);
            System.out.println("5 taka coin: " + con5);
            System.out.println("2 taka coin: " + con2);
            System.out.println("1 taka coin: " + con1);
        } else {
            ret = -ret ;
            System.out.println("Please pay " + ret  + " more.");
        }
    }
}