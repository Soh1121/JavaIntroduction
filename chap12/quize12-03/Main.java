public class Main {
  public static void main(String[] args) {
    Y y1 = new A();
    Y y2 = new B();
    Y [] ys = {y1, y2};
    for (Y value : ys) {
      value.b();
    }
  }
}
