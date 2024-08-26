package Assignment1;
// inherit class
public abstract class Insurance extends Bank {
    public Insurance(String account_type, double account_balance){
          super(account_type,account_balance);
}
    // method cover
    public void cover() {
        System.out.println("You are covered");
    }

}

