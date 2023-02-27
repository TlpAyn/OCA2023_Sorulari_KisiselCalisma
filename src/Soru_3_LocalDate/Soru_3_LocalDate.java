package Soru_3_LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Soru_3_LocalDate {
    public static void main(String[] args) {
     //   String date = LocalDate.parse(DateTimeFormatter.ISO_DATE_TIME);   hata  burada!
    //    System.out.println(date);
    }
}
/*
odunuzda hata vermesinin nedeni, LocalDate.parse yöntemine yanlış türde bir argüman vermenizdir. DateTimeFormatter.ISO_DATE_TIME, bir String değil, bir DateTimeFormatter nesnesidir. Bu nedenle, LocalDate.parse yöntemine doğrudan bu nesneyi geçiremezsiniz.

Ayrıca, LocalDate.parse yöntemi, LocalDate nesnesini bir dizgeye dönüştürmek için kullanılırken, DateTimeFormatter.ISO_DATE_TIME bir tarih biçimi şablonu olarak kullanılır. Bu nedenle, LocalDate.parse yöntemi ile bir DateTimeFormatter nesnesini kullanarak bir dizeyi tarihe dönüştürebilirsiniz.

Bu nedenle, doğru kod aşağıdaki gibi olmalıdır:


public static void main(String[] args) {
    String dateString = "2023-02-17T12:00:00"; // or any other date-time string in the ISO_DATE_TIME format
    LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);
    System.out.println(date);

}

Bu kod, LocalDate.parse yöntemini kullanarak, bir String'i LocalDate nesnesine dönüştürür ve ardından bu nesneyi System.out.println yöntemiyle konsola yazdırır.
 */