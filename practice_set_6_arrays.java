import java.util.Scanner;
public class practice_set_6_arrays {
    public static void main(String[] args) {


        //question 1: create an array of 5 floats and calculate their sum.
//        float [] num = {5.5f,6.5f,4.5f,2.5f,1.5f};
//        System.out.println("the array is:");
//        float sum = 0;
//        for(int i=0;i<num.length;i++){
//            System.out.print(num[i]+" ");
//            sum =sum+num[i];
//        }
//        System.out.println();
//        System.out.println("the sum is:"+sum);

        //or,
//        float sum_1=0;
//        for(float a : num){
//            System.out.print(a+" ");
//            sum_1 = sum_1+a;
//        }
//        System.out.println();
//        System.out.println("the sum is"+sum_1);
//


        //write a program to find out whether a given integer is present in an array.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] num1 = {2,5,7,9,18,32};
        boolean b =false;
        for(int i=0;i<num1.length;i++){
            if(a==num1[i]){
                b = true;
                break;
            }
        }
        if(b){
            System.out.println("the number is present in the array");
        }
        else{
            System.out.println("the number is not present in the array");
        }

        //

//        int[][] matrix_1 = {{1, 2, 3},
//                            {4, 5, 6}};
//        int[][] matrix2 = {{7, 8, 9},
//                           {10, 11, 12}};
//        int[][] result = {{0, 0, 0},
//                          {0, 0, 0}};
//        for (int i = 0; i < matrix_1.length; i++) {
//            for (int j = 0; j < matrix_1[i].length; j++) {
//                System.out.format("setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = matrix_1[i][j] + matrix2[i][j];
//                System.out.println(result[i][j]+" ");
//            }
//        }
//        for (int i = 0; i < matrix_1.length; i++) {
//            for (int j = 0; j < matrix_1[i].length; j++) {
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
