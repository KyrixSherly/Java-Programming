package headfirst.strategy;

public abstract class Duck {
  public FlyBehavior fb;
  public QuackBehavior qb;
  
  public void setFlyBehavior(FlyBehavior f) {
    this.fb=f;
  }
   public void setQuackBehavior(QuackBehavior q) {
    this.qb=q;
  }
  public void performFly() {
    fb.fly();
    System.out.println("All duck flying...");
  }
  public void performQuack() {
    qb.quack();
    System.out.println("All duck quacking...");
  }
  abstract void display();
  
  public void swim() {
    System.out.println("All duck swimming");
  }
}

