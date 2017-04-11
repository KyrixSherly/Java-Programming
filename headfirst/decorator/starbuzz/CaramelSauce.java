package headfirst.decorator.starbuzz;

public class CaramelSauce extends CondimentDecorator {
  Beverage beverage;
  public CaramelSauce(Beverage b) {
    this.beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+" adding CaramelSauce";
  }
  public double cost() {
    return beverage.cost()+0.2;
  }
}