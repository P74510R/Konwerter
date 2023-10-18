import java.util.Scanner;

public class Heksanabin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        String heksa = input.nextLine();
        int decy = Integer.parseInt(heksa, 16);
        int[] binary = new int[1000];
        int i = 0;
        while(decy>0){
            binary[i] = decy%2;
            decy=decy/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}
