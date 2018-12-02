
/**
 * Sudoku game board class.
 * 
 * @author Sven 
 * @version 10.11.18
 */
public class Board
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int[][] felder;
    private Boolean[][] felderfixed;

    public Board()
    {
        felder = new int[9][9];
        /* for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                felder[i][j] = 0;
            }
        }
        default value is 0 anyway
        */
        //marks wether initial value or not
        felderfixed = new Boolean[9][9];
        /* for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                felderfixed[i][j] = false;
            }
        }
        default value is false
        */
    }

    public void setBoard(int x, int y, int z)
    {
        if(felderfixed[x][y] != false)
        {
            felder[x][y] = z;
        }
    }
    
    public int getBoard(int x, int y)
    {
        return felder[x][y];
        
    }

    public void setFixed()
    {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(felder[i][j] != 0)
                {
                    felderfixed[i][j] = true;
                }
            }
        }
    }
}
