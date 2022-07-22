package employee;

public enum rankType {

    CAPTAIN( 1),
    FIRSTOFFICER(2),
    PURSER(3),
    FLIGHTATTENDANT(4);

    private final int rank;


    rankType(int rank){this.rank = rank;};

    int getRank(){
        return this.rank;
    }
}
