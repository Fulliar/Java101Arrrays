import java.util.Scanner;
import java.util.Arrays;


public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu n : ");
        int n = input.nextInt();
        int entry;
        System.out.println("Dizinin elemanlarını giriniz : ");

        int[] list = new int[n];

        for(int i = 0; i<n ; i++){
            System.out.println(i+1 + ". Elemanı : ");
            entry = input.nextInt();
            list[i] = entry;
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));

    }
}
