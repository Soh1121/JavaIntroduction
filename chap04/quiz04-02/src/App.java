public class App {
    public static void main(String[] args) throws Exception {
        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        for (int value : moneyList) {
            System.out.println(value);
        }
    }
}
