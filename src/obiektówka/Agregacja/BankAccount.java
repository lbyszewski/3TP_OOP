package obiektówka.Agregacja;

public class BankAccount {
    public Person ownerAccount;
    public long numberAccount;
    public double balnaceAccount;


    public void showInfoAccount(){
        System.out.println(  numberAccount + " " + balnaceAccount + " ");
    }
}
