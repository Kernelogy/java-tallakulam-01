/*
 1. If there is no default constructor or there is a parameterized constructor in the
  super class, then the sub class must define a constructor of the same template
  and must call the super method with the arguments
 2. Super call must be the first statement in a sub class constructor
 3. While instantiating a sub class object all the super class objects are also 
    instantiated from the top
 */
class Person{
    private String name;
    private int age;
    private String gender;
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int age, String gender){
        this.name = name;
    }
    // public Person(){
    //     System.out.println("Person Called");
    // }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
class Worker extends Person{
    private String dept;
    private double experience;
    // public Worker(){
    //     System.out.println("Worker Called");
    // }
    // public Worker(String name){
    //     super(name);
    //     System.out.println("Worker called");
    // }
    //Constructor Overloading
    public Worker(String name, String dept, double experience){
        super(name);
        this.dept = dept;
        this.experience = experience;
    }
    public Worker(String name, int age, String gender,
                String dept, double experience){
        super(name, age, gender);
        this.dept = dept;
        this.experience = experience;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public double getExperience() {
        return experience;
    }
    public void setExperience(double experience) {
        this.experience = experience;
    }
    
}
public class Cons2 {
    public static void main(String[] args) {
        // Worker w = new Worker("Mukilan");
        // Worker w = new Worker("Mukilan", "Physics", 3.7);
        Worker w = new Worker("Mukilan", 34, "Male", "Physics", 3.7);
    }
}
