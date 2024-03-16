package lk.ijse.dep.service;

public interface Board {
    int NUM_OF_ROWS=5;
    int NUM_OF_COLS=6;

    boolean isLegalMove(int col);

    void updateMove(int col, Piece piece);

    void updateMove(int col, int row, Piece move);

    BoardUI getBoardUI();

    Winner findWinner();

    boolean existLegalMoves();

    int findNextAvailableSpot(int i);

    Piece[][] getPieces();
}
