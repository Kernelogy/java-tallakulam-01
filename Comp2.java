import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
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
    @Override
    public int compareTo(Student o) {
        /*
       String n1 = this.getName();
       String n2 = o.getName();
       return n1.compareTo(n2);
       */
      if(this.getAge() == o.getAge()){
        return 0;
      }else if (this.getAge() > o.getAge()){
        return 1;
      }else{
        return -1;
      }

    }
}
class StudentNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        String n1 = o1.getName();
        String n2 = o2.getName();
        return n1.compareTo(n2);
    }

}
class StudentAgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() == o2.getAge()){
            return 0;
          }else if (o1.getAge() > o2.getAge()){
            return 1;
          }else{
            return -1;
          }        
    }

}
public class Comp2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mukilan", 34));
        students.add(new Student("Manu", 23));
        students.add(new Student("Anbu", 25));
        System.out.println(students);
        System.out.println("Before Sorting");
        for (Student student : students) {
            System.out.println(student.getName() + "\t" + student.getAge());
        }
        System.out.println("After Sorting");

        Collections.sort(students, new StudentNameComparator());

        for (Student student : students) {
            System.out.println(student.getName() + "\t" + student.getAge());
        }  
        
        Collections.sort(students, new StudentAgeComparator());

        for (Student student : students) {
            System.out.println(student.getName() + "\t" + student.getAge());
        } 
    }
}
