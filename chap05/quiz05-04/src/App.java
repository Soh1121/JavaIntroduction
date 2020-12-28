public class App {
    public static double calcTriangleArea(double bottom, double height) {
        double area = bottom * height / 2;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(calcTriangleArea(10.0, 5.0));
        System.out.println(calcCircleArea(5.0));
    }
}
