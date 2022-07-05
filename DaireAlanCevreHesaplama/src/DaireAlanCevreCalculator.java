import java.util.Scanner;

public class DaireAlanCevreCalculator {
    public static void main(String[] args) {

        int r;
        double pi = 3.14d, alan, cevre;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarı Çap Değerini Giriniz (cm): ");
        r = inp.nextInt();

        alan = (pi * r * r);
        System.out.println("Dairenin Alanı (cm^2): " + alan);

        cevre = (2 * pi * r);
        System.out.println("Dairenin Çevresi (cm): " + cevre);
    }
}
