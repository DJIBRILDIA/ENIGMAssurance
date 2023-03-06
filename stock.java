public class stock extends product{

    //Appeler des fonctionnalités de la classe supérieure "product" pour renvoyer la valeur du stock de produits du portfolio
    public stock(String name, double price){
        super(name, price);
    }
    public String getType() {
        return "the stock";
    }
}
