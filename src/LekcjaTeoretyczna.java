import java.util.Scanner;

public class LekcjaTeoretyczna {

    public static void main(String[] args) {

    //1. Algorytm - ciąg skończonych instrukcji  za pomocą których dążymy do rozwiązania pewnego problemu.
        // Problem ten może być przedstawiony w dwóch wariantach:
        // schemat blokowy
        // lista kroków

        //Alogrytm który weryfikuje najmniejszy i najwiekszy element spośród n-elementowej tablicy i podaje ich sumę np. 10-elementów

        //1. Deklaracja zmiennych tablicowych
        int [] tablica = new int[5];

        //2. Klasa Scanner - dane wejściowe
        Scanner scanner = new Scanner(System.in);
        //3.  Wykorzystanie pętli FOR i tablicy

        for(int i =0;i<5;i++){
            int pomoc = i+1;
            System.out.println("podaj "+ pomoc +" element" );
            tablica[i] = scanner.nextInt();
        }

        int min = tablica[0];
                int max = tablica[0];
        //4.  Wykorzystanie pętli FOR - przeszukania
        for(int j =0;j<5;j++){
            if(min>tablica[j]){
                min = tablica[j];
            }
            if(max<tablica[j]){
                max = tablica[j];
            }
        }

        int suma = min + max;
        //5.  Wyświetlenie wyniku - dane wyściowe
        System.out.println( "wyświetl sumę " + " " + suma);
        System.out.println( "min" + " " + min);
        System.out.println( " max" + " " + max);




    }
}
