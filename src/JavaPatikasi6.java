import java.util.Scanner;
public class JavaPatikasi6 {
    public static void main(String[] args) {
        // armut 2,14 elma 3,67 domates 1,11 muz 0,95 patlıcan 5,00
        double pearKg,appleKg,tomatoKg,bananaKg,eggplantKg,total,
                pearPrice = 2.14,
                applePrice = 3.67,
                tomatoPrice = 1.11,
                bananaPrice = 0.95,
                eggplantPrice = 5.00;
        Scanner inputKg = new Scanner(System.in);
        System.out.print("Armuz kg giriniz : ");
        pearKg = inputKg.nextDouble();
        System.out.print("Elma kg giriniz : ");
        appleKg = inputKg.nextDouble();
        System.out.print("Domates kg giriniz : ");
        tomatoKg = inputKg.nextDouble();
        System.out.print("Muz kg giriniz : ");
        bananaKg = inputKg.nextDouble();
        System.out.print("Patlıcan kg giriniz : ");
        eggplantKg = inputKg.nextDouble();

        total = ((pearKg*pearPrice) + (appleKg*applePrice) + (tomatoKg*tomatoPrice) + (bananaKg*bananaPrice) + (eggplantKg*eggplantPrice));
        System.out.print("Toplam Tutar : " + total);

    }
}
