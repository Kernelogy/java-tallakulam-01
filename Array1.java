/*
    Arrays
        Variables of same datatype under one 
    Syntax
        data_type var_name[] = new data_type[size]
        data_type[] var_name = new data_type[size]
        data_type[] var_name = {, , , , ,...}
        Ex:
            int[] x = new int[10]
    Accessing individual memory/data
        var_name[index]
        index:
            start index = 0
            end index   = size - 1


*/
class Array{
    public static void main(String[] args) {
        /*
        int[] x = new int[5];
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;
        */
        int[] x = {10,20,30,40,50};

        System.out.println(x[2]);
        //The below statement creates ArrayIndexOutOfBoundsException
        //System.out.println(x[5]);

        int sum = 0;
        // for(int i=0; i<5; i++){
        //     sum += x[i];
        // }
        for(int t: x){
            sum += t;
        }
        System.out.println("The Sum is " + sum);
    }
}