public class GridPath 
{
    private int[][] grid;

    public GridPath(int[][] values)
    {
        grid = values;
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for (int[] row : grid)
        {
            for (int col : row)
            {
                s.append(col).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
