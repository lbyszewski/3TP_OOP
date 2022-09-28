package obiektówka.Agregacja;

public class Credit {
    public Person creditBorrowed;
    public double termRate;
    public double precent;
    public  double cashTaken;
    public double cashReturned;

    public void showCreditInfo(){
        System.out.println(" Kredytobiorca jest: " + " " + creditBorrowed.firstName + creditBorrowed.lastName + creditBorrowed.PESEL +" "  + " " + cashTaken + " " + termRate );
    }
}
