public class Seat {

    private int row;
    private int col;
    private int group;

    public Seat(int row, int col, int group) {
        this.row = row;
        this.col = col;
        this.group = group;
    }

    public Seat(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getSeatName(){
        return String.format("%d%c", row, col + 65);
    }

    public String toString(){
        return String.format("Seat:%d%c Group: %d", row, col + 65, group);
    }
}
