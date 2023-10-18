public class Binnaokta {
    public static void Liczenieokta(int bin){
        int decy = 0;
        int i = 0;
        while(bin>0){
            decy = decy + (bin%10)*((int)Math.pow(2, i));
            bin=bin/10;
            i++;
        }
        int[] okta = new int[1000];
        int j = 0;
        while(decy>0){
            okta[j] = decy%8;
            decy=decy/8;
            j++;
        }
        for(int k=j-1;k>=0;k--){
            System.out.print(okta[k]);
        }
    }
}
