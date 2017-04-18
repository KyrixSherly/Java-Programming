package headfirst.factory.pizzafm;

public class PizzaTestDrive { 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore smStore = new SMPizzaStore();
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("A ordered a " + pizza.getName() + "\n");
  pizza = nyStore.orderPizza("clam");
  System.out.println("A ordered a " + pizza.getName() + "\n");
  pizza = nyStore.orderPizza("pepperoni");
  System.out.println("A ordered a " + pizza.getName() + "\n");
  pizza = nyStore.orderPizza("veggie");
  System.out.println("A ordered a " + pizza.getName() + "\n");
  pizza = smStore.orderPizza("cheese");
  System.out.println("B ordered a " + pizza.getName() + "\n");
  pizza = smStore.orderPizza("sweet potato");
  System.out.println("B ordered a " + pizza.getName() + "\n");
  pizza = smStore.orderPizza("gorgonzola");
  System.out.println("B ordered a " + pizza.getName() + "\n");
  pizza = smStore.orderPizza("shrimp");
  System.out.println("B ordered a " + pizza.getName() + "\n");
 }
}