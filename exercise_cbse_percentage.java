import java.util.Scanner;

public class exercise_cbse_percentage {
    public static void main(String[] args) {
        System.out.println("check your percentage");
        System.out.println("Enter the numbers you got");
        Scanner s =new Scanner(System.in);
        System.out.println("subject 1:");
        double a = s.nextDouble();            // double is used to represent integer and float both
        System.out.println("subject 2:");
        double b = s.nextDouble();
        System.out.println("subject 3:");
        double c = s.nextDouble();
        System.out.println("subject 4:");
        double d = s.nextDouble();
        System.out.println("subject 5:");
        double e = s.nextDouble();
        double sum = a+b+c+d+e;
        double percentage = (sum/500)*100;
        System.out.println("the percentage is "+percentage);
    }
}
