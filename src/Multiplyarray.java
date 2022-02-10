public class Multiplyarray {
    public static void main(String args[]){
//creating two matrices
        int a[][]={{8,1,8},{6,2,2},{7,4,3}};
        int b[][]={{1,3,2},{2,5,2},{3,5,3}};

//creating another matrix to store the multiplication of two matrices
        int c[][]=new int[3][3];  //3 rows and 3 columns

//multiplying and printing multiplication of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
