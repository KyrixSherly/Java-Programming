package address.book;

public class AddressOnCommand implements Command {
  Address address;
  public AddressOnCommand(Address address) {
    this.address = address;
  }
  
  public void execute() {
    address.on();
  }
}