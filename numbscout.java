import java.util.Scanner;
  public class numbscout{
   public static void main(String[]args ){
   Scanner sc = new Scanner(System.in);
    int amou = sc.nextInt();
    int gave = sc.nextInt();
    int count1=0;
    if (amou == gave){
     System.out.println("The returned amount is 0 taka.");
      }
      if (amou > gave ){
       System.out.println("Please pay"+(amou-gave)+"TK");
     }
      if(amou < gave){
         int retu=(gave-amou);
        System.out.println("Please pay"+(gave-amou)+"TK");  
        while (retu>=100){
          if (retu%100 == 0){
          count1++;
          System.out.println("100 taka note:"+count1);
          }
          else {
            System.out.println("100 taka note:0");
          }
      }
           while (retu>=50){
          if (retu%50 == 0){
          count1++;
          System.out.println("50 taka note:"+count1);
          }
          else {
            System.out.println("50 taka note:0");
          }
      }
           while (retu>=20){
          if (retu%20 == 0){
          count1++;
          System.out.println("20 taka note:"+count1);
          }
          else {
            System.out.println("20 taka note:0");
          }
      }
           while (retu>=10){
          if (retu%10 == 0){
          count1++;
          System.out.println("10 taka note:"+count1);
          }
          else {
            System.out.println("10 taka note:0");
          }
      }
            while (retu>=5){
          if (retu%100 == 0){
          count1++;
          System.out.println("100 taka note:"+count1);
          }
          else {
            System.out.println("100 taka note:0");
          }
      }
                   while (retu>=2){
          if (retu%2 == 0){
          count1++;
          System.out.println("2 taka note:"+count1);
          }
          else {
            System.out.println("2 taka note:0");
          }
      }
                  while (retu>=1){
          if (retu%1 == 0){
          count1++;
          System.out.println("1 taka note:"+count1);
          }
          else {
            System.out.println("1 taka note:0");
          }
      }
    }
  }
 }
