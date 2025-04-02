import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Col5 {
    public static void main(String[] args) {
        Map<Integer, String> users = new LinkedHashMap<>();
        users.put(20, "Manu");
        users.put(45, "Anbu");
        users.put(37, "Mukilan");
        System.out.println(users);
        System.out.println(users.keySet());
        for (Integer key : users.keySet()) {
            System.out.println(users.get(key));
        }
        users.remove(45);
        System.out.println(users);
    }

}
