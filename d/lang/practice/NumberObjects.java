package d.lang.practice;

public class NumberObjects {
  public static void main(String[] args) {
    NumberObjects sample = new NumberObjects();
    sample.parseLong("hello");
    sample.printOtherBase(1024);
  }

  public long parseLong(String data) {
    long longData;
    try {
      longData = Long.parseLong(data);
    } catch (NumberFormatException ex) {
      System.out.println(data + " is a not number");
      return -1;
    }

    System.out.println(longData);
    return longData;
  }

  public void printOtherBase(long value) {
    System.out.println("Original: " + value);
    System.out.println("Binary  : " + Long.toBinaryString(value));
    System.out.println("Hex     : " + Long.toHexString(value));
    System.out.println("Octal   : " + Long.toOctalString(value));
  }
}
