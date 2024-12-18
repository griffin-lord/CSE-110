import java.util.Scanner;
public class blimeyplunder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wrod = sc.nextLine();
        int vowcow=0;
        int concow=0;
        for (int i=0; i<wrod.length(); i++){
          char ch = wrod.charAt(i);
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch ==  'O'|| ch == 'O' ){
            vowcow++;
          }
          else{
            concow++;
          }
        }
          if ( vowcow % 3 == 0 || concow%5 == 0 ){
               System.out.println("Aaarr! Me Plunder!!");
             }
          else{
               System.out.println("Blimey! No Plunder!!");
             }
    }
}
