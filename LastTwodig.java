import java.util.Scanner;
public class LastTwodig{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int LastTWOdigits= num%100;
        System.out.println("Last 2 Digits: " +LastTWOdigits);
    }
}
        