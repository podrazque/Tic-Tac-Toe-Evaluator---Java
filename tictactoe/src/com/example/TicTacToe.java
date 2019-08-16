package com.example;

public class TicTacToe {

    private static final int BOARD_SIZE = 9;

    public static Evaluation evaluateBoard(String boardState) {
        if (boardState == null || boardState.length() != BOARD_SIZE) { return Evaluation.InvalidInput; }
        char[] board = boardArrayCreator(boardState);
        if (unreachableState(board)) { return Evaluation.UnreachableState; }
        else if (xWinsTheGame(board)) { return Evaluation.Xwins; }
        else if (oWinsTheGame(board)) { return Evaluation.Owins; }
        { return Evaluation.NoWinner; }
    }

    private static char[] boardArrayCreator(String boardState) {
        boardState = boardState.toUpperCase();
        char[] board = new char[boardState.length()];
        for (int i = 0; i < boardState.length(); i++) {
            board[i] = boardState.charAt(i);
        }
        return board;
    }

    private static int[] occurrenceCounter(char[] board) {
        int xOccurrenceCounter = 0;
        int oOccurrenceCounter = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 'X') {
                xOccurrenceCounter++;
            } else if (board[i] == 'O') {
                oOccurrenceCounter++;
            }
        }
        return new int[] {xOccurrenceCounter, oOccurrenceCounter};
    }

    private static boolean checkForWinner(char[] board, char character) {
        if (board[0] == character && board[1] == character && board[2] == character) { return true; }
        if (board[3] == character && board[4] == character && board[5] == character) { return true; }
        if (board[6] == character && board[7] == character && board[8] == character) { return true; }
        if (board[0] == character && board[4] == character && board[8] == character) { return true; }
        if (board[2] == character && board[4] == character && board[6] == character) { return true; }
        if (board[0] == character && board[3] == character && board[6] == character) { return true; }
        if (board[1] == character && board[4] == character && board[7] == character) { return true; }
        if (board[2] == character && board[5] == character && board[8] == character) { return true; }
        else { return false; }
    }

//  equal amount of X and O occurrences (occurrenceReturn[1] == occurrenceReturn[0] && occurrenceReturn[1] > 1 & occurrenceReturn[0] > 1)
//  too many X occurrences (occurrenceReturn[0] - 1) > occurrenceReturn[1])
//  too many O occurrences (occurrenceReturn[1] > occurrenceReturn[0])
//  one more X occurrence than allowed ((occurrenceReturn[0] - 1) == occurrenceReturn[1])
//  no O and no X occurrences on the board (occurrenceReturn[0] == 0 && occurrenceReturn[1] == 0)

    private static boolean noWinner(char[] board) {
        int occurrenceReturn[] = occurrenceCounter(board);
        if (!checkForWinner(board, 'X') && !checkForWinner(board, 'O') || (occurrenceReturn[1] > occurrenceReturn[0]) || (occurrenceReturn[0] == 0 && occurrenceReturn[1] == 0)) { return true; }
        { return false; }
    }

    private static boolean xWinsTheGame(char[] board) {
        int occurrenceReturn[] = occurrenceCounter(board);
        if (checkForWinner(board, 'X') && !checkForWinner(board,'O') && !(board.length > BOARD_SIZE)
                && !noWinner(board) && !(occurrenceReturn[1] == occurrenceReturn[0] && occurrenceReturn[1] > 1 & occurrenceReturn[0] > 1)
                && !(occurrenceReturn[1] > occurrenceReturn[0]) && !((occurrenceReturn[0] - 1) > occurrenceReturn[1])) { return true; }
        { return false; }
    }

    private static boolean oWinsTheGame(char[] board) {
        int occurrenceReturn[] = occurrenceCounter(board);
        if (checkForWinner(board,'O') &&
                !checkForWinner(board, 'X') &&
                !(board.length > BOARD_SIZE) && !noWinner(board) &&
                (occurrenceReturn[1] == occurrenceReturn[0] && occurrenceReturn[1] > 1 & occurrenceReturn[0] > 1) && !(occurrenceReturn[1] > occurrenceReturn[0])) { return true; }
        { return false; }
    }

    private static boolean unreachableState(char[] board) {
        int occurrenceReturn[] = occurrenceCounter(board);
        if (((occurrenceReturn[0] - 1) > occurrenceReturn[1]) ||
                (checkForWinner(board, 'O') && ((occurrenceReturn[0] - 1) == occurrenceReturn[1]) ||
                        (occurrenceReturn[1] > occurrenceReturn[0]) &&
                                noWinner(board))) { return true; }
        { return false; }
    }
}
