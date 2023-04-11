public class ExceptionDemo {
  public static void main(String[] args) throws Exception {

    Thread.sleep(100);

    int[] arr = {1, 2, 3};

    System.out.println("예외처리 적용");
    try {
      //System.out.println(1 / 0);
      System.out.println(arr[3]);
//      String s;
//      System.out.println(s.isEmpty());
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      //System.out.println("0 으로 나눌 수 없습니다.");
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("프로그램 종료");
    }
//    System.out.println("예외처리 미적용");
//    System.out.println(arr[3]);
  }
}
