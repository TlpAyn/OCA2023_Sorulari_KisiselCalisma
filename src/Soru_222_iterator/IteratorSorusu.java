package Soru_222_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorSorusu {
    public static void main(String[] args) {

        List<String> st1 = Arrays.asList("EN","FR","CH","JP");
        Iterator<String> itr = st1.iterator();
        while(itr.hasNext()){
            String e =itr.next();
            if(e=="CH"){
                break;
            }
            System.out.println(e+ " ");
        }

    }
}
