import java.util.Scanner;
public class Passingmatrixtofunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("enter the number of columns");
        int columns = sc.nextInt();
        System.out.println("enter the matrix1 elements");
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter matrix2 elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("the result is: " );
        int[][] result=matrixoperation(matrix1,matrix2,rows,columns);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println( );
        }


    }

    public static int[][] matrixoperation(int matrix1[][], int matrix2[][],int rows,int columns) {
        int result[][]=new int[rows][columns];
        for (int i = 0; i <rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                result[i][j]=0;
                for(int k=0;k<columns;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return result;


    }

}


