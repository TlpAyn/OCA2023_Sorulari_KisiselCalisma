package Soru_214_Args;

public class ArgsSorusu {
    public static final int MIN =1;
    public static void main(String[] args) {
        int x = 1;
        if(checkLimit(x)){
            System.out.println("JAVA SE");
        }else {
            System.out.println("Java EE");
        }

    }
    public static boolean checkLimit(int x){
        return (x>=MIN) ? true :false;
    }
}
