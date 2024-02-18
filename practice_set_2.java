import java.util.Scanner;

public class practice_set_2 {
    public static void main(String[] args) {
        // question 1: what will b the result of the following expression: float a = 7/2*9/2:
//        float a = 7/4.0f * 9/2.0f;
//        System.out.println(a);

        //question 2: write a java program to encrypt a grade by adding 8 to it.
        // decrypt it to show the correct grade.
            //encrypt:
//        char grade = 'A';
//        grade = (char)(grade + 8);     //(char) is called type casting to type cast an integer to a character.
//        System.out.println(grade);
//           //decrypt:
//        grade  =(char)(grade-8);
//        System.out.println(grade);

        //question 3: use comparison operator to find out whether a given number is greater than the user entered umber or not.
//        Scanner s = new Scanner(System.in);
//        int x =25;
//        System.out.println("enter your number:");
//        int a = s.nextInt();
//        System.out.println("true = greater number & false = lesser number");
//        System.out.println(x>a);

        //question 4: write the following expression i a java program.
        // (v^2-u^2)/2as
//        int v = 10;
//        int u = 8;
//        int a = 2;
//        int s = 4;
//        int f = v*v - (u*u)/(2*a*s);
//        System.out.println(f);

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter total number of vehicles: ");
                int v = sc.nextInt();

                System.out.print("Enter total number of wheels: ");
                int W = sc.nextInt();

                // Let x be the number of two-wheelers and y be the number of four-wheelers
                // We can create two equations based on the given data:
                // x + y = v   (Total number of vehicles)
                // 2x + 4y = W  (Total number of wheels)

                // We can solve these equations to get the values of x and y:
                int y = (W - 2*v) / 2;
                int x = v - y;

                // Print the results
                System.out.println("Number of two-wheelers needed: " + x);
                System.out.println("Number of four-wheelers needed: " + y);

                sc.close();

    }
}
