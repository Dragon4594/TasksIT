
public class Main {
    public static boolean IsPrime (int n){
        int a=0;
        for (int i=1; i<n;i++){

            if (n%i==0){
                a+=1;
            }
        }

        if (a==1){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        for (int i=2;i<100;i++){
            if (IsPrime(i)==true){
                System.out.println(i);
            }
        }

    }
}