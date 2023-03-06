public class Main {
    public static void main(String[] args) {
        portfolio portfolio = new portfolio();

        stock enigmaStock = new stock("Enigma", 10.0);
        bound enigmaBound = new bound("ENIGMAINSURANCE", 60.0);

        portfolio.addProduct(enigmaStock);
        portfolio.addProduct(enigmaBound);

        System.out.println(portfolio);
    }
}