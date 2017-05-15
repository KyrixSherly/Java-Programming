package headfirst.singleton.threadsafe;
 
public class ChocolateController {
 public static void main(String args[]) {
  ChocolateBoiler b1 = ChocolateBoiler.getInstance();
  ChocolateBoiler b2 = ChocolateBoiler.getInstance();
  ChocolateBoiler b3 = ChocolateBoiler.getInstance();
 }
}