import java.util.Scanner;
public class elseif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        int i=0;
        while(i<5) {
            int age = sc.nextInt();

            if (age > 85) {
                System.out.println("you take rest");
            } else if (age > 40) {
                System.out.println("you are experienced");

            } else if (age > 30) {
                System.out.println("you are semi-experienced");

            } else if (age > 25) {
                System.out.println("you are little experienced");

            } else {
                System.out.println("you are just a beginner");

            }
            i++;
        }
    }
}
