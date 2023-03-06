import java.util.ArrayList;

public class portfolio {
    private final ArrayList<product> products;

    public portfolio() {
        products = new ArrayList<>();
    }


    // Ajoute un produit à la liste des produits du portefeuille
    public void addProduct(product product) {
        products.add(product);
    }


    // Calcule et renvoie la valeur totale du portefeuille
    public double getTotalValue() {
        double totalValue = 0.0;

        for (product product : products) {
            totalValue += product.getPrice();
        }

        return totalValue;
    }


    // Renvoie une représentation sous forme de chaîne du portefeuille
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Portfolio:\n");
        sb.append("----------\n");

        for (product product : products) {
            sb.append(String.format("%s (%s): %.2f\n", product.getName(), product.getType(), product.getPrice()));
        }

        sb.append(String.format("Total value: %.2f", getTotalValue()));

        return sb.toString();
    }
}
