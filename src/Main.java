import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("W jakim systemie zapisana liczba?");
        System.out.println("1. Dziesietny");
        System.out.println("2. Binarny");
        System.out.println("3. Osemkowy");
        System.out.println("4. Heksadecymalny");
        int wybor = input.nextInt();
        if(wybor==1){
            System.out.println("Podaj liczbe:");
            int liczba = input.nextInt();
            WymianaDecy.wymiana(liczba);
        } else if (wybor==2) {
            System.out.println("Podaj liczbe:");
            int liczba = input.nextInt();
            WymianaBin.wymiana(liczba);
        }
        else if (wybor==3){
            System.out.println("Podaj liczbe:");
            int liczba = input.nextInt();
            WymianaOkta.wymiana(liczba);
        } else if (wybor==4) {
            WymianaHeksa.main(args);
        } else {
            System.out.println("ERRROROROROROOr");
        }
    }
}
