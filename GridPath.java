public class GridPath 
{
    public GridPath(int[][] values)
    {
        gid = values;
    }
    

    public int sumPath(int row, int col)
    {
        return 0;
    }

    /** Initialized in the constructor with distinct values that never change */
    private int[][] grid;

    public String toString()
    {
        String s = "";
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                s += grid[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public String toString()
    {
        String s = "";
        for (int[] row : grid)
        {
            for (int col : row)
            {
                s += col + " ";
            }
            s += "\n";
        }
        return s;
    }


    /**
     * Returns the Location representing a neighbor of the grid element at row and
     * col,
     * as described in part (a)
     * Preconditions: row is a valid row index and col is a valid column index in
     * grid.
     * row and col do not specify the element in the last row and last column of
     * grid.
     */
    public Location getNextLoc(int row, int col) 
    {
        return null;
    }
}
