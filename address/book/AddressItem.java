package address.book;

public class AddressItem {
    String id;
    String name;
    String address;
 
    public AddressItem(String id, String name,String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String toString() {
        return (id + " , " + name +" , " + address);
    }
}