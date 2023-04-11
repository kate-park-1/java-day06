package ex6.sec03;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    //list.add("1234");
    //list.add(2.0);
    //list.add(3L);
    int res = list.get(0) + 1;
    System.out.println(res);
  }
}
