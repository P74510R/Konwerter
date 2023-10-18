import java.util.Scanner;
public class Heksanadecy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String heksa = input.nextLine();
        int decy = Integer.parseInt(heksa, 16);
        System.out.println(decy);
    }
}
