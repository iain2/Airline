package employee;

public abstract class Employee {

    private String name;
    rankType rank;



    public Employee(String name, rankType rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public rankType getRank(){
        return rank;
    }
}
