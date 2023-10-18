public class Oktanabin {
    public static void Liczeniebin(int okta){
        int decy = 0;
        int i = 0;
        while(okta>0){
            decy = decy + (okta%10)*((int)Math.pow(8, i));
            okta=okta/10;
            i++;
        }
        int[] binary = new int[1000];
        int j = 0;
        while(decy>0){
            binary[j] = decy%2;
            decy=decy/2;
            j++;
        }
        for(int k=j-1;k>=0;k--){
            System.out.print(binary[k]);
        }
    }
}
