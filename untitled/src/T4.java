public class T4 {
    public static String p1(String s){
        if (s.length()<=1) {
            return s;
        }
        if (s.substring(1,2).equals(s.substring(0,1))){
            return p1(s.substring(1));
        }
        else return s.substring(0,1) + p1(s.substring(1));

    }
    public static void main(String[] args) {
        System.out.println("-------------------------------------1");
        System.out.println(p1("abracadabra"));
        System.out.println(p1("paparazzi"));

    }
}
