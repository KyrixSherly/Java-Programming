package address.book;

public abstract class ContactList {
  public StoreMyContact st;
  
  public void setStore(StoreMyContact sto) {
    this.st=sto;
  }

  public void performStore(){
    st.store();
    System.out.println("Store contact List...");
  }
  
  public void search(){
    System.out.println("Search contact List...");
  }
  public void delete(){
    System.out.println("Delete contact List...");
  }
  public void show(){
    System.out.println("Show contact List...");
  }
  public abstract void display();
}