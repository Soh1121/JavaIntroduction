import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Class.forName("org.h2.Driver");
    // 接続先DBを指定
    String dburl = "jdbc:h2:~/test";
    String sql = "SERT INTO EMPLOYEES(name) VALUES('aoki')";
    // DBに接続
    Connection conn = DriverManager.getConnection(dburl);
    // SQLを送信
    conn.createStatement().executeUpdate(sql);
    // DB接続を閉じる
    conn.close();
  }
}
