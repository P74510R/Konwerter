public class Binnadecy {
    public static void Liczeniedecy(int bin){
        int decy = 0;
        int i = 0;
        while(bin>0){
            decy = decy + (bin%10)*((int)Math.pow(2, i));
            bin=bin/10;
            i++;
        }
        System.out.println(decy);
    }
}
