package chap11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(;set.size()<6;){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }
}
