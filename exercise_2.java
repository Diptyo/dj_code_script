import java.util.Scanner;
import java.util.Random;
public class exercise_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice:\nenter 1 for stone---enter 2 for paper---enter 3 for scissor");
        int num1 = sc.nextInt();
        Random r = new Random();
        int num2 = r.nextInt();
        System.out.println("computer's choice: "+num2);
    }
}
