public class practice_set_5 {
    public static void main(String[] args){
//        question 1: print the pattern.(****\n***\n**\n*)     [\n = new line ]
//        int n = 4;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        question 2: write a program to sum first n even number using while loop.
//        int sum = 0;
//        int n = 0;
//        while(n<4) {
//            sum = sum + (2 * n);
//            n++;
//        }
//        System.out.println(sum);



        int n=10;
        for(int i=10;i>0;i--){
            int mul = n*i;
            System.out.printf("%d * %d = %d\n", n, i, mul);
        }
        while (true){
            System.out.println("5");
        }
    }
}