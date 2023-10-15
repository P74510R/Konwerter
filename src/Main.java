import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("W jakim systemie chcesz podac liczbe?");
        System.out.println("1. Dziesietny");
        System.out.println("2. Binarny");
        System.out.println("3. Osemkowy");
        System.out.println("4. Heksadecymalny");
        int wybor = input.nextInt();
        if(wybor==1){
            WymianaDecy.main(args);
        } else if (wybor==2) {
            WymianaBin.main(args);
        }
        else if (wybor==3){
            WymianaOkta.main(args);
        }
        else {
            System.out.println("ERRROROROROROOr");
        }
    }
}
