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
    return ((long) this.a + (long) this.b > this.c
            && (long) this.a + (long) this.c > this.b
            && (long) this.b + (long) this.c > this.a);
  }

}
