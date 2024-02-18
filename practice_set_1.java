import java.util.Scanner;

public class practice_set_1 {
    public static void main(String[] args) {
        //question 1: write program to sum three numbers in java:
//        int a = 5;
//        int b = 6;
//        int c = 7;
//        int sum = a+b+c;
//        System.out.println("the sum is: "+sum);


        // question 2: write a program to calculate cgpa using marks of three subjects:
//        double a = 59;
//        double b = 89;
//        double c = 96;
//        double sum = a+b+c;
//        double per = (sum/300)*100;
//        double cgpa = per/10;
//        System.out.println("the cgpa is: "+ cgpa);


        //qustion 3: write a java program which asks the user to enter his/her name and greets them with "hello </name>,have a great day" text:
        Scanner s = new Scanner(System.in);
//        System.out.println("enter your name:");
//        String str = s.next();
//        System.out.println("hello "+str+",have a great day");


        //question 4: write a java program to convert kilometers to meters:
//        System.out.println("enter how many km you want to convert:");
//        int a = s.nextInt();
//        int b = a*1000;
//        System.out.println("the answer is:"+b+" meter");


        //question 5: write a program to detect whether a number entered by the user is integer or not:
        System.out.println("enter your number:");
        boolean a = s.hasNextInt();
        System.out.println(a);
    }
}
