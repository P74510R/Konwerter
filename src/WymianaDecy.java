import java.util.Scanner;

public class WymianaDecy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Co chcesz zrobic?");
        System.out.println("1.zamienic liczbe na system binarny");
        System.out.println("2.zamienic liczbe na system oktadecymalny");
        System.out.println("3.zamienic liczbe na system heksadecymalny");
        int wybor = input.nextInt();
        switch(wybor) {
            case 1:
                System.out.println("Podaj liczbe: ");
                int dec = input.nextInt();
                System.out.print("W systemie binarnym ta liczba to: ");
                Decynabin.Liczeniebin(dec);
                break;
            case 2:
                System.out.println("Podaj liczbe: ");
                int dec2 = input.nextInt();
                System.out.print("W systemie osemkowym ta liczba to: ");
                Decynaokta.liczenieokta(dec2);
                break;
            case 3:
                System.out.println("Podaj liczbe: ");
                int dec3 = input.nextInt();
                System.out.print("W systemie szesnastkowym ta liczba to: ");
                Decynaheksa.liczenieheksa(dec3);
                break;
            default:
                System.out.println("ERRROROROROROOr");
        }
    }
}