public class Main{
    public static void main(String[] args) {
        int N=4;
        int y = 0;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
            y -= sum;
        }
        System.out.println(y);
    }
}
