public class Passenger {

    int[] coordinate = new int[2];

    Seat seat;
    boolean seated;
    boolean hasBag;

    float angle;

    public Passenger(Seat seat){
        this.seat = seat;
    }

    public int[] getCoordinate() {
        return coordinate;
    }

    public Seat getSeat() {
        return seat;
    }

    public boolean isSeated() {
        return seated;
    }

    public boolean isHasBag() {
        return hasBag;
    }

    public float getAngle() {
        return angle;
    }
}
