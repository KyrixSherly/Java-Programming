package address.book;

import java.util.*;

public class AddressIteratorTestDrive {
    public static void main(String args[]) {
        PhoneAddressMenu phoneAddressMenu = new PhoneAddressMenu();
        FamilyMenu familyMenu = new FamilyMenu();
 
        AddressApp addressApp = new AddressApp(phoneAddressMenu, familyMenu);

        addressApp.printMenu();
    }
}