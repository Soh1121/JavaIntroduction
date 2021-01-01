public class App {
    public static void main(String[] args) throws Exception {
        int[] heights = {172, 149, 152, 191, 155};
        java.util.Arrays.sort(heights);
        for (int h : heights) {
            System.out.println(h);
        }
    }
}
