public class Decynabin {
    public static void Liczeniebin(int decy){
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
