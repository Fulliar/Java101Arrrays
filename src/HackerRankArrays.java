import java.util.Scanner;
import java.util.Arrays;

public class HackerRankArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int entry;

        for(int i = 0; i<n ; i++){
            entry = scan.nextInt();
            a[i] = entry;
        }
        Arrays.toString(a);



        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
