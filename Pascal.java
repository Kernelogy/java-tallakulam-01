public class Pascal {
    public static void main(String[] args) {
        int x[][] = new int[5][5];
        int count = 0;
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                if(j == 0 || i == j){
                    x[i][j] = 1;
                }else{
                    x[i][j] = x[i-1][j] + x[i-1][j-1];
                }      
            }
        }
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
