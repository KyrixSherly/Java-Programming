package headfirst.command.undo;

// null object pattern
public class NoCommand implements Command {
  public void execute() {
    System.out.println("Do Nothing....HAHAHA!!");
  }
  public void undo() {}
}