public class Oktanaheksa {
    public static void Liczenieheksa(int okta){
        int decy = 0;
        int i = 0;
        while(okta>0){
            decy = decy + (okta%10)*((int)Math.pow(8, i));
            okta=okta/10;
            i++;
        }
        char ch;
        int rem;
        String hex = "";
        String relhex = "";
        char[] heksa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decy>0){
            rem = decy%16;
            String hexi = String.valueOf(heksa[rem]);
            hex = hex+hexi;
            decy = decy/16;
        }
        for (int j=0; j<hex.length(); j++)
        {
            ch= hex.charAt(j);
            relhex= ch+relhex;
        }
        System.out.println(relhex);
    }
}
