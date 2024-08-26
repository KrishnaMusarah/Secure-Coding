package Assignment1;

public class Main {
    public static void main(String[] args) {
        // replace initials with registration number
        String initials = "MKR";
        double registration_number =230683;
        Bank b = new Bank (initials, registration_number);

        b.display();

    }
}