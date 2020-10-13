import java.util.Scanner;
/**
 * a program that gets the first digit from a user entered number
 * @author Daniel Rahmani
 */
public class Main {

  public static int firstDigit(int digit){
    do{
      // divide by 10 until theres 1 number
      digit = digit / 10;
    }while(digit >= 10);
    int firstDigit = digit % 10;
    return firstDigit;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number
    System.out.println("Please enter a number");
    int n = input.nextInt();
    // calculate the first digit
    int answer = firstDigit(n);
    System.out.println(answer);
    
  }
}
