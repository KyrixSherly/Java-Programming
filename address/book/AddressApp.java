package address.book;

public class AddressApp {
    PhoneAddressMenu phoneAddressMenu;
    FamilyMenu familyMenu;
 
    public AddressApp(PhoneAddressMenu phoneAddressMenu, FamilyMenu familyMenu) {
        this.phoneAddressMenu = phoneAddressMenu;
        this.familyMenu = familyMenu;
    }
    public void printMenu() {
        Iterator phoneAddressIterator = phoneAddressMenu.createIterator();
        Iterator familyIterator = familyMenu.createIterator();

        System.out.println("MENU\n----\nPHONE ADDRESS");
        printMenu(phoneAddressIterator);
        System.out.println("\nFAMILY");
        printMenu(familyIterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            AddressItem addressItem = (AddressItem)iterator.next();
            System.out.print(addressItem.getId() + ", ");
            System.out.print(addressItem.getName() + " -- ");
            System.out.println(addressItem.getAddress());
        }
    }
}