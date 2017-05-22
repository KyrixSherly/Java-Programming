package headfirst.command.DVD;

public class DVDOffCommand implements Command {
  DVD dvd;
  int level;
  public DVDOffCommand(DVD dvd) {
    this.dvd = dvd;
  }
  
  public void execute() {
    level = dvd.getLevel();
    dvd.off();
  }
  
  public void undo() {
    dvd.speed(level);
  }
  
}