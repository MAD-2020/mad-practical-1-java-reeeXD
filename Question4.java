import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    while (number != 0) {
	    for (int j = 0; j < number; j++){
		    System.out.print("*");
	    }
      System.out.println();
      number = number - 1;
    }
  }
}
