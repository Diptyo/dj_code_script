import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.println("it works!!");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1:");
//        int a = sc.nextInt();
//        System.out.println("enter number 2:");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("sum of these number is:");
//        System.out.println(sum);
//        System.out.println("your name:");
//        String str = sc.nextLine();
//        System.out.println(str);
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}