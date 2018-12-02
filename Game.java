
/**
 * Sudoku main class
 * 
 * @author Sven 
 * @version 24.11.18
 */
import java.util.*;
public class Game
{

    public static void main(String[] args)
    {
        Game sudoku = new Game();
        Board spielfeld = new Board();
        
        
        //sudoku.input(spielfeld);
        sudoku.output(spielfeld);
        System.out.println("what do you want to do?");
        System.out.println("enter a for adding a number to one of the fields");
        Scanner idle = new Scanner(System.in);
        String todo = idle.next();
        
    }
    
    public void output(Board b)
    {
        //int brett[][] = b.getBoard();
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                System.out.print(b.getBoard(i, j) + " ");
            }
            System.out.print("\n");
        }
        //System.out.println(Arrays.deepToString(b.getBoard()));
    }
    
    public void input(Board b)
    {
        System.out.print("enter number 1 <= x <= 9: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt() - 1;
        System.out.print("enter number 1 <= y <= 9: ");
        int y = in.nextInt() - 1;
        System.out.print("enter number 1 <= value <= 9: ");
        int z = in.nextInt();
        b.setBoard(x, y, z);
    }
    
    public Boolean check(Board b)
    {
        //int brett[][] = b.getBoard();
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(b.getBoard(i, j) < 0 || b.getBoard(i, j) > 9)
                {
                    System.out.println("wrong data");
                    return false;
                }
            }
        }
        for(int i = 0; i < 9; i++)
        {
            int x = 0;
            for(int j = 0; j < 9; j++)
            {
                x = x + b.getBoard(i, j);
                if(x != 45)
                {
                    System.out.println("not a solution");
                    return false;
                }  
            }
        }
        return false;
    }
}
