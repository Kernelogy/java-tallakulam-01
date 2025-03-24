 /*
  1. If there is no constructor defined in a class Java compiler inserts a default
     empty constructor
  2. Constructors are called automatically while creating objects
  3. Objects can only be instantiated if and only if the constructor are called
     along with the keyword new
  4. Parameterized contructors are used for forcing the user to give basic 
     data while instantiating the object
  */
 class Student{
    private String name;
    private int age;
    private String dept;
    //default constructor
    // public Student(){}
    // public Student(){
    //     System.out.println("Student Called");
    // }34
    //Parameterized Constructor
    public Student(String name, int age, String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
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
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    } 
    public String getString(){
        return getName() + " " + getAge() + " " + getDept();
    }   
 }

 public class Cons1{
    public static void main(String[] args) {
        // new Student();
        Student s1 = new Student("Mukilan", 32, "Physics");
        // s1.setName("Mukilan");
        System.out.println(s1.getName() + " " + s1.getAge() +" " + s1.getDept());
        System.out.println(new Student("Manu", 34, "Economics").getString());
    }
 }