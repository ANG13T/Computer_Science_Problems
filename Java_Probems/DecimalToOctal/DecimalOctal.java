import java.util.*;
//convert decimal (base 10) to octal format (base 8)
public class DecimalOctal{
  public int convertToOctal(int decimal){
    int i = 0;
    while(Math.pow(8, i) <= decimal){
      i++;
    }

    System.out.println(i);
    return decimal;
  }
}
