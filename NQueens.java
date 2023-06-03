public class NQueens {
    private static final int N = 8; // Number of queens and board size

    public static void main(String[] args) {
        solveNQueens();
    }

    public static void solveNQueens() {
        int[][] board = new int[N][N]; // Chessboard represented as a 2D array

        if (solveNQueensUtil(board, 0)) {
            printSolution(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean solveNQueensUtil(int[][] board, int col) {
        if (col >= N) {
            return true; // All queens have been placed successfully
        }

        for (int row = 0; row < N; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place the queen

                if (solveNQueensUtil(board, col + 1)) {
                    return true;
                }

                board[row][col] = 0; // Backtrack and remove the queen
            }
        }

        return false; // No safe placement found in this column
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        // Check if a queen can be placed at the given position without being attacked

        // Check the row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check the upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the lower diagonal on the left side
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true; // It is safe to place a queen at the given position
    }

    public static void printSolution(int[][] board) {
        // Print the final placement of queens on the chessboard
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

