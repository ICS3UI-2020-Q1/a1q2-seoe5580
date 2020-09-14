import java.util.Scanner;

/**
 * This program allows you to divide in whole numbers with remainders
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creat a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // Asks the users how and what they want to divide
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    // lets the users input numbers for the answers
    int x1 = input.nextInt();
    int x2 = input.nextInt();

    // get the users answers
    int answer = x1 % x2;
    int answer2 = x1 / x2;

    // tells the users the answer
    System.out.println(answer2 + " with remainder of " + answer);

    //Mr Lamont, I know im not supposed to comment here but I don't know how to do it other wise, I try adding (x1 + '/' + x2 + "is" answer 2 + " with remainder of " + answer) but it would not work

  }
}
