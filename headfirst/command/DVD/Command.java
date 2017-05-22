package headfirst.command.DVD;

public interface Command {
  public void execute();
  public void undo();
}