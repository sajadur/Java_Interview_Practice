package problem_solving;

public class Rat_In_Maze {

    int[][] maze;
    int size;

    public Rat_In_Maze(int size) {
        this.maze = new int[size][size];
        this.size = size;
    }

    public boolean solution(){
        return solution(0,0);
    }
    public boolean solution(int i, int j){
        if(i== size-1 && j== size-1 && maze[i][j] == 0){
            return true;
        }

//        System.out.println(i +" , " +j);

        if(i<0 || j<0 || i>=size || j>=size) return false;

        maze[i][j] = 1;
        if(solution(i,j+1) ||
           solution(i+1,j)){
            return true;
        }

        maze[i][j] = 0;
        return false;
    }

    public void printSolution() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(maze[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String... args){
        Rat_In_Maze rat_in_maze = new Rat_In_Maze(10);
        if(rat_in_maze.solution()){
            rat_in_maze.printSolution();
        }
    }
}
