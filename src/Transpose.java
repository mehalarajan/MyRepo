import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int row = sc.nextInt();
        System.out.println("enter number of columns:");
        int column = sc.nextInt();
        System.out.println("enter the matrixA elements");
        int[][] matrixA = new int[row][column];
        //System.out.println("enter" + (row * column) + "values:");
       for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
      /* System.out.println("enter the matrix:");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++){
                System.out.print(matrixA[i][j]+"\t ");
            }
            System.out.println();
        }*/
        System.out.println("transpose of the matrix:");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++){
                System.out.print(matrixA[j][i]+" ");

            }
            System.out.println();
        }

    }

    }
