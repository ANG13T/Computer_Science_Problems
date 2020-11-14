import java.util.*;

public class DecimalDisplay{
  public void showDisplay(int decimal){
    double length = Math.ceil(Math.log10(decimal + 1));
    for(double i = length; i > 0; i--){
      double placeVal = Math.pow(10, i - 1);
      double result = (decimal / placeVal) % 10;
      System.out.println(Math.floor(result) + " x " + String.valueOf(placeVal));
    }
  }
}
