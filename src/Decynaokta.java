public class Decynaokta {
    public static void liczenieokta(int decy){
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
