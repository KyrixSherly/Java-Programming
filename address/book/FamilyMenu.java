package address.book;

public class FamilyMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    AddressItem[] menuItems;
  
    public FamilyMenu() {
        menuItems = new AddressItem[MAX_ITEMS];
 
        addItem("Father","È«±æµ¿","À²µµ±¹");
        addItem("Mother","¼ºÃáÇâ","³²¿ø");
        addItem("Brother","ÀÌ¸ù·æ","ÇÑ¾ç");
        addItem("Sister","½ÉÃ»","È²ÁÖ");
        addItem("Uncle","³ª¹«²Û","»ê");
        addItem("Aunt","¼±³à","Ãµ»ó");
        
 }
    public void addItem(String i, String n, String a) {
        AddressItem menuItem = new AddressItem(i, n, a);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, address is full!  Can't add item to address");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public AddressItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new AddressIterator(menuItems);
    }
}