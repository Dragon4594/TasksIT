import java.util.ArrayList;

public class T4 {
    public static String p1(String s,String r, int i){

        if (s.length()<=1) {
            return s;
        }
        if (i==0){
            return p1(s,r=r+s.charAt(i),i=i+1);
        }
        if ((i>0)&(s.length()>i)){
            for(int n=0; n<r.length();n++){
                if (s.charAt(i)==r.charAt(n)){
                    return p1(s,r,i=i+1);
                }
            }
        }

        if (s.length()<=i){
            return r;

        }
        else return p1(s,r=r+s.charAt(i),i=i+1);
    }
    ////////////////////////////////////////////////////////////
    public static void p22(int n, String str, ArrayList<String> sol) {
        if(str.length() == 2 * n)
            sol.add(str);
        else {
            int left = 0;
            int right = 0;
            for(int i = 0; i < str.length(); ++i) {
                if(str.charAt(i) == '(')
                    left++;
                if(str.charAt(i) == ')')
                    right++;
            }
            if(left == right)
                p22(n, str + "(", sol);
            else if(right < left) {
                if(left < n)
                    p22(n, str + "(", sol);
                p22(n, str + ")", sol);
            }
        }
    }
    public static ArrayList<String> p2(int n) {
        /*String s="(";
        String s1=")";
        String t="";
        String t1="";
        if (i==1){
            return s+s1;
        }
        if (i==0){
            return "err";
        }
        if (i>1){
            for (int n=0;n<i-1;n++){
                t=t+s+s1;
                t1=s+t1+s1;
            }
        }
        String r="";
        return t1+" "+t;*/
        ArrayList<String> solutions = new ArrayList<String>();
        p22(n, new String(), solutions);
        return solutions;


    }
    //////////////////////////////////////////////////////////////////////3
    public static String p33(String r, int i,String t,int ii){
        int a=2;
        for (int n=1;n<i;n++){
            a=a*2;

        }

        for (int n=0;n<a;n++){
            ii=n;
            while (ii>0){
                if (ii%2==0){
                    r=r+"0";
                }
                if (ii%2==1){
                    r=r+"1";
                }
                ii=ii/2;
                if (n==1){
                    r=r+"0";
                }
            }
            r=r+" ";

        }


        return r;
    }
    public static String p34(String r,int i){
        String g="00";
        String g1="";

        if (r.length()-1<i){
            for(int n=0;n<i-(r.length()-1);n++){
                g1=g1+"0";

            }

        }
        for(int n=r.length()-1;n>=0;n--){
            if (!(r.charAt(n)==' ')){
                g1=g1+r.charAt(n);
            }

        }
        if ((g1.contains(g))||(g1.length()<i)){
            if (i-g1.length()-1==1){
                return g1;
            }
            return "";
        }
        return g1+" ";
    }
    public static String p3(int i){
        String r="";
        String r1="";
        String r2="";
        r=p33(r,i,"",i);
        for (int t=1;t<r.length();t++){
            r1=r1+r.charAt(t);
            if (r.charAt(t)==' '){
                r2=r2+p34(r1,i);

                r1="";
            }
        }
        return r2;
    }
    public static String p4(String s){
        int max =0;
        String n="";
        int t=0;
        String a="abcdefghijklmnopqrstuvwxyz";
        String a1="zyxwcutsrqponmlkjihgfedcba";
        for (int i=0;i<s.length();i++){
            n=n+s.charAt(i);
            //System.out.println(n);
            if (((a.contains(n))==false)&&((a1.contains(n))==false)){
                n="";
                i=i-1;
            }
            if (n.length()>max){
                max=n.length();
            }

        }
        for (int i=0;i<s.length();i++){
            n=n+s.charAt(i);

            if (((a.contains(n))==false)&&((a1.contains(n))==false)){
                n="";
                i=i-1;
            }
            if (n.length()==max){
                return n;
            }
            //
        }
        return "";
    }

