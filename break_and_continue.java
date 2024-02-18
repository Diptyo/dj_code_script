public class break_and_continue {
    public static void main(String[] args){
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("doing great");
//            if(i==2){
//                System.out.println("loop ends here");
//                break;
//            }
//        }

        for(int i=0;i<5;i++){
           if(i==2){
               System.out.println("doing great");
               continue;
           }
            System.out.println(i);
            System.out.println("go for it");
        }
    }
}
