package employee;

public class Pilot extends Employee{

    private String pilotsLicense;

    public Pilot(String name, rankType rank, String pilotsLicense) {
        super(name, rank);
        this.pilotsLicense = pilotsLicense;
    }

    public String getPilotsLicense() {
        return pilotsLicense;
    }

    public String drivePlane() {
        return "Brrrrr";
    }
}
