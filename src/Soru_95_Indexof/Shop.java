package Soru_95_Indexof;

import java.util.ArrayList;
import java.util.List;

class Prducct{

    int id;
    String name;
    Prducct(int id, String name){

        this.id=id;
        this.name= name;

    }
}

public class Shop {
    public static void main(String[] args) {

        List<Prducct> st = new ArrayList<>();

        st.add(new Prducct(10, "Elma"));
        st.add(new Prducct(11, "armut"));

        Prducct p1 = new Prducct(10,"Elma");
        System.out.println(st.indexOf(p1));


    }
}
