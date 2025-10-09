public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World");
        Customer heyher = new Customer(); // Testkunde, bis ich eine Testklasse einrichte
        System.out.println(heyher.howOld(19));
        System.out.println(heyher.name("Frederick", "Mans"));
        System.out.println(heyher.cardinfo("AT123456789000000000", "BAWAATWW", "Wien", 123, 7861927451045296.0));
        Account variabol = new Account(0);
        System.out.println(variabol.deposit(8));
        System.out.println(variabol.withdraw(10));
        System.out.println(variabol.getBalance());
    }
}