public class Floyd {
    public static void main(String[] args) {
        int x[][] = new int[5][5];
        int count = 0;
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                count++;
                x[i][j] = count;                
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
