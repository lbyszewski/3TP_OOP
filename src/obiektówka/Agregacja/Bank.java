package obiektówka.Agregacja;

public class Bank {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.PESEL = 565645454;
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.ownerAccount = person1;
        bankAccount1.balnaceAccount = 50000;
        Credit credit1 = new Credit();
        credit1.creditBorrowed = person1;
        credit1.termRate = 36;
        credit1.cashTaken = 5000;
        credit1.showCreditInfo();

        bankAccount1.numberAccount = 454545454;
        bankAccount1.showInfoAccount();

    }
}
