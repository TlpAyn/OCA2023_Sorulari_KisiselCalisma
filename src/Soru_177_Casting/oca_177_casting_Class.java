package Soru_177_Casting;

class Bird {
    public void fly() {
        System.out.println("Fly.");
    }
}

class Peacock extends Bird {
     void dance() {
        System.out.println("Dance.");
    }

    public static void main(String[] args) {

        //  Bird p = new Peacock(); // A -> polimorfizm'de allttakinin ozel methoduna ulasamiyor
        // Bird b = new Bird();   Peacock p = (Peacock) b; // B ->  salt Parent objesi salt Child Peacock objesine Cast edilemez
        //  Peacock p = new Peacock (); Bird p = (Bird) b; // C ->  cift yerel p objesi olusturulamaz
        Bird b = new Peacock(); //polimorfizmde sagdakine sinirli ulasim
        Peacock p = (Peacock) b; // Casting ile ulasim haklari restore edilir

        p.fly();
        // A -> polymorphism  dance'i gormuyor p.dance();
        p.dance();
        // B -> java.lang.ClassCastException: class oca_177_casting_Class.Bird
        // cannot be cast to class oca_177_casting_Class.Peacock
        //C ->  Salt Parent Class objesi salt Child objesine Cast edilemiyor...
    }
}
