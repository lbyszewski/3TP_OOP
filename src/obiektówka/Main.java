package obiektówka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person("Lukasz","Małkowski",34,"Olsztyn");


        personOne.wyswietlWynik();
        System.out.println("podaj n: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();


        System.out.println(personOne.fibb(n));

    }
}
