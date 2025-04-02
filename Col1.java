/*
 All the collection classes are generic classes
    Class<Data-type> ref = new Class<Data-type>();

 */

import java.util.ArrayList;
import java.util.List;

public class Col1 {
    public static void main(String[] args) {
        // ArrayList<Integer> iList = new ArrayList<Integer>();
        // List<Integer> iList = new ArrayList<Integer>();
        // List<Integer> iList = new ArrayList<>();
        List iList = new ArrayList<>();
        iList.add(50);
        iList.add(20);
        iList.add(30);
        iList.add("Mukilan");
        // for (Integer i : iList) {
        //     System.out.println(i);
        // }
        for(int i=0; i<iList.size(); i++){
            System.out.println(iList.get(i));
        }
        System.out.println(iList);
        iList.remove(0);
        System.out.println(iList);
        iList.clear();
        System.out.println(iList);
    }
}