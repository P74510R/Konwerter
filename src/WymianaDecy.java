import java.util.Scanner;

public class WymianaDecy {
    public static void wymiana(int decy) {
        Scanner input = new Scanner(System.in);
        System.out.println("Co chcesz zrobic?");
        System.out.println("1.zamienic liczbe na system binarny");
        System.out.println("2.zamienic liczbe na system oktadecymalny");
        System.out.println("3.zamienic liczbe na system heksadecymalny");
        int wybor = input.nextInt();
        if(wybor==1){
            Decynabin.Liczeniebin(decy);
        } else if (wybor==2) {
            Decynaokta.liczenieokta(decy);
        } else if (wybor==3) {
            Decynaheksa.liczenieheksa(decy);
        }
    }
}