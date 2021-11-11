import java.util.Scanner;

public class basamak {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data, i = 0, j, k = 0, l;
        System.out.print("Basamakları toplamını bulmak istediğiniz sayıyı girin: ");
        data = scn.nextInt();
        while (data != 0) {
            i = data % 10;
            data /= 10;
            k += i;
        }

        System.out.print("Sayının basamakları toplamı: " +k);

    }
}
