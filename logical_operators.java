public class logical_operators {
    public static void main(String[] args) {
        boolean a =true;
        boolean b = false;
        if(a && b){                   //for logical "and" operator if both statement are true only then the output will be true.
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        if(a || b){                    //for logical "or" operator if any of the statement is true then the output wil be true.
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        System.out.print("not a is: ");         //for logical "not" operator statement value will change, true will  become false and false will become true.
        System.out.println(!a);
        System.out.print("not b is: ");
        System.out.println(!b);
    }
}
