public class App {
    public static void introduceOneself() {
        String name = "Minato";
        int age = 22;
        double height = 169.9;
        char zodiac = '辰';
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("干支は" + zodiac + "です");
    }

    public static void main(String[] args) throws Exception {
        introduceOneself();
    }
}
