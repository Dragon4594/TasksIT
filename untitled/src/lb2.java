import java.util.Random;
public class lb2 {
    public static int m(int a,float a1){
        int i=1;
        while (a1>=Math.pow(a,i)){
            i++;
        }
        return i;
    }
    public static void main(String[] args){
        int T=15;
        int V=15;
        float P=0.0001f;
        float S = V*T/P;
        int A = 33;
        int L = 1;
        L = m(A,S);
        String s= "йцукенгшщзхъэждлорпавыфюбьтимсчя";
        char[] a = new char[L];
        System.out.print("S* = ");
        System.out.println(S);
        System.out.print("A = ");
        System.out.println(A);
        System.out.print("L = ");
        System.out.println(L);
        Random r = new Random();
        for(int i=0; i<L;i++){
            a[i] = s.charAt(r.nextInt(32));
        }
        System.out.println(a);
    }
}
