package headfirst.factory.pizzas;

public class PizzaTestDrive {
 
 public static void main(String[] args) {

  PizzaStore store = new PizzaStore(new SimplePizzaFactory());

  Pizza pizza = store.orderPizza("cheese");
  pizza = store.orderPizza("pepparoni");
  pizza = store.orderPizza("potato");
 }
}