import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
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
}
public class Col2 {
    public static void main(String[] args) {
        // List<Student> sList = new ArrayList<>();
        Set<Student> sList = new TreeSet<>();
        Student s1 = new Student("Mukilan", 23);
        sList.add(s1);
        sList.add(new Student("Manu", 24));
        sList.add(new Student("Anbu", 27));
        for (Student student : sList) {
            System.out.println(student.getName() + "\t" + student.getAge());
        }
    }
}
