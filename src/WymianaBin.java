import java.util.Scanner;
public class WymianaBin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Co chcesz zrobic?");
        System.out.println("1.Zamienic liczbe na system dziesietny");
        System.out.println("2.Zamienic liczbe na system oktadecymalny");
        System.out.println("3.Zamienic liczbe na system heksadecymalny");
        int wybor = input.nextInt();
        if(wybor==1){
            System.out.println("Podaj liczbe: ");
            int bin = input.nextInt();
            Binnadecy.Liczeniedecy(bin);
        }
        else if (wybor==2){
            System.out.println("Podaj liczbe: ");
            int bin = input.nextInt();
            Binnaokta.Liczenieokta(bin);
        }
        else if(wybor==3){
            System.out.println("Podaj liczbe: ");
            int bin = input.nextInt();
            Binnaheksa.Liczenieheksa(bin);
        }
        else {
            System.out.println("ERRROROROROROOr");
        }
    }
}
