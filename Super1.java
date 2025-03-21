/*
 Shadowing:
    While overriding the sub class method shadows the super class method
    Using the super keyword a sub class can access the methods/data members
    in the super class

 */
class Parent{
    protected String name;    
    public void display(){
        System.out.println("Parent Called " + name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Child extends Parent{
    private String name;    
    public void display(){
        super.display();
        System.out.println("Child Called " + name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        super.name = name;
        this.name = name;
    }
}
public class Super1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.setName("Mukilan");
        c.display();
    }
}
