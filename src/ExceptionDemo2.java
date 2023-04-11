public class ExceptionDemo2 {
  public static void main(String[] args) {

    try {
      test1("123");
      test1("abc");
    } catch (NumberFormatException e) {
      System.out.println("숫자로 변환할 수 없는 문자열입니다.");
      System.out.println(e.getMessage());
    } finally {
    }
  }

  private static void test1(String s) throws NumberFormatException{
    int n = Integer.parseInt(s);  // "123" (O), "abc" (X)
    System.out.println(n);
  }

}
