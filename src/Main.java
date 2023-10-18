import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("W jakim systemie zapisana liczba?");
        System.out.println("1. Dziesietny");
        System.out.println("2. Binarny");
        System.out.println("3. Osemkowy");
        int wybor = input.nextInt();
        System.out.println("Podaj liczbe:");
        int liczba = input.nextInt();
        if(wybor==1){
            WymianaDecy.wymiana(liczba);
        } else if (wybor==2) {
            WymianaBin.wymiana(liczba);
        }
        else if (wybor==3){
            WymianaOkta.wymiana(liczba);
        }
        else {
            System.out.println("ERRROROROROROOr");
        }
    }
}
