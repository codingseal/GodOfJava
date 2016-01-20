package d.lang;

public class JavaLang {
  public static void main(String[] args) {
    JavaLang sample = new JavaLang();
    // sample.numberTypeCheck();
    // sample.numberMinMaxCheck();
    // sample.integerMinMaxCheck();
    // sample.systemProperties();
    sample.mathCheck2();
  }
  public void numberTypeCheck() {
    String value1 = "3";
    String value2 = "5";
    byte byte1 = Byte.parseByte(value1);
    byte byte2 = Byte.parseByte(value2);

    System.out.println(byte1 + byte2);

    Integer refInt1 = Integer.valueOf(value1);
    Integer refInt2 = Integer.valueOf(value2);
    System.out.println(refInt1 + refInt2 + "7");
  }

  public void numberMinMaxCheck() {
    long startTime = System.currentTimeMillis();
    long startNanoTime = System.nanoTime();
    System.out.println("Byte min=" + Byte.MIN_VALUE + " max=" + Byte.MAX_VALUE);
    System.out.println("Short min=" + Short.MIN_VALUE + " max=" + Short.MAX_VALUE);
    System.out.println("Integer min=" + Integer.MIN_VALUE + " max=" + Integer.MAX_VALUE);
    System.out.println("Long min=" + Long.MIN_VALUE + " max=" + Long.MAX_VALUE);
    System.out.println("Float min=" + Float.MIN_VALUE + " max=" + Float.MAX_VALUE);
    System.out.println("Double min=" + Double.MIN_VALUE + " max=" + Double.MAX_VALUE);
    System.out.println("Character min=" + (int)Character.MIN_VALUE + " max=" + (int)Character.MAX_VALUE);
    System.out.println("Milli seconds=" + (System.currentTimeMillis() - startTime));
    System.out.println("Nano seconds=" + (System.nanoTime() - startNanoTime));
  }

  public void integerMinMaxCheck() {
    System.out.println("Integer BINARY min=" + Integer.toBinaryString(Integer.MIN_VALUE));
    System.out.println("Integer BINARY max=" + Integer.toBinaryString(Integer.MAX_VALUE));
  }

  public void systemProperties() {
    System.out.println("java.version=" + System.getProperty("java.version"));
    System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));
  }

  public void mathCheck2() {
    double[] numbers = new double[] {
      3.15, 3.62, -3.15, -3.62
    };

    for (double number : numbers) {
      System.out.println(number);
      System.out.print("Math.round()=" + Math.round(number));
      System.out.print(" Math.rint()=" + Math.rint(number));
      System.out.print(" Math.ceil()=" + Math.ceil(number));
      System.out.print(" Math.floor()=" + Math.floor(number));
      System.out.println();
    }
  }
}
