public class T6 {
    public static String p11(String s, char t){
        String r ="";
        int m=1;
        for (int i=0;i<s.length();i++){
            if ((m==1)&&(s.charAt(i)==t)){
                m=0;
                i++;
            }
            r=r+s.charAt(i);
        }
        return r;
    }
    public static String p1(String s,String a1){
        String r="";
        String r2="";
        String a="";
        String n="qwertyuiopasdfghjklzxcvbnm";
        String n2="QWERTYUIOPASDFGHJKLZXCVBNM";

        for (int i=0;i<a1.length();i++){
            //r2=r2+a1.charAt(i);
            if (a1.charAt(i)!=' '){
                /*if (n2.contains(r2))
                    for (int t=0; t<n.length();t++){
                        if (a1.charAt(i)==n2.charAt(t)){
                            a=a+n.charAt(t);
                            t=n.length();
                        }

                    }

                    r="";
                }*/
                a=a+a1.charAt(i);
            }
            //r="";
        }

        /*String a2="";
        a2=a2+a.charAt(0);
        for (int i=0;i<a.length()-1;i++){
            r2=r2+a.charAt(i);
            for (int d=i+1;d<a.length();d++){
                if (a.charAt(i)==a.charAt(d)){
                    if(!(a2.contains(r2))){
                        m[i]=m[i]+1;
                    }
                    if
                    if ((a2.contains(r2)&&(i>0))){


                    }
                    System.out.println(a2);
                    if (m[i]==1) {
                        a2 = a2 + a.charAt(d);
                    }
                }
            }
            r2="";
            a2=a2+a.charAt(i);
            System.out.print(m[i]);
        }*/
        for (int i=0;i<s.length();i++){
            r2=r2+s.charAt(i);
            if ((a.contains(r2)&&(s.charAt(i)!=' '))){
                r=r+r2;
                a=p11(a,s.charAt(i));
            }
            r2="";
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println("----------------------------1");
        //System.out.println(p1("My world evolves in a beautiful space called Tesh.","sworn love lived-"));
        System.out.println(p1("Mr. Mojo Rising could be a song title", "Jim Morrison-"));
    }
}
