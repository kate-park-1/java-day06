package exercise7;

import exercise7.Controller;
import exercise7.Radio;
import exercise7.TV;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] controllers = {new TV(false), new Radio(true)};
    for(Controller controller : controllers) {
      controller.show();
    }
  }
}

