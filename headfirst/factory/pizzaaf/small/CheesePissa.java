package headfirst.factory.pizzaaf.small;

//public class NYStyleCheesePizza extends Pizza {
public class CheesePizza extends Pizza{
  PizzaIngredientFactory inFac;
  public NYStyleCheesePizza(){
    name="NYStyleCheese Pizza";
    dough = "Thin Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Grated Reggiano Cheese");
  }
  void prepare() {
    inFac.createDough();
    inFac.createCheese();
  }
}
