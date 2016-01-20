package d.string.practice;

public class UseStringMethods {
  public static void main(String[] args) {
    UseStringMethods sample = new UseStringMethods();
    String text = "The String class represents character strings.";
    sample.printWords(text);
    sample.findString(text, "string");
    sample.findAnyCaseString(text, "string");
    sample.countChar(text, 's');
    sample.printContainWords(text, "sd");
    }

  public void printWords(String str) {
    String[] splitArray = str.split(" ");
    for (String string : splitArray) {
      System.out.println(string);
    }
  }

  public void findString(String str, String findStr) {
    int index = str.indexOf(findStr);
    System.out.println(findStr + " is appeared at " + index);
  }

  public void findAnyCaseString(String str, String findStr) {
    int index = str.toLowerCase().indexOf(findStr.toLowerCase());
    System.out.println(findStr + " is appeared at " + index);
  }

  public void countChar(String str, char c) {
    char[] charArr = str.toCharArray();
    int charCount = 0;
    for (char ch : charArr) {
      if (c == ch) {
        charCount++;
      }
    }
    System.out.println("char '" + c + "' count is " + charCount);
  }

  public void printContainWords(String str, String findStr) {
    String[] strArr = str.split(" ");
    boolean containFlag = false;
    for (String string : strArr) {
      if (string.contains(findStr)) {
        containFlag = true;
        break;
      }
    }
    if (containFlag) {
      System.out.println("class contains " + findStr);
    } else {
      System.out.println("class doesn't contain " + findStr);
    }
  }
}
