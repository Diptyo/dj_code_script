public class methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    int logic1(int x1,int x2){
        int z1;
        if(x1>x2){
            z1 = x1-x2;
        }
        else{
            z1 = (x1+x2)*2;
        }
        return z1;
    }
    public static void main(String[] args) {
        methods obj = new methods();    // to verify the logic without static method
         int a=5;
         int b=7;
         int c=logic(a,b);              // methods with static
         int d = obj.logic1(a,b);       // methods without static
         int a1=8;
         int b1=5;
         int c1=logic(a1,b1);
         int d1 = obj.logic1(a1,b1);
         int a2=1;
         int b2=2;
         int c2=logic(a2,b2);
         int d2 = obj.logic1(a2,b2);


        System.out.println(c+" "+d);
        System.out.println(c1+" "+d1);
        System.out.println(c2+" "+d2);
    }
}
