import java.util.Scanner;

public class Main {






    //3. typy zmiennych





    //6. Zadanie do realizacji na zajęciach

    //7. Zadanie do realizacji w domu


    public static void main(String[] args) {

        //1. deklaracja zmiennej
        int zmiennaA;
        double zmiennoPrzecinkowe;
        long dluga;
        String napis;
        char znak;
        int result;

        //2. inicjalizacja zmiennej

        zmiennaA =5;
        zmiennoPrzecinkowe = 5.25;
        dluga = 52554434l;
        napis = "frgfdgfgd";
        znak = 'x';

        //4. operatory arytmetyczne i logiczne

      //  + , - / *,+=,-=,*=,/=,i++ == i=i+1 ,i--
        // && , || , !=

        //5. klasa Scanner i wyprowadzanie wyników w konsoli
        System.out.println("wprowadz zmienna od uzytkownika w: ");
        Scanner wprowadz = new Scanner(System.in);
        int w = wprowadz.nextInt();
        System.out.println("wprowadz zmienna od uzytkownika c: ");
        int c = wprowadz.nextInt();


        if( w > 0 && c > 0){
            result = w * c;
            System.out.println("podany wynik wynosi: " + result);
        } else {
            System.out.println("nie mozna wykonać dzialania");
        }

        // pętle

        for(int i =0;i<=100;i++){
            if(i % 3 == 0 && i % 5 == 0 || i % 8 == 0){
                System.out.println(i);
            }
        }











    }
}