import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String p1 (String a) {
        char[] c = new char[a.length()];
        int i = 0;
        int t = 0;
        for (i=0; i<a.length(); i++){ //строка в массив
            c[i]=a.charAt(i);
        }
        for (i=0; i<a.length(); i++){
            for (t=i+1; t<a.length(); t++){
                if (c[i]==c[t]){
                    return "true";
                }
            }
        }
        return "false";
    }
    public static char p2 (String a) {
        char[] c = new char[a.length()];
        int i = 0;
        int t1 = 0;
        char[] t = new char[2];
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
        }
        for (i = 0; i < a.length(); i++) {
            if (c[i] == ' ') {
                t1 = i;
                System.out.print(c[0]);
            }
        }
        return c[t1+1];
    }
    public static int p3 (int t[]) {
        int i = 0;
        int chs=0;
        int ns=0;

        for (i=0; i<t.length; i++){
            if ((t[i]%2>0)&&(t[i]!=0)){
                ns=ns+t[i];
            }
            if ((t[i]%2==0)&&(t[i]!=0)){
                chs=chs+t[i];
            }
        }
        /*for (i=0; i<t.length; i++) {
            System.out.println(t[i]);
        }
        System.out.println(ns);*/
        return chs-ns;
    }
    public static String p4 (int t[]) {
        int i = 0;
        int s=0;
        float ns=0;

        for (i=0; i<t.length; i++){
            s = s+t[i];
        }
        i=t.length;
        ns = s/(float) i;

        for (i=0; i<t.length; i++){
            if (t[i]==ns){
                return "true";
            }
        }
        return "false";
    }

    public static int[] p5 (int[] t) {
        int i = 0;

        for (i=0; i<t.length; i++){
            t[i]=t[i]*i;
            //System.out.print(t[i]);
            //System.out.print(" ");
        }
        return t;
    }

    public static char[] p6 (String a) {
        char[] c = new char[a.length()];
        String d;
        char f;
        int i;
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
        }
        for (i=0; i<a.length()/2; i++){
            f = c[i];
            c[i] = c[a.length()-1-i];
            c[a.length()-1-i] = f;
        }

        return c;
    }
    public static int p7 (int a) {
        int[] b = {0,0,1};
        int i = 0;
        int d=0;
        for (i=0; i<a-1;i++){
            d=b[2];
            b[2] = b[0]+b[1]+b[2];
            b[0] = b[1];
            b[1] = d;
        }
        return b[0];
    }

    public static char[] p8 (int ad) {
        String a =  "qwertyuiopasdfghjklzxcvbnm0123456789";//36
        int i = 0;
        char[] c = new char[a.length()];
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
        }
        int num =0;

        Random r = new Random();
        char[] c1 = new char [ad];
        for (i=0; i<ad;i++){
            c1[i] = c[r.nextInt(35)];
        }
        return c1;
    }

    public static String p9 (String a) {
        char[] c = new char[a.length()];
        String d;
        int f=0;
        int i;
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
        }
        for (i = 3; i < a.length(); i++) { //строка в массив
            if ((c[i-3]=='h') &&(c[i-2]=='e')&&(c[i-1]=='l')&&(c[i]=='p')) {
                f=1;
            }
        }
        if (f==0){
            return "Keep waiting";
        }
        else {
            return  "Calling for a staff member";
        }


    }

    public static String p10 (String a,String a1) {
        char[] c = new char[a.length()];
        char[] c1 = new char[a1.length()];
        // String d;
        int f = 0;
        int i;
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
            if (c[i]==' '){
                f=1+f;
            }
        }
        for (i = 0; i < a.length(); i++) { //строка в массив
            c1[i] = a1.charAt(i);
            if (c1[i]==' '){
                f=1+f;

            }
        }
        int d=0;
        if ((f%2==0) && (c.length==c1.length)){
            for (i=0;i<c.length;i++){
                for (f=0; f<c.length;f++){
                    if (c[i]==c1[f]){
                        d=d+1;
                        c1[f]='-';

                    }
                }
            }
            if (d==c.length){

                return "true";

            }
            if (d!=c.length){

                return "false";

            }

        }
        else{
            return "false";
        }
        return "0";
    }
    ////////////////////////////////////////////////////////////////////////////////3/6
    public static char[] p31 (String a) {
        char[] c = new char[a.length()];
        char[] c1 = new char[] {'a','e','y','u','o','i'};
        int f = 0;
        int i;
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
            for (f=0; f<c1.length; f++){
                if (c1[f]==c[i]){
                    c[i]='*';
                }
            }
        }

        return c;
    }

    public static String p32 (String a) {
        char[] c = new char[a.length()];

        String b = "Double";
        String n ="";
        int f = 0;
        int i;
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
            if ((i!=0)&&(c[i]==c[i-1])){
                c[i]='*';
                c[i-1]='*';

            }
            //System.out.print(c[i]);
        }
        for (i = 0; i < a.length(); i++){
            if (c[i]!='*'){
                n = n+c[i];
            }
            else {
                n=n+b;
                i++;
            }
        }
        return n;
    }

    public static String p33 (int[] t) {
        int f=0;
        if ((t[0]<=t[4])||(t[0]<=t[3])){
            f=f+1;
        }
        if ((t[1]<=t[4])||(t[1]<=t[3])){
            f=f+1;
        }
        if ((t[2]<=t[4])||(t[2]<=t[3])){
            f=f+1;
        }
        if (f>=2){
            return "true";
        }

        return "false";
    }

    public static String p34 (int t) {
        int i=0;
        String a = (String) ""+t;
        char[] c = new char[a.length()];
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
        }
        int s =0;
        int [] in = {0,1,2,3,4,5,6,7,8,9};
        for (i = 0; i < a.length(); i++){
            if (c[i]=='0'){
                s=s+0*0;
            }
            if (c[i]=='1'){
                s=s+1*1;
            }
            if (c[i]=='2'){
                s=s+2*2;
            }
            if (c[i]=='3'){
                s=s+3*3;
            }
            if (c[i]=='4'){
                s=s+4*4;
            }
            if (c[i]=='5'){
                s=s+5*5;
            }
            if (c[i]=='6'){
                s=s+6*6;
            }
            if (c[i]=='7'){
                s=s+7*7;
            }
            if (c[i]=='8'){
                s=s+8*8;
            }
            if (c[i]=='9') {
                s = s + 9 * 9;
            }
        }
        if (((s%2==0)&&(t%2==0)) || ((s%2!=0)&&(t%2!=0))){
            return "true";
        }
        return "false";
    }

    public static int p35 (int[] t) {
        int b =t[1]*t[1]-(4*t[0]*t[2]);
        //System.out.println(b);
        if ((b)>=0){
            if ((b)>0){
                return 2;

            }
            return 1 ;
        }
        return 0;

    }

    public static String p36 (String[][] t) {
        int b =0;
        int i =0;

        int max=0;
        for (i=0;i<t.length;i++){

            if (t[i].length>max){
                max=t[i].length;
            }

        }
        String s ="";
        for (i=0;i<t.length;i++){
           if (t[i].length==max) {
                s = s + t[i][0] + " ";
            }
        }
        return s;

    }

    public static String p37 (String a) {
        int b =0;
        int i =0;

        char[] c = new char[a.length()];
        char[] c1 = new char[a.length()];
        for (i = 0; i < a.length(); i++) { //строка в массив
            if (a.charAt(i)==' '){
                c[b] = a.charAt(i+1);
                c1[b]= a.charAt(i-1);
                b=b+1;
            }
            else {
                c[i] = '-';
                c1[i]= '-';
            }
        }
        int s=b;
        int sm=0;
        String g="";
        for (i = 0; i < a.length()-1; i++) { //строка в массив
            for (b = 0; b < a.length(); b++) { //строка в массив

                if(c[i]!='-') {
                    if (c1[sm] == c[b]) {
                        g = g + c1[i] + c[b];
                        sm = b+1;
                        c[b]='-';
                        continue;

                    }
                }
            }

        }
        if (s==g.length()/2-1){

            return "true";
        }


        return "false";

    }
    public static String p38 (int[]t) {
        int b =0;
        int i =0;
        for (i=1;i<t.length-1;i++){
            if (((t[i-1]<t[i])&&(t[i+1]>t[i])) || ((t[i-1]>t[i])&&(t[i+1]<t[i]))){
                b=b+1;
            }
        }

        if (b==0){
            return "true";
        }

        return "false";

    }
    public static char p39 (String a) {
        int b =0;
        int i =0;
        char[] c = new char[a.length()];
        char [] c1 = new char[] {'a','e','y','u','i','o','a'};
        int[] g = new int [] {0,0,0,0,0,0,0};
        for (i = 0; i < a.length(); i++) { //строка в массив
            c[i] = a.charAt(i);
            for (b = 0; b < c1.length; b++){
                if (c[i]==c1[b]){
                    g[b]=g[b]+1;
                }
            }

        }
        int max=0;
        int num=0;
        for (i=0;i<g.length;i++){
            if (g[i]>max){
                max=g[i];
                num=i;
                System.out.println(num);
            }
        }
        return c1[1];

    }

    public static int[][] p40 (int[][] arr) {

        for (int i = 0; i < arr[1].length; i++) {
            int ans = 0;

            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    ans += arr[j][i];
                }
            }
            ans = Math.round(ans / 4.0f);

            arr[i][i] = ans;
        }
        return arr;
    }


    public static void main(String[] args) {


        //s.length()
        System.out.println("--------------------------------------------------------------------------------------2/6");
        System.out.println(p1("donald"));
        System.out.println(p1("orange"));
        System.out.println("-------------------------------2");
        System.out.println(p2("Ryan Goslingv"));
        System.out.println(p2("Barack Obama"));
        System.out.println("-------------------------------3");
        System.out.println(p3(new int [] {44,32,86,19}));
        System.out.println(p3(new int [] {22, 50, 16, 63, 31, 55}));
        System.out.println("-------------------------------4");
        System.out.println(p4(new int [] {1, 2, 3, 4, 5}));
        System.out.println(p4(new int [] {1, 2, 3, 4, 6}));
        System.out.println("-------------------------------5");
        System.out.println(p5(new int [] {1, 2, 3}));
        System.out.println(p5(new int [] {3, 3, -2, 408, 3, 31}));
        System.out.println("-------------------------------6");
        System.out.println(p6("Hello World"));
        System.out.println(p6("The quick brown fox."));
        System.out.println("-------------------------------7");
        System.out.println(p7(7));
        System.out.println(p7(11));
        System.out.println("-------------------------------8");
        System.out.println(p8(7));
        System.out.println(p8(11));
        System.out.println("-------------------------------9");
        System.out.println(p9("Hello, I’m under the water, please help me"));
        System.out.println(p9("Two pepperoni pizzas please"));
        System.out.println("-------------------------------10");
        System.out.println(p10("listen", "silent") );
        System.out.println(p10("eleven plus two", "twelve plus one") );
        System.out.println(p10("hello", "world") );
        System.out.println("--------------------------------------------------------------------------------------3/6");
        System.out.println(p31("apple") );
        System.out.println(p31("Even if you did this task not by yourself, you have to understand every single line of code.") );
        System.out.println("-------------------------------2");
        System.out.println(p32("hello") );
        System.out.println(p32("bookkeeper") );
        System.out.println("-------------------------------3");
        System.out.println(p33(new int[] {1, 3, 5, 4, 5}) );
        System.out.println(p33(new int[] {1, 8, 1, 1, 1}) );
        System.out.println(p33(new int[] {1, 2, 2, 1, 1}) );
        System.out.println("-------------------------------4");
        System.out.println(p34(243) );
        System.out.println(p34(52) );
        System.out.println("-------------------------------5");
        System.out.println(p35(new int[] {1, -3, 2}) );
        System.out.println(p35(new int[] {2, 5, 5}) );
        System.out.println(p35(new int[] {1, -6, 9}));
        System.out.println("-------------------------------6" );
        System.out.println(p36(new String[][] {{"Apple", "Shop1", "Shop2", "Shop3", "Shop4"},{"Banana", "Shop2", "Shop3", "Shop4"},{"Orange", "Shop1", "Shop3", "Shop4"},{"Pear", "Shop2", "Shop4"}}) );
        System.out.println(p36(new String[][] {{"Fridge", "Shop2", "Shop3"}, {"Microwave", "Shop1", "Shop2", "Shop3", "Shop4"}, {"Laptop", "Shop3", "Shop4"}, {"Phone", "Shop1", "Shop2", "Shop3", "Shop4"}}) );
        System.out.println("-------------------------------7" );
        System.out.println(p37("apple eagle egg goat")  );
        System.out.println(p37("cat dog goose fish") );
        System.out.println("-------------------------------8" );
        System.out.println(p38(new int[] {3, 1, 4, 2, 7, 5}) );
        System.out.println(p38(new int[] {1, 2, 3, 4, 5}) );
        System.out.println(p38(new int[] {1, 2, -6, 10, 3}) );
        System.out.println("-------------------------------9" );
        System.out.println(p39("Hello world") );
        System.out.println(p39("Actions speak louder than words") );
        System.out.println("-------------------------------10" );
        int[][] t1 = p40(new int[][]
                {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {5, 5, 5, 5, 5},
                {7, 4, 3, 14, 2},
                {1, 0, 11, 10, 1}}),
                t2 = p40(new int[][]
                        {{6, 4, 19, 0, 0},
                        {81, 25, 3, 1, 17},
                        {48, 12, 60, 32, 14},
                        {91, 47, 16, 65, 217},
                        {5, 73, 0, 4, 21}});
        int i=0;
        int j=0;
        for (i=0;i< t1.length;i++){
            for (j=0;j< t1[i].length;j++){
                System.out.print(t1[i][j]+" ") ;
        }
            System.out.println("");
        }
        System.out.println("========================");
        for (i=0;i< t2.length;i++){
            for (j=0;j< t2[i].length;j++){
                    System.out.print(t2[i][j]+" ") ;
            }
            System.out.println("");
        }
        System.out.println("======================================================================14");
        Scanner d =new Scanner(System.in);
        String bd = d.nextLine();
        String a =  "йцукенгшщзхъфывапролджэячсмитьбю";//36
        String A = "ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
        String s= "!-#$%&',*";
        int n=0;
        int n1=0;
        char[] pass =new char[6];
        Random r = new Random();
        for(i=0;i<6;i++){
            if (i<2){

           pass[i] =A.charAt(r.nextInt(A.length()));
        }
            if (i==2){
                n=r.nextInt(10);
                n1=(n*n%10);
            }
            if (i==3){
                n=r.nextInt(10);

                pass[i]=(char)n;


            }
            if (i==4){
                n=r.nextInt(s.length());
                if (n==1){
                    pass[i]='"';
                }
                pass[i]=s.charAt(n);
            }
            if (i==5){
                pass[i]=a.charAt(r.nextInt(a.length()));
            }
        }
        for(i=0;i<pass.length;i++){
            if ((i==2)){
                System.out.print(n1);

            }
            if (i==3){
                n=r.nextInt(10);
                System.out.print(n);
            }
            if((i!=3)&&(i!=2)){
                System.out.print(pass[i]);
            }

        }

    }
}