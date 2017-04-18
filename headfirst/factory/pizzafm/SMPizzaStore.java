package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
  Pizza createPizza(String item) {
    if(item.equals("cheese")) {
      return new SMStyleCheesePizza();
    } else if (item.equals("sweet potato")) {
      return new SMStyleSweetPotatoPizza();
    } else if (item.equals("gorgonzola")) {
      return new SMStyleGorgonzolaPizza();
    } else if (item.equals("shrimp")) {
      return new SMStyleShrimpPizza();
    } else return null;
  }
  
}