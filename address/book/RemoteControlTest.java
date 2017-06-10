package address.book;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Address address = new Address();
        AddressOnCommand addressOn = new AddressOnCommand(address);
 
        remote.setCommand(addressOn);
        remote.buttonWasPressed();
    }
}
