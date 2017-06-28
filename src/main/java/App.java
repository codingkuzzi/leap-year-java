import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    while (true) {
      System.out.println("Enter a year, we'll tell you if it's a leap year:");
      int intYear = Integer.parseInt(myConsole.readLine());
      LeapYear leapYear = new LeapYear();
      boolean leapYearResult = leapYear.isLeapYear(intYear);
      System.out.println("Is that year a leap year?" + leapYearResult);
    }  
  }
}
