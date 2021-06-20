import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello!");
    } catch (Exception e) {
      System.out.println("何かしらの例外が発生しました");
    } finally {
      fw.close();
    }
  }
}
