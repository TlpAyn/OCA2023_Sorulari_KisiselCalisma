package Soru_201_NullEx;

public class Main {
    String name ;
    public Main(String name){
        this.name = name;

    }
    public static void main(String[] args) {

        Main[] students = new Main[3];
      //  students[0]= new Main("Kemal");
        students[1]= new Main("Ali");
        students[2]= new Main("Veli");
        for (Main m: students) {
            System.out.println(""+ m);


        }

    }
}
