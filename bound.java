public class bound extends product{

    //Appeler des fonctionnalités de la classe supérieure "product" pour renvoyer la valeur des obligations d'état
    public bound(String name, double price){
        super(name, price);
    }
    public String getType() {
        return "bound";
    }
}
