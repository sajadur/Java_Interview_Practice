package problem_solving;

public class KnightTour {

    private int[][] board;
    private int size;

    public KnightTour(int size) {
        board = new int[size][size];
        this.size = size;
    }

    public boolean solve() {
        return solve(0, 0, 1);
    }

    public boolean solve(int i, int j, int counter) {
        if (counter == size * size + 1) return true;

        if (i < 0 || j < 0 || i >= size || j >= size || board[i][j] != 0) {
            return false;
        }

        board[i][j] = counter;

        if (
                solve(i - 2, j - 1, counter + 1) ||
                        solve(i - 1, j - 2, counter + 1) ||
                        solve(i + 1, j - 2, counter + 1) ||
                        solve(i + 2, j - 1, counter + 1)||
                        solve(i + 2, j + 1, counter + 1) ||
                solve(i + 1, j + 2, counter + 1) ||
                solve(i - 1, j + 2, counter + 1) ||
                solve(i - 2, j + 1, counter + 1)
                ){
            return true;
        }
        board[i][j] = 0;
        return false;
    }

    public void printSolution() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        KnightTour tour = new KnightTour(8);
        if (tour.solve() == true) {
            tour.printSolution();
        } else {
            System.out.println("Not Solution exists");
        }
    }
}
