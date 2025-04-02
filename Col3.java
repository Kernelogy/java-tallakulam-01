import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        ArrayDeque<String> users = new ArrayDeque<>(); 
        // Queue<String> users = new      
        users.add("Zebra");
        users.add("Anbu");
        users.add("Manu"); 
        users.add("Arivu"); 
        System.out.println(users);
        // String user = users.poll();//removes the first element and returns the value 
        // String user = users.peek(); // returns the first element
        String user = users.pop();//removes the first element and returns the value 

        System.out.println(users);
        System.out.println(user);
    }
}
