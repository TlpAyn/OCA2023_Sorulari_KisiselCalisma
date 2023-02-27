package Soru_62_Interface;


interface Downloadable {
    public void download();
}
interface Readable extends Downloadable {   //line n1
    public void readBook();
}
abstract class Book implements Readable {   //line n2
    public void readBook(){
        System.out.println("Read Book");
    }
}
class EBook extends Book {       //line n3

    public void readBook() {
        System.out.println("Read E-Book");
    }


   @Override
   public void download() {

   }
}
class Test {
    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }
}