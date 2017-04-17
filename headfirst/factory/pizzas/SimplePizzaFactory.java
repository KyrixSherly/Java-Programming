package headfirst.factory.pizzas;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza=null;
    if(type.equals("cheese")) {
      return new CheesePizza();
    } else if (type.equals("pepparoni")) {
      pizza = new PepparoniPizza();
    }
    return pizza;
  }
}