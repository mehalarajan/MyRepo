import java.util.Scanner;
public class Multidimen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("enter the number of columns");
        int columns=sc.nextInt();
        System.out.println("enter the elements of matrix1:");
        int[][] matrix1 = new int[rows][columns];
        System.out.println("enter the elements of matrix2: ");
        int[][] matrix2 = new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        int result[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
