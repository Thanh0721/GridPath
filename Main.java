public class Main {
    public static void main(String[] args) 
    {
        int[][] grid = 
        {
            {4, 8, 2, 3},
            {6, 1, 9, 5},
            {7, 3, 4, 6},
            {9, 6, 2, 8}
        };

        GridPath gridPath = new GridPath(grid);

        int startRow = 0;
        int startCol = 0;

        int totalSum = gridPath.sumPath(startRow, startCol);
        System.out.println("Total path sum starting from (0, 0): " + totalSum);

        System.out.println("Path taken from (0, 0):");
        int row = startRow;
        int col = startCol;
        while (row < grid.length - 1 || col < grid[0].length - 1) 
        {
            System.out.println("Current location: (" + row + ", " + col + ") with value: " + grid[row][col]);
            Location nextLoc = gridPath.getNextLoc(row, col);
            row = nextLoc.getRow();
            col = nextLoc.getCol();
        }
        
        System.out.println("Final location: (" + row + ", " + col + ") with value: " + grid[row][col]);
    }
}
