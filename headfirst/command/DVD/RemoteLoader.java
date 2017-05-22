package headfirst.command.DVD;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    
    DVD livingRoomDVD = new DVD("Living Room");
    
    DVDOnCommand livingRoomDVDOn = new DVDOnCommand(livingRoomDVD);
    DVDOffCommand livingRoomDVDOff = new DVDOffCommand(livingRoomDVD);
    
    remoteControl.setCommand(0,livingRoomDVDOn,livingRoomDVDOff);
    
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    remoteControl.undoButtonWasPushed();
    
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);  
    remoteControl.undoButtonWasPushed();
  }
}