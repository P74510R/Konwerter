import java.util.Scanner;

public class WymianaOkta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("co chcesz zrobic?");
        System.out.println("1.zamienic liczbe na system dziesietny");
        System.out.println("2.zamienic liczbe na system binarny");
        System.out.println("3.zamienic liczbe na system heksadecymalny");
        int wybor = input.nextInt();
        if(wybor==1){
            System.out.println("podaj liczbe: ");
            int okta = input.nextInt();
            Oktanadecy.Liczeniedecy(okta);
        }
        else if(wybor==2){
            System.out.println("podaj liczbe: ");
            int okta = input.nextInt();
            Oktanabin.Liczeniebin(okta);
        }
        else if(wybor==3){
            System.out.println("podaj liczbe: ");
            int okta = input.nextInt();
            Oktanaheksa.Liczenieheksa(okta);
        }
        else {
            System.out.println("ERRROROROROROOr");
        }
    }
}
