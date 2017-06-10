package address.book;

public class AddressIterator implements Iterator {
    AddressItem[] items;
    int position = 0;

    public AddressIterator(AddressItem[] items) {
        this.items = items;
    }
 
    public Object next() {
        AddressItem AddressItem = items[position];
        position = position + 1;
        return AddressItem;
    }
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}