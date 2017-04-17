package headfirst.factory.pizzas;

public class PepparoniPizza extends Pizza {
  public PepparoniPizza(){
    name="Pepparoni Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmessan");
  }
}