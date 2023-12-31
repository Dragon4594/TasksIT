public class T1 {
    public static float j1(float a){
        return a*3.78541f;
    }
    public static int j2(int a,int b){
        return a*b;
    }
    public static int j3(int a,int b, int c){
        return a*20+b*50+c*100;
    }
    public static void j4(int a,int b, int c){
        if ((a+b>c)&&(b+c>a)&&(c+b>a)){
            if ((a==b)&&(b==c)){
                System.out.println("isosceles");
            }
            else{
                if ((a==b)||(b==c)||(c==a)){
                    System.out.println("equilateral");
                }
            }
            if ((a!=b)&&(b!=c)&&(c!=a)){
                System.out.println("different-sided");
            }
        }
        else {
            System.out.println("not a triangle");
        }

    }

    public static int j5(int a,int b){
        int g=0;
        if (a!=b){
            return a>b ? a : b;
        }
        else{
            return g;
        }
    }

    public static float j6(float a,float b, float c){
        a=a*2;
        float n = b*c;
        float g = a/n;
        return g;
    }

    public static int j7(int a){
        int s=1;
        for (int i =1; i<=a; i++){
            s=s*i;
        }
        return s;
    }

    public static int j8(int a,int b){
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b;
    }
    public static float j9(int a,int b){


        return a*b*0.72f;
    }
    public static float j10(int a,int b){
        if (a%2!=0){
            a=a+1;
        }
        float f = a/2;
        int g=0;
        if (b-f>0){
            return g;
        }
        return f-b;
    }


    public static void main(String[] args) {
        System.out.println(j1(5));
        System.out.println(j1(3));
        System.out.println(j1(8));
        System.out.println("------------------2");
        System.out.println(j2(15,1));
        System.out.println(j2(24,2));
        System.out.println(j2(41,3));
        System.out.println("------------------3");
        System.out.println(j3(3,4,2));
        System.out.println(j3(5,0,2));
        System.out.println(j3(4,1,4));
        System.out.println("------------------4");
        j4(5,5,5);
        j4(5,4,5);
        j4(3,4,5);
        j4(5,1,1);
        System.out.println("------------------5");
        System.out.println(j5(4,8));
        System.out.println(j5(1,11));
        System.out.println(j5(5,9));
        System.out.println("------------------6");
        System.out.println(j6(22,1.4f,2));
        System.out.println(j6(45,1.8f,1.9f));
        System.out.println(j6(100,2,2));
        System.out.println("------------------7");
        System.out.println(j7(3));
        System.out.println(j7(5));
        System.out.println(j7(7));
        System.out.println("------------------8");
        System.out.println(j8(48,18));
        System.out.println(j8(52,8));
        System.out.println(j8(259,28));
        System.out.println("------------------9");
        System.out.println(j9(70,1500));
        System.out.println(j9(24,950));
        System.out.println(j9(53,1250));
        System.out.println("------------------10");
        System.out.println(j10(5,2));
        System.out.println(j10(31,20));
        System.out.println(j10(123,58));
    }

}
