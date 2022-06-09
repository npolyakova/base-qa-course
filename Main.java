import java.util.*;

public class Main {
    public static void main(String[] args) {
      short number = 39;
      System.out.println("Десятки: " + number/10);
      System.out.println("Единицы: " + number%10);
      System.out.println("Сумма цифр: " + (number/10+number%10));
      System.out.println("Произведение цифр: " + ((number/10)*(number%10)));
  }
}