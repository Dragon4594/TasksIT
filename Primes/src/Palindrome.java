public class Palindrome {
    public static String g1(String f){
        String f1 = "";
        String f2 = "";
        for (int i=0; i<f.length()/2;i++){
            f1=f1+ f.charAt(f.length()-1-i);

            if ((f.length()%2!=0)&&(f2=="")){
                f2=f2+f.charAt(f.length()/2+1);
            }
            f2=f2+f.charAt(f.length()/2-1-i);
        }
        return f1+f2;
    }
    public static boolean g(String f){
        String f1 = "";
        for (int i=0; i<f.length();i++){
            f1=f1+f.charAt(i);
        }
        if (f.equals(g1(f))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        for (int i=0; i<args.length;i++){
            System.out.println(g(args[i]));
        }
    }
}