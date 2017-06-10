package address.book;

import java.util.ArrayList;

public class PhoneAddressMenu implements Menu {
    ArrayList menuItems;
 
    public PhoneAddressMenu() {
        menuItems = new ArrayList();
    
        addItem("GrandPa","全备尔","全林");
    }
    public void addItem(String id, String name, String address) {
        AddressItem menuItem = new AddressItem(id, name, address);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PhoneAddressMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Phone Address Menu";
    }
}