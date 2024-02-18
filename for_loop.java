import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){               //2i = even number = 2,4,6...
            System.out.println(i);          //2i+1 = odd number = 1,3,5...
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        for(int j=n; j>0; j--){
            System.out.println(j);
        }
    }
}
