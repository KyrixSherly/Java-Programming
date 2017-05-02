package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory inFac;
  public CheesePizza(PizzaIngredientFactory inFac){
    
    this.inFac = inFac;
  }
  protected void prepare() {
    System.out.println("Preparing " + name);
    dough = inFac.createDough();
    cheese = inFac.createCheese();
    potato = inFac.createPotato();
  }
}
