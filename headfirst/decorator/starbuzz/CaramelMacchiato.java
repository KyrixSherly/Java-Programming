package headfirst.decorator.starbuzz;

public class CaramelMacchiato extends Beverage {
  public CaramelMacchiato() {
    description = "Caramel Macchiato coffee.";
  }
  public double cost() {
    return 5.98;
  }
}