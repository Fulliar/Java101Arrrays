import java.util.Arrays;

public class ArrayTrasp {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3}, {4,5,6}};
        int[][] transpose = new int[matrix[0].length][matrix.length];


        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0; j < matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix:");
        for(int[] row : matrix){
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for(int[] row : transpose){
            for(int col : row){

                System.out.print(col + " ");

            }

            System.out.println();

        }
        }
    }

