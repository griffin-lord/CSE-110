import java.util.Scanner;
public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0;i<num;i++) {
            int X=4;
            int y = 5;
            int summe= 0;
            int counte = 0;
            int curre = X;
            while (counte<y) {
                if (curre%2!=0) {
                    summe+= curre;
                    counte++;
                }
                curre++;
            }
            System.out.println("The sum oh the first " +y+ "odd numbers starting from" +X+ " is:" +summe);
        }
    }
}
