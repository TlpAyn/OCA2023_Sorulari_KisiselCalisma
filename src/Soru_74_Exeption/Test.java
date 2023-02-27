package Soru_74_Exeption;

public class Test {
    void readCard(int cardNo) throws Exception{

        System.out.println("Reading Card");
    }
    void checkCard(int CardNo) throws RuntimeException{
        System.out.println("Checking Card");
    }

    public static void main(String[] args) throws Exception {
        Test ex = new Test();
        Test cardNo = new Test();
        int cardNO=12344;
        ex.readCard(cardNO);
        ex.checkCard(cardNO);


    }
}
// sorunun orjinalinde Main de Exception yoktu o bakimdan hata veriyordu, ex.readCard satiri. Cunku Exception buyuk Runtime