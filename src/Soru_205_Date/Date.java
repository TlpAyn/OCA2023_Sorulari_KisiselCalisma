package Soru_205_Date;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println("date = " + date);
    }
}
