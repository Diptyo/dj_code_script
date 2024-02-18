import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store: ");
        int a= sc.nextInt();
        int array[] = new int[a];
        System.out.println("Enter the elements of the array: ");
        for(int b=0;b<a;b++){
            array[b] = sc.nextInt();
        }
//          int[] array = {429,524,875,658,453,1557,845,967,173,455};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int k=0;k<array.length;k++){
            System.out.println(array[k]);
        }
    }
}