    public static String p5(String s){
        String a="";
        int t=0;
        String r="";
        //a=a+s.charAt(0);
        for (int n=0;n<s.length()-1;n++){
            for (int i=n;i<s.length();i++){
                if (s.charAt(n)!=s.charAt(i)){
                    t=i;
                    i=s.length();
                }
                else{
                    a=a+s.charAt(i);

                }
            }
            r=r+a.charAt(0)+a.length();

            if (a.length()>1){
                n=n+a.length()-1;
            }

            a="";
        }
        char[] g = new char[r.length()];
        for (int i=0; i<r.length(); i++){ //строка в массив
            g[i]=r.charAt(i);
        }
        String a1="";

        for (int i=1; i<r.length()-2; i=i+2){
            for(int n=i+2;n<r.length();n=n+2){
                if (g[i]>g[n]){
                    char b=g[i];
                    g[i]=g[n];
                    g[n]=b;
                    b=g[i-1];
                    g[i-1]=g[n-1];
                    g[n-1]=b;
                    a=a+g[i-1]+g[i];
                }
            }
        }
        for (int i=0;i<r.length();i++){
            a1=a1+g[i];
        }
        return a1;
    }
    public static int p66(String s,String t1){
        int r=-1;
        String t="";
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)==' '){
                if (t.equals(t1)){

                    if (r>20){
                        r=r+1;
                        return 20+((r%10)*10);
                    }
                    return r+1;
                }
                r=r+1;
                t="";
                i++;
            }
            t=t+s.charAt(i);

        }
        return 0;
    }
    public static int p6(String s){
        int r =0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)==' '){
                r=r+1;
            }
        }
        r=r+1;
        int[] n = new int[r];
        String t = "zero one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty thirty forty fifty sixty seventy eighty ninety hundred ";
        String t1="";
        int m=0;
        for (int i=0;i<s.length()-1;i++){

            if (s.charAt(i)==' '){

                n[m]=p66(t,t1);
                if (t1.equals("hundred")){
                    n[m-1]=n[m-1]*100;
                    n[m]=0;
                }
                m=m+1;
                t1="";
                i++;
            }
            t1=t1+s.charAt(i);
        }
        r=0;
        for (int i=0;i<n.length;i++){
            r=r+n[i];
        }
        return r;
    }
    public static String p7(String s) {
        String r="";

        int max= 0;
        String t="";
        for (int i=0;i<s.length();i++){
            t=t+s.charAt(i);
            if (r.contains(t)){
                if (r.length()>max){
                    max=r.length();

                }
                r="";
            }

            if (!(r.contains(t))){

                r=r+s.charAt(i);

            }

            t="";
        }
        r="";
        for (int i=0;i<s.length();i++) {
            t=t+s.charAt(i);
            if (r.contains(t)){
                if (r.length()==max){
                    return r;
                }
                r="";
            }
            if (!(r.contains(t))) {
                r = r + s.charAt(i);
            }
            t="";
        }
        return "";
    }
    public static int p88(int a, int a1) {
        if (a<a1){
            return a;
        }
        return a1;
    }
    public static int[][] p8(int[][] a) {
        int min=999999;
        int[][] n = new int[a[0].length][a[0].length];
        n[0][0]=a[0][0];
        for (int i=1; i<a[1].length;i++){
            n[i][0]=n[i-1][0]+a[i][0];
            for (int j=1; j<a[1].length; j++){
                if(i==1){
                    n[0][j]=n[0][j-1]+a[0][j];
                }
                n[i][j]=a[i][j]+p88(n[i-1][j],n[i][j-1]);
            }
        }
        return n;

    }
    public static String p99(int t){
        if (t==6){
            return "6";
        }
        int m=0;
        int mm=t;
        if (t>=10){
        while (mm>=10){
            if (mm%10>0){
                m=m+1;
            }
            mm=mm%10;

        }
        }
        if (t<10){
            mm=1;
        }

        String r="";
        String g="0123456789";
        m=t;
        int mmm=mm;

        for (int i=0;i<mm;i++){

            if ((m%10==0)&&(m<10)){
                r=r+g.charAt(0);
            }
            if ((m%10==1)&&(m<10)){
                r=r+g.charAt(1);
            }
            if ((m%10==2)&&(m<10)){
                r=r+g.charAt(2);
            }

            if ((m%10==3)&&(m<10)){
                r=r+g.charAt(3);
            }
            if ((m%10==4)&&(m<10)){
                r=r+g.charAt(4);
            }
            if ((m%10==5)&&(m<10)){
                r=r+g.charAt(5);
            }
            if ((m%10==6)&&(m<10)){
                r=r+g.charAt(6);
            }
            if ((m%10==6)&&(m<10)){
                r=r+g.charAt(6);
            }
            if ((m%10==7)&&(m<10)){
                r=r+g.charAt(7);
            }
            if ((m%10==8)&&(m<10)){
                r=r+g.charAt(8);
            }if ((m%10==9)&&(m<10)){
                r=r+g.charAt(9);
            }
            /////////////////////////////
            if ((m/10==0)&&(m>10)){
                r=r+g.charAt(0);
            }
            if ((m/10==1)&&(m>10)){
                r=r+g.charAt(1);
            }
            if ((m/10==2)&&(m>10)){
                r=r+g.charAt(2);
            }
            if ((m/10==3)&&(m>10)){
                r=r+g.charAt(3);
            }
            if ((m/10==4)&&(m>10)){
                r=r+g.charAt(4);
            }
            if ((m/10==5)&&(m>10)){
                r=r+g.charAt(5);
            }
            if ((m/10==6)&&(m>10)){
                r=r+g.charAt(6);
            }
            if ((m/10==6)&&(m>10)){
                r=r+g.charAt(6);
            }
            if ((m/10==7)&&(m>10)){
                r=r+g.charAt(7);
            }
            if ((m/10==8)&&(m>10)){
                r=r+g.charAt(8);
            }
            if ((m/10==9)&&(m>10)){
                r=r+g.charAt(9);
            }
            if (t>=10){
                m=m%(10*(mmm-1));
            }

            //System.out.println(r);
        }
        return r;
    }
    public static String p9(String a) {
        String r="";
        int n=1;
        String t="";
       // int nn=0;
        for (int i=0;i<a.length();i++){

            for (int j=0; j<a.length();j++){
               /* if (n==6){
                    nn++;
                    System.out.println(t);
                }*/
                if (a.charAt(j)==' '){

                    if (t.contains(p99(n))){

                        r=r+t+" ";
                        n++;
                        j=a.length()-1;

                    }
                    else{
                        t="";
                        j=j+1;

                    }
                }
                //System.out.println(a.charAt(j));
                t=t+a.charAt(j);

                //System.out.println("---");
            }
            t="";
            if (r.length()==a.length()){
                i=a.length();
            }
        }
        String rr="";
        String m="1234567890";
        String g="";

        for (int i=0; i<r.length();i++){
            if (m.contains(g)){
                g="";
            }
            rr=rr+g;
            g="";
            g=g+r.charAt(i);
        }
        return rr;
    }
    public static int p1010(int m){
        int t=1;
        for (int i=1; i<m;i++){
            t=t*10;
        }
        return t;
    }
    public static int p10(int a, int a1){
        int n=a;
        int n1=a1;
        int m=1;
        int m1=1;

        while (n>=10){
            n=n/10;
            m++;
        }
        while (n1>=10){

            n1=n1/10;
            m1++;

        }
        int max =0;
        n=a;
        for (int i=m;i>0;i--){
            n1=10;
            for (int g=1; g<i-1;g++){
                n1=n1*10;
            }

            if (max<(n/(n1))){
                max=n/(n1);
            }
            if ((n<10)&&(n>max)){
                max=n;

            }
            n=n%(n1);

        }
        //System.out.println(max);
        n=a1;
        for (int i=m1;i>0;i--){
            //n1=10;
            //for (int g=1; g<i-1;g++){
            n1=p1010(i);
            //}

            if (max>(n/(n1))){
                int r=0;
                for (int g=m1;g>1;g--){
                    int tt=10;
                        tt=p1010(g);
                    if (tt==n1){
                        r=r+(max*n1);

                    }
                    else{
                            //r=r+((a1%(tt*10))*tt*10);
                        r=r+((a1%(tt*10))/tt)*tt;
                            //System.out.println((a1%(tt*10))/tt);
                        }

                }
                r=r+(a1%10);
                return r;

            }
            n=n%(n1);
        }
        return 0;
    }
    /////////////////////////////////////////////////////4

    public static void main(String[] args) {
        System.out.println("-------------------------------------1");
        System.out.println(p1("abracadabra","",0));
        System.out.println(p1("paparazzi","",0));
        System.out.println("-------------------------------------2");
        System.out.println(p2(2));
        System.out.println(p2(3));
        System.out.println("-------------------------------------3");
        System.out.println(p3(2));//
        System.out.println(p3(5));//
        System.out.println("-------------------------------------4");
        System.out.println(p4("abcdjuwx"));//
        System.out.println(p4("klmabzyxw"));//
        System.out.println("-------------------------------------5");
        System.out.println(p5("aaabbcdd"));
        System.out.println(p5("vvvvaajaaaaa"));
        System.out.println("-------------------------------------6");
        System.out.println(p6("eight  "));
        System.out.println(p6("five hundred sixty seven  "));
        System.out.println(p6("twenty one  "));
        System.out.println("-------------------------------------7");
        System.out.println(p7("123412324"));
        System.out.println(p7("111111"));
        System.out.println(p7("77897898"));
        System.out.println("-------------------------------------8");
        int[][] n = p8(new int[][]{ {1, 3, 1},
                                    {1, 5, 1},
                                    {4, 2, 1}});
        int[][] n1 = p8(new int[][]{ {2, 7, 3},
                                     {1, 4, 8},
                                     {4, 5, 9}});

        System.out.println(n[n[0].length-1][n[0].length-1]);
        System.out.println(n1[n[0].length-1][n[0].length-1]);
        System.out.println("-------------------------------------9");
        //System.out.println(p99(6));
        System.out.println(p9("t3o the5m 1One all6 r4ule ri2ng "));
        System.out.println(p9("re6sponsibility Wit1h gr5eat power3 4comes g2reat "));
        System.out.println("-------------------------------------10");
        System.out.println(p10(519, 723));
        System.out.println(p10(491, 3912));
        System.out.println(p10(6274, 71259));
    }
}
