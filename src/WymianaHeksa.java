import java.util.Scanner;
public class WymianaHeksa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Na jaki system chcesz przeksztalcic liczbe");
        System.out.println("1. Dziesietny");
        System.out.println("2. Binarny");
        System.out.println("3. Osemkowy");
        int wybor = input.nextInt();
        if (wybor==1){
            Heksanadecy.main(args);
        }
        else if(wybor==2){
            Heksanabin.main(args);
        }
        else if(wybor==3){
            Heksanaokta.main(args);
        }
        else{
            System.out.println("ERRROROROROROOr");
        }
    }
}
