package employee;

public class CabinCrewMember extends Employee {


    public CabinCrewMember(String name, rankType rank){
        super(name, rank);
    }

    public String relayMessage(String message){
        return message;
    }

}
