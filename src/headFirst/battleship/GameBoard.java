package headFirst.battleship;

public class GameBoard {
    private Tuple<Integer, Integer> shipCoordinates;
    private int row;
    private int column;

    public GameBoard(Tuple<Integer, Integer> shipCoordinates, int row, int column) {
        this.shipCoordinates = shipCoordinates;
        this.row = row;
        this.column = column;
    }

    public Tuple<Integer, Integer> getShipCoordinates() {
        return shipCoordinates;
    }

    public void setShipCoordinates(Tuple<Integer, Integer> shipCoordinates) {
        this.shipCoordinates = shipCoordinates;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Integer[][] generateBoard(int row, int column){
        Integer[][] board = new Integer[row][column];
        return board;
    }
}


