import java.util.Scanner;
public class practice_set_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // question: 2
//        System.out.println("enter your sub1 number:");
//        int sub1 = sc.nextInt();
//        System.out.println("enter your sub2 number:");
//        int sub2 = sc.nextInt();
//        System.out.println("enter your sub3 number:");
//        int sub3 = sc.nextInt();
//        int percentage = (sub1 + sub2 + sub3)/3;
//        System.out.println("the percentage is:"+percentage);
//        if(sub1>=33 && sub2>=33 && sub3>=33 && percentage>=40){
//            System.out.println("pass");
//        }
//        else{
//            System.out.println("fail");
//        }

        //question: 3

//        System.out.println("enter your annual income:");
//        int income = sc.nextInt();
//        if (income>=250000 && income<=500000){
//            double tax1 = (income*5)/100;
//            System.out.println("the tax amount is:"+tax1);
//        }
//        else if (income>=500000 && income<=1000000){
//            double tax2 = (income*20)/100;
//            System.out.println("the tax amount is:"+tax2);
//        }
//        else if (income>=1000000){
//            double tax3 = (income*30)/100;
//            System.out.println("the tax amount is:"+tax3);
//        }
//        else{
//            System.out.println("you don't need to pay tax!!");
//        }


        //question: 4

//        System.out.println("enter your number from 1 to 7:");
//        int a = sc.nextInt();
//        switch (a) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//            default -> System.out.println("error!!!");
//        }


        //question:5
        System.out.println("enter the year:");
        long year = sc.nextLong();
        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0){
            System.out.println("this is a leap year");
        }
        else{
            System.out.println("this is not a leap year!!");
        }


        // question:6

        System.out.println("enter your website:");
        String website = sc.next();
        if (website.endsWith(".com")){
            System.out.println("it is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("it is an organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("it is an Indian website");
        }
        else{
            System.out.println("error!!");
        }
    }
}
