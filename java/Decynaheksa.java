public class Decynaheksa {
    public static void liczenieheksa(int decy){
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
        for (int i=0; i<hex.length(); i++)
        {
            ch= hex.charAt(i);
            relhex= ch+relhex;
        }
        System.out.println(relhex);
    }
}
