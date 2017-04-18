package headfirst.factory.pizzafm;

public class SMStyleShrimpPizza extends Pizza {
  public SMStyleShrimpPizza(){
    name="SMStyleShrimp Pizza";
    dough = "Thick Crust";
    sauce = "Sweet Tomato-Oregano Sauce";
    toppings.add("Shrimp");
    toppings.add("Mozzarella Cheese");
    toppings.add("Mushroom");
    toppings.add("Sweet Pepper");
  }
}
