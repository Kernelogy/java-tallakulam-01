/*
    1. Final variables must be intialized either in the declaration or in the constructor
        and cannot be reinitialized
    2. Final methods cannot be overrided
    3. Final classes cannot be inherited


 */
final class Math{
    // final double PI = 3.14;
    final double PI;
    Math(){
        PI = 3.14;
    }
    public final int square(int a){
        return a * a;
    }
}
// class Physics extends Math{
    // @Override
    // public int square(int a){
    //     return a * a * a * a;
    // }
// }
public class Final1 {

    public static void main(String[] args) {
        Math math = new Math();     
    }
}
