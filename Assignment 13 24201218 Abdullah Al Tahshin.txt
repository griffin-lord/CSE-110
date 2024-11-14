import java.util.Scanner;
public class convmeter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double inch = 0.0254;
        int givenavalue=100;
        double convmeter= inch * givenavalue;
        System.out.println("Converted to Meters: " +convmeter);
    }
}
        