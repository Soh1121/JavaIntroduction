public class Main {
  public static void main(String[] args) {
    String s = "三";
    try {
      int i = Integer.parseInt(s);
    } catch (NumberFormatException e) {
      System.out.println("文字列が解析不可能です。");
      e.printStackTrace();
    }
  }
}
