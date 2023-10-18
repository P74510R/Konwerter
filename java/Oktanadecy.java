public class Oktanadecy {
    public static void Liczeniedecy(int okta){
        int decy = 0;
        int i = 0;
        while(okta>0){
            decy = decy + (okta%10)*((int)Math.pow(8, i));
            okta=okta/10;
            i++;
        }
        System.out.println(decy);
    }
}
