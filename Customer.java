public class Customer {
    int age;
    String firstname;
    String surname;
    String iban;
    String bic;
    String city;
    double creditcardnumber;
    int cvc;

    public int howOld(int alter) {
        this.age = alter;
        if (alter < 14) {
            throw new IllegalArgumentException("Der Kunde muss älter als 14 sein, um sich ein Bankkonto anliegen zu dürfen.");
        } else {
            return alter;
        }
    }
    public String name(String vorname, String zuname) {
        this.firstname = vorname;
        this.surname = zuname;
        return vorname + " " + zuname;
    }
    public String cardinfo(String IBAN, String BIC, String Ort, int CVC, double KKN) {
        this.iban = IBAN;
        this.bic = BIC;
        this.city = Ort;
        this.cvc = CVC;
        this.creditcardnumber = KKN;
        // return "Karteninformationen: IBAN: " + IBAN + ", BIC: " + BIC + ", Wohnort: " + Ort + ", CVC: " + CVC + ", Kreditkartennummer: " + KKN;
        if (IBAN.length() != 20) {
            throw new IllegalArgumentException("Ihre IBAN ist nicht echt!");
        } else {
            if (BIC.length() > 11 && BIC.length() < 8) {
                throw new IllegalArgumentException("Ihre BIC ist nicht echt!");
                } else {
                    if (Ort.length() <= 1) {
                        throw new IllegalArgumentException("Was soll den das bitte für ein Wohnort sein?");
                    } else { // continue here
                        if (CVC < 100 || CVC > 999) {
                            throw new IllegalArgumentException("Das ist kein allgemein-gültiger CVV/CVC!");
                        } else {
                            if (KKN < Math.pow(10, 15) || KKN > 9.999999999999999 * Math.pow(10, 15)) {
                                throw new IllegalArgumentException("Diese Kreditkartennummer kann nicht existieren!");
                            } else {
                                return "Die Bankdaten sind: \n IBAN: " + IBAN + "\n BIC: " + BIC + "\n Wohnort: " + Ort + "\n CVC: " + CVC + "\n Kreditkartennummer: " + KKN;
                            }
                        }
                    }
                }
        }
    }
}