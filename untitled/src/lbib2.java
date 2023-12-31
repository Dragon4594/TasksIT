import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class lbib2 {
    public static boolean p41 (String s1,String bd, int a) {
        String s0 = "";
        String s2 = "";
        int d=0;
        for (int i=0; i<s1.length();i++) {
            if (s1.charAt(i)== ' '){
                d++;
                i++;
            }
            if ((d==a)) {
                if (s1.charAt(i)==','){
                    i++;
                    s0=s0+(s1.charAt(i));
                    s2=s2+(bd.charAt(i));
                    System.out.println("1");
                }

            }
        }

        if (s0.equals(s2)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean p40 (String s1,String bd, int a) {
        String s0 = "";
        int d=0;
        for (int i=0; i<s1.length();i++) {
            if (s1.charAt(i)== ' '){
                d++;
                i++;
            }
            if ((a == 1) && (d==0)) {
                s0=s0+(s1.charAt(i));
            }
            if ((a == 2) && (d==1)) {
                s0=s0+(s1.charAt(i));
            }
        }

        if (s0.equals(bd)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) throws  FileNotFoundException{
        String s = File.separator;
        String sp = "C:"+s+ "Users" +s +"Andrey"+s +"Desktop"+s +"МТУСИ программы и лабы"+s +"инф без"+s ;

        File f = new File(sp+"datab.txt");
        File f1 = new File (sp +"datad.txt");
        Scanner scan = new Scanner(f);
        Scanner sc = new Scanner(f1);
        Scanner d =new Scanner(System.in);
        String bd = d.nextLine();
        String bdp = d.nextLine();
        String s1="";
        int num=0;
        int con =-1;
        while (scan.hasNextLine()){
            s1 = scan.nextLine();
           // System.out.println(p40(s1,bdp,2));
            if (p40(s1,bd,1)){
                if (p40(s1,bdp,2)){
                    con = num;
                    //System.out.println(con);
                }
            }
            num++;
        }
        if (con<0){
            System.out.println("логин или пароль неправельны");
        }
        ///////////////////////////////////////////////////////////////////////
        num=0;
        if (con>=0) {
            while (sc.hasNextLine()) {
                s1 = sc.nextLine();

                if (num==con){
                    System.out.println(s1);
                    System.out.println("Желаете ли вы сменить пароль? Eсли да введите (1)");
                }
                num++;
            }
        }
        String np = d.nextLine();

        s1="1";

        if ((s1.equals(np))==true){
            System.out.println("введите старый пароль привязанный к аккаунту");
            np = d.nextLine();
            num=0;
            scan.close();
            sc.close();
            scan = new Scanner(f);
            sc = new Scanner(f1);
            while (scan.hasNextLine()){
                s1 = scan.nextLine();
                    if (((p40(s1,np,2)==false))&&(num==con)){
                        System.out.println("введите новый пароль");
                        np = d.nextLine();
                        s1=sc.nextLine();
                        if (p41(s1,np,4)){
                            System.out.println("новый пароль совпадает с вашей датой рождения");
                        }
                        else {
                            System.out.println("повторите новый пароль");

                        }
                    }

                num++;
            }
        }

        scan.close();
        sc.close();

    }


}
