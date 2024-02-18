
public class arrays_2 {
    public static void main(String[] args) {
        int [] age = {25,57,32,89,76};
        System.out.println(age.length);

        for (int i=0; i<age.length; i++){                //printing array using for loop.
            System.out.println(age[i]);
        }
        for(int j=age.length-1; j>=0; j--){              //printing array in reverse order using for loop.
            System.out.println(age[j]);
        }
        for(int a: age){                                   //printing array using for each loop.
            System.out.print(a+" ");
        }
    }
}
