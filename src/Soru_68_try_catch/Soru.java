package Soru_68_try_catch;

import Soru_85_tryCatch.MyException;

import java.io.IOException;

public class Soru {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.println("A");
        }
    }

    public static void method1() {
        try {
            throw 3>10  ? new MyException() : new IOException();

        } catch (IOException re) {
            System.out.println("B");
        }
        catch (Exception re){
            System.out.println("D");
    }
}
}