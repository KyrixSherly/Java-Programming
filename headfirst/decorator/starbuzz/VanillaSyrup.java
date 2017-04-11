package headfirst.decorator.starbuzz;

public class VanillaSyrup extends CondimentDecorator {
  Beverage beverage;
  public VanillaSyrup(Beverage b) {
    this.beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+" adding VanillaSyrup";
  }
  public double cost() {
    return beverage.cost()+0.1;
  }
}