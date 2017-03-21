package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck() {
    fb =new FlyWithWings();
    //setFlyBehavior(new FlyWithWIngs());
    qb = new Quack();
  }
  public void display() {
    System.out.println("Mallard...");
  }
}