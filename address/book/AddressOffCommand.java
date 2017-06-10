package address.book;

public class AddressOffCommand implements Command {
 Address address;
 
 public AddressOffCommand(Address address) {
  this.address = address;
 }
 
 public void execute() {
  address.off();
 }
}