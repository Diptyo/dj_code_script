import java.util.*;
public class conditionals_if_else {
    public static void main(String[] args){
//        int a = 556;
//        if(a>55){
//            System.out.println("ok");
//        }
//        else{
//            System.out.println("not ok");
//        }

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int [] num = new int[a];
        for(int j=0;j<a;j++){
            num[j] = sc.nextInt();
        }
        System.out.println(num[2]);
        for(int i=0;i<a;i++){
            System.out.print(num[i]+" ");
        }
    }
}
