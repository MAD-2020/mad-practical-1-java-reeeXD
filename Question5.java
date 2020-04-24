import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Length of numbers to be entered: ");
    int size = in.nextInt();
    int mode = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < size; i++){
      System.out.print("Enter number to be added: ");
      int number = in.nextInt();
      list.add(number);
    }
    int maxCount = 0;
    for (int i = 0; i < list.size(); i++){
      int value = list.get(i);
      int count = 0;
      for (int j = 0; j < list.size(); j++){
        if (list.get(j) == value){
          count++;
        }
        if (count > maxCount){
          mode = value;
          maxCount = count;
        }
      }
    }
    System.out.print(mode);
  }
}
