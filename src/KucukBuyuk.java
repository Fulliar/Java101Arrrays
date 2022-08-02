import java.util.Scanner;
import java.util.Arrays;
public class KucukBuyuk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int entry = input.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);


        int min = list[0];
        int max = list[0];
        int count = 0;
        for( int i : list){
         if(entry > list[count]){

             min = list[count];

         }

         if(entry < list[count]){

         max = list[count];
         break;

         }
         count++;
        }

        System.out.println("Girilen Sayı : " + entry);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}
