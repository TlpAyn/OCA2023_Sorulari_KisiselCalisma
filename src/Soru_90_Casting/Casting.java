package Soru_90_Casting;

public class Casting {
    public static void main(String[] args) {
       Short s1 = 200;
       Integer s2 = 400;
    //   String s3 = (String)(s1+s2);
       Long s4 = (long) (((s1))  + s2);
       System.out.println("s4 = " + s4);
    }
}
