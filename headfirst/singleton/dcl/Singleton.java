package headfirst.singleton.dcl;

public class Singleton{
  //      공유의 의미가 있음.
  private volatile static Singleton uniqueInstance;
  private static int numCalled=0;
  
  private Singleton() {
  
  }
  
  public static Singleton getInstance() {
    if(uniqueInstance == null) {
      //사용중 표시
      synchronized(Singleton.class) {
        if(uniqueInstance == null) {
          System.out.println("creating...");
          uniqueInstance = new Singleton();
        }
       }
      }
      System.out.println("returning....");
      System.out.println("num called...."+numCalled++);
      return uniqueInstance;
  }
 
}