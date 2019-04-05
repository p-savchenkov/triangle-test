public class Triangle {

  private int a;
  private int b;
  private int c;

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  public boolean isValid(){
    return ((long) this.getA() + (long) this.getB() > this.getC()
            && (long) this.getA() + (long) this.getC() > this.getB()
            && (long) this.getB() + (long) this.getC() > this.getA());
  }

}
