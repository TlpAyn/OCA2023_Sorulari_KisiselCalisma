package Soru_112_count;

public class Main {
    static int count;
    public  void disp(){
        count++;
        System.out.println("Welcome Visit Count " +count);
    }
    public static void main(String[] args) {
Main mn = new Main();
        mn.disp();
        mn.disp();



    }
}
// Ya direk cagirmak icin hepsi static olacak, ya da yeni klasior acip devam edeceksin . . .