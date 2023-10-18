import java.util.Scanner;
public class WymianaBin {
    public static void wymiana(int bin) {
        Scanner input = new Scanner(System.in);
        System.out.println("Co chcesz zrobic?");
        System.out.println("1.Zamienic liczbe na system dziesietny");
        System.out.println("2.Zamienic liczbe na system oktadecymalny");
        System.out.println("3.Zamienic liczbe na system heksadecymalny");
        int wybor = input.nextInt();
        if(wybor==1){
            Binnadecy.Liczeniedecy(bin);
        }
        else if (wybor==2){
            Binnaokta.Liczenieokta(bin);
        }
        else if(wybor==3){
            Binnaheksa.Liczenieheksa(bin);
        }
        else {
            System.out.println("ERRROROROROROOr");
        }
    }
}
