import java.util.Scanner;
public class sybse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng1 = sc.nextInt();
        int[] array1 = new int[leng1];
        for (int iy= 0; iy< leng1; iy++) {
            array1[iy] = sc.nextInt();
        }
        System.out.print("Enter the length of the second array: ");
        int leng2 = sc.nextInt();
        int[] array2 = new int[leng2];
        System.out.println("Enter "+leng2+"elements of the second array:");
        for (int ix= 0; ix< leng2; ix++) {
            array2[ix] = sc.nextInt();
        }
        boolean issub = true;
        for (int il= 0; il< leng2; il++) {
            boolean flag = false;
            for (int j = 0; j <leng1; j++) {
                if (array2[il] == array1[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                issub = false;
                break;
            }
        }
        if (issub) {
            System.out.println("The second array is a subset of the first array.");
        } 
        else {
            System.out.println("The second array is not a subset of the first array.");
        }
    }
}
