public class operator_associativity {
    public static void main(String[] args) {
        //   Precedence & Associativity:
        int a =5*4+20/5;     //value or precedence of '*' & '/' is same.
        int b =24/4-3*4;     //associativity is about from left to right.
        System.out.println(a);
        System.out.println(b);
    }
}                            //precedence of '()'is highest.