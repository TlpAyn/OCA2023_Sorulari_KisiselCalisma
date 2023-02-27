package Soru_128_;

public class Main {
    int x;
    int y;

//    public Main() {
//
//    }

//    public Main(int xx, int y) {
//      x = xx;                                                  
//    }

    public void doStuff(int x, int y) {
        x = x;
        y= this.y;
    }

    public void display() {
        System.out.println(x + " " + y + ":");
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.x = 100;
        m1.y = 200;

        Main m2 = new Main();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();

    }
}
