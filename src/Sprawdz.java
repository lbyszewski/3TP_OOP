public class Sprawdz {
    public static void main(String[] args) {
        Person   osoba1 = new Person();

        osoba1.firstName = "Arek";
        osoba1.lastName = "Kowalski";
        osoba1.myAge = 22;
        osoba1.myCity = "Olsztyn";


        System.out.println(osoba1.firstName + " " + osoba1.lastName  + " " + osoba1.myAge + " " + osoba1.myCity);
    }
}
