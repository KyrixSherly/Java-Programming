package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage {
  //description = "House blend coffee.";
  public HouseBlend() {
    description = "House blend coffee.";
  }
  //public String getDescription() {
  //  return beverage.getDescription()+" adding Mocha";
  //}
  public double cost() {
    return 3.89;
  }
}