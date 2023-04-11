package ex6.sec06;

public class AnoymousDemo {
  Bird e = new Bird(){
    @Override
    void move() {
      System.out.println("독수리가 날아간다.");
    }

    void sound(){
      System.out.println("휘익~~");
    }
  };

  public static void main(String[] args) {
    AnoymousDemo a = new AnoymousDemo();
    a.e.move();
    //a.e.sound();
  }
}


