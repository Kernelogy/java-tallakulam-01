/*
    Inheritance Types
        1. Single
        2. Multi Level
        3. Multiple
        4. Hierarchical
        5. Hybrid
        
*/
/*
//Sample code to understand power of Inheritance
import javax.swing.*;
//class sub_class extends super_class
class Inher1 extends JFrame{
    Inher1(){
        setBounds(100,100,500,500);class Inher1 extends JFrame{

        setVisible(true);
    }
    public static void main(String[] args) {
        Inher1 frame = new Inher1();
    }
}
*/
class Monkey{
    public void climb(){
        System.out.println("Monkey Climbing");
    }
}
class Human extends Monkey{
    public void walk(){
        System.out.println("Human Walking");
    }
}
class Inher1{
    public static void main(String[] args) {
        /*
        Human h1 = new Human();
        h1.climb();
        h1.walk();        
        */
        // Human h1 = new Monkey();
        Monkey m1 = new Human();
        m1.climb();
        ((Human) m1).walk();
    }
}