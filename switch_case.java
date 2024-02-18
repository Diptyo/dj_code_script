import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yor number:");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you can do it");
                break;
            case 25:
                System.out.println("you also can do it");
                break;
            case 60:
                System.out.println("you also can");
                break;
            default:
                System.out.println("you can't");
        }
        System.out.println("thanks!!");
    }
}
