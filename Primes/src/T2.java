import java.util.Random;

public class T2 {
    public static Boolean p1(String a){
        for (int i=0;i<a.length();i++){
            for (int t=i+1;t<a.length();t++){
                if (a.charAt(i)==a.charAt(t)){
                    return true;
                }
            }
        }
        return false;
    }
    public static String p2(String a){
        String r="";
        r=r+a.charAt(0);
        for (int i=0; i<a.length();i++){
            if(a.charAt(i)==' '){
                return r+a.charAt(i+1);
            }
        }
        return r;
    }
    public static int p3(int[] a){
        int r=0;
        int sumch=0;
        int sumnch=0;

        for (int i=0; i<a.length;i++){
            if (a[i]%2==0){
                sumch=sumch+a[i];

            }
            else{
                sumnch=sumnch+a[i];
            }
        }


        return sumch-sumnch;
    }

    public static Boolean p4(float[] a){
        float sr=0;
        float summ=0;
        for (int i=0; i<a.length;i++){
            summ=summ+a[i];
        }
        sr=summ/a.length;
        ///System.out.println(sr);
        for (int i=0; i<a.length;i++){
            if (a[i]==sr){
                return true;
            }
        }
        return false;
    }
    public static int[] p5(int[] a){
        //int[] b = new int[a.length];
        for (int i=0;i<a.length;i++){
            a[i]=a[i]*i;
        }
        return a;
    }
    public static String p6(String a){
        String r="";
        for (int i=a.length()-1;i>0;i--){
            r=r+a.charAt(i);
        }
        r=r+a.charAt(0);
        return r;
    }
    public static int p7(int a){
        int[]m= new int[] {0,0,1};
        int t=0;
        for (int i=3;i<a;i++){
            t=m[0]+m[1]+m[2];
            m[0]=m[1];
            m[1]=m[2];
            m[2]=t;

        }
        return m[2];

    }
    public static String p8(int a){
        String r ="";
        String m ="0123456789abcdef";
        Random t = new Random();
        if (a==0){
            return "";
        }
        for (int i=0;i<a;i++){
            r=r+m.charAt(t.nextInt(m.length()));
        }
        return r;
    }
    public static String p9(String a){
        String r="help";
        if (a.contains(r)){
            return "Calling for a staff member";
        }
        return "Keep waiting";
    }
    public static String p1010(String a, int t){
        String r="";
        for(int i=0; i<a.length();i++){
            if (i!=t){
                r=r+a.charAt(i);
            }
        }
        return r;
    }
    public static Boolean p10(String a,String a1){
        /*char[] m = new char[a.length()], m1=new char[a1.length()];
        for (int i=0;i<a.length();i++){
            m[i]=a.charAt(i);
        }
        for (int i=0;i<a1.length();i++){
            m1[i]=a1.charAt(i);
        }*/
        int n=0;
        String m=a;
        String m1=a1;
        for(int i=0; i<m.length();i++){
            n=1;
            for (int t=0;t<m1.length();t++){
                if (m.charAt(i)==m1.charAt(t)){
                    //m=p1010(m,i);
                    m1=p1010(m1,t);
                    n=0;
                }
            }
            if (n==1){
                return false;
            }

        }

        if ((n==0)&&(m1.length()==0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("----------------------1");
        System.out.println(p1("donald"));
        System.out.println(p1("orange"));
        System.out.println("----------------------2");
        System.out.println(p2("Ryan Gosling") );
        System.out.println(p2("Barack Obama") );
        System.out.println("----------------------3");
        System.out.println(p3(new int[] {44, 32, 86, 19})  );
        System.out.println(p3(new int[]{22, 50, 16, 63, 31, 55}) );
        System.out.println("----------------------4");
        System.out.println(p4(new float[] {1, 2, 3, 4, 5})  );
        System.out.println(p4(new float[]{1, 2, 3, 4, 6}) );
        System.out.println("----------------------5");
        int[] l1=p5(new int[] {1, 2, 3}), l2=p5(new int[]{3, 3, -2, 408, 3, 31}) ;

        for (int i=0;i<l1.length;i++){
            System.out.print(l1[i]+" ");
        }
        System.out.println("");
        for (int i=0;i<l2.length;i++){
            System.out.print(l2[i]+" ");
        }
        System.out.println("");
        System.out.println("----------------------6");
        System.out.println(p6("Hello World") );
        System.out.println(p6("The quick brown fox.") );
        System.out.println("----------------------7");
        System.out.println(p7(7) );
        System.out.println(p7(11) );
        System.out.println("----------------------8");
        System.out.println(p8(4) );
        System.out.println(p8(10) );
        System.out.println(p8(0) );
        System.out.println("----------------------9");
        System.out.println(p9("Hello, I’m under the water, please help me"));
        System.out.println(p9("Two pepperoni pizzas please"));
        System.out.println("----------------------10");
        System.out.println(p10("listen", "silent"));
        System.out.println(p10("eleven plus two", "twelve plus one"));
        System.out.println(p10("hello", "world"));
    }
}
