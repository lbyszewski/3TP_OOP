package obiektówka.RekurencjaVsIteracja;

public class Main {
    public static void main(String[] args) {
        // Iteracja vs Rekurencja


        /*
            n! = { n = 0 ; n! = 1;
            n! = { n > 0 ; n! = n*(n-1)!
            np. 5! = 5 * (5-1)!

            ! - silnia
            n - zmienna od użytkownika

         */


        // Iteracja w pętli for z inkremntacją i dekrementacją
            int result = 1;
            for(int i = 1;i<=5;i++){
                System.out.println(result*=i);

            }
            int res = 1;
        System.out.println(result);

            for(int j=5;j>1;j--){
               ;
                System.out.println( res*=j);

            }
        System.out.println(res);
        // rekurencja na podstawie metody



        }

    }


