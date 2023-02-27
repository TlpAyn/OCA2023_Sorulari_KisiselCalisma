package Soru_221_List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {

        List colors = new ArrayList();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3,"cyan");
        System.out.println("colors = " + colors);
    }
}
