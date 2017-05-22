package headfirst.command.DVD;

public class NoCommand implements Command {
  public void execute() {
    System.out.println("Do Nothing....HAHAHA!!");
  }
  public void undo() {}
}