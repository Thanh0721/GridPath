public class GridPath 
{
    private int[][] grid;

    public GridPath(int[][] grid) 
    {
        this.grid = grid;
    }

    public Location getNextLoc(int row, int col) 
    {
        int numRows = grid.length;
        int numCols = grid[0].length;
        int belowRow = row + 1;
        int rightCol = col + 1;

        boolean hasBelow = belowRow < numRows;
        boolean hasRight = rightCol < numCols;

        if (!hasBelow && !hasRight) 
        {
            return null;
        } else if (!hasBelow) {
            return new Location(row, rightCol);
        } else if (!hasRight) {
            return new Location(belowRow, col);
        } 
        else 
        {
            if (grid[belowRow][col] <= grid[row][rightCol]) 
            {
                return new Location(belowRow, col);
            } else {
                return new Location(row, rightCol);
            }
        }
    }

    public int sumPath(int row, int col) 
    {
        int sum = 0;
        while (row < grid.length - 1 || col < grid[0].length - 1) 
        {
            sum += grid[row][col];
            Location nextLoc = getNextLoc(row, col);
            row = nextLoc.getRow();
            col = nextLoc.getCol();
        }

        sum += grid[row][col];
        return sum;
    }
}
