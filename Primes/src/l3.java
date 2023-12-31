import java.util.Hashtable;
import java.util.Scanner;

public class l3 {
    public void inpth( int i, char t){

    }


    public static void main(String[] args) {
            Hashtable ta2 = new Hashtable();
            ta2.put(2278,"ford1982");
            ta2.put(3000,"moscvich1970");
            ta2.put(2000,"moscvich1971");
            System.out.println(ta2.get(2000));
            ta2.remove(2000);
            System.out.println(ta2.get(2000));
            Scanner d =new Scanner(System.in);
            String i = d.nextLine();
            String k = d.nextLine();
            ta2.put(i,k);
            System.out.println(ta2.get(i));
            //System.out.println(new Integer(2278).hashCode());

        }

}
