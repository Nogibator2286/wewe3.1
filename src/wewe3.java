import java.util.Scanner;

public class wewe3 {
    public static void main(String[] args) {
       // for (int i = 500 ; i >= 10; i-= 10) {
          //  System.out.println(i);
        Scanner scan = new Scanner(System.in) ;
        System.out.println("gUES YOUR NUM");

        int T = 11;
        int number = (int)(Math.random() * T) ;

        while (true){
            System.out.println("Gues my num since 0 to " + T);
            int Number = scan.nextInt() ;
            if ( Number == number) {
                System.out.println("yOU WIN");
            }



        }
    }
}



