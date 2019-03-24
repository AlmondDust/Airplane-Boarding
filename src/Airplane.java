import java.io.*;
import java.util.stream.*;

public class Airplane {

    private static final int ROW_SPACING = 20;
    private static final int COL_SPACING = 20;

    private int[] seatPattern;
    private int rows;
    private int cols;



    Seat[][] seats;
    Passenger[] passengers;

    public Airplane(int rows, int ...seatPattern){
        this.rows = rows;
        this.seatPattern = seatPattern;

        //Get number of cols
        cols = IntStream.of(seatPattern).sum();

        this.seats = new Seat[rows][cols];
        this.passengers = new Passenger[numSeats()];

        for(int row = 0; row < seats.length; row++){
            for(int col = 0; col < seats[0].length; col++){
                seats[row][col] = new Seat(row, col);
                passengers[row*cols + col] = new Passenger(seats[row][col]);
            }
        }


    }

    public Airplane(String FileName){

    }

    private int numSeats(){
        return rows*cols;
    }
}
