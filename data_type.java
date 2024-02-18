public class data_type {
    public static void main(String[] args){
        int a = 10;
        int b = 15;
        int x = a++;     //at first the value will assign then increment.
        int y = ++b;     // at first increment then assign.
        System.out.println(x);
        System.out.println(y);
        char c = 'a';
        System.out.println(++c);
    }
}
