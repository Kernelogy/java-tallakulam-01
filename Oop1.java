/*
    Class
        Collection of things of same category
        Definition of an Object
        Blueprint of an Object
        Object = Behavior + Attribute (Functionality + Property)
            Working physical entity of a class
            Behavior => Functions
                modifies the attributes
            Attribute => Variables
                refers to the state of the object
        Syntax:
            class class_name{
                var 1
                var 2
                .
                .
                fn1(){
                }
                .
                .
            }
        Object Syntax:
            Method 1:
                class_name obj_name;
                obj_name = new class_name();
            Method 2:
                class_name obj_name = new class_name();
        Accessing members:
            obj_name.member_name
            obj_name.member_name()

*/
class Car{
    String model;
    double price;
    int fuelLevel;
    int speed;
    void start(){
        fuelLevel--;
    }
    void stop(){
        speed = 0;
    }
    void accelerate(){
        fuelLevel--;
        speed++;
    }
    void applyBrake(){
        fuelLevel--;
        speed--;
    }

}
class Oop1{
    static Car c1; // Creating a reference
    public static void main(String[] args) {
        c1 = new Car(); // Object Instantiation
        // Car c1 = new Car();
        c1.start();
    }
}