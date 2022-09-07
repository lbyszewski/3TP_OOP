import java.util.Scanner;

public class ForClass {
    public static void main(String[] args) {
        // a i b

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a");
        int a = scanner.nextInt();

        System.out.println("podaj b");
        int b = scanner.nextInt();

        System.out.println("podaj d");
        int d = scanner.nextInt();
        for(int i = a;i<=b;i++){


            if(i % d == 0){
                System.out.println("podana liczba jest: " + i);
            }
        }
        // d
    }
}
