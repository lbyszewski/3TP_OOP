import java.util.Scanner;

public class Main {












    //6. Zadanie do realizacji na zajęciach
    // Napisz program w , który użytkownik wpisuje 2 liczby a następnie sprawdza czy liczby z tego zakresu są podzielne przez 4, 8  i 12



    public static void main(String[] args) {

        //1. deklaracja zmiennej
        //2. inicjalizacja zmiennej
        //3. typy zmiennych

        int zmiennaA;
        double zmiennoPrzecinkowe;
        long dluga;
        String napis;
        char znak;
        int result;


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

        //6 instrukcja warunkowa
        if( w > 0 && c > 0){
            result = w * c;
            System.out.println("podany wynik wynosi: " + result);
        } else {
            System.out.println("nie mozna wykonać dzialania");
        }

        // pętle for

        for(int i =0;i<=100;i++){
            if(i % 3 == 0 && i % 5 == 0 || i % 8 == 0){
                System.out.println(i);
            }
        }











    }
}