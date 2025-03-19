
/*
While the arrays are not intialized
    If it is a local variable generates error on compile time
    If it is a global variable generates java.lang.NullPointerException on the run time 
*/
class Array2{
    // static int[] x;
    public static void main(String[] args) {
        // int[] x;
        /* 
        int[][] x = new int[3][3];
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;
        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;
        */
        
        int[][] x = {
            {1,2,3},
            {4,5,6},
            {8,9,10}
        };
         
        // System.out.println(x[1][1]);
        for(int i=0; i<3; i++){     //row
            for(int j=0; j<=i; j++){ //col
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
        
        for(int[] i : x){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}