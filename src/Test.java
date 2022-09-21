import javax.swing.*;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        int [] tablica = new int[10];
        int suma = 0;



        for(int i = 0;i<10;i++){
            System.out.println("podaj element tablicy");
            tablica[i] = scanner.nextInt();
        }
        int min = tablica[0];
        int max = tablica[0];
        for(int j=0;j<10;j++){
            if(max<tablica[j]){
                max = tablica[j];
            }
            if( min>tablica[j]){
                min = tablica[j];
            }
        }

        suma = max + min;
        System.out.println("minimalny element to" + " " + min);
        System.out.println("maksymalny element to" + " " + max);
        System.out.println("suma minimalnego i maksymalnego elementu wynosi: " + " " + suma);


        JOptionPane.showInternalMessageDialog(null, "Hello World");


    }
}
