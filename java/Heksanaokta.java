import java.util.Scanner;

public class Heksanaokta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String heksa = input.nextLine();
        int decy = Integer.parseInt(heksa, 16);
        int[] okta = new int[1000];
        int i = 0;
        while(decy>0){
            okta[i] = decy%8;
            decy=decy/8;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(okta[j]);
        }
    }
}
