package headfirst.command.simpleremote;

public class LightCommand implements Command {
  Light light;
  
  public LightCommand(Light light) {
    this.light = light;
  }
  
  public void execute() {
    light.on();
  }
  
}