import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {
  public static void main (String[] args) {
    // 1. 現在の日時をDate型で取得
    Date now = new Date();
    // 2. 取得した日時情報をCalendarにセット
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    // 3. Calendarから「日」の数値を取得
    int day = c.get(Calendar.DAY_OF_MONTH);
    // 4. 取得した値に100を足した値をCalendarの「日」にセット
    c.set(Calendar.DAY_OF_MONTH, day + 100);
    // 5. Calendarの日時情報をDate型に変換
    Date future = c.getTime();
    // 6. SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    String s = f.format(future);
    System.out.println(s);
  }
}
