public class Wand {
  private String name;     // 杖の名前
  private double power;    // 杖の魔力
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    if(name == null || name.length() < 3) {
      throw new IllegalArgumentException("杖に設定すべき名前は3文字以上です。");
    }
    this.name = name;
  }
  public double getPower() {
    return this.power;
  }
  public void setPower(double power) {
    if(power < 0.5 && 100 < power) {
      throw new IllegalArgumentException("杖による増幅率は0.5以上100以下です。");
    }
    this.power = power;
  }
}
