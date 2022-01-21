public class employee {
    private int id;
    private String firstname;
    private String lastname;
    private String name;
    static int idnm = 1;
    private double salary;
    private double annualsalary;
    employee(){
        id = idnm;
        firstname = "";
        lastname = "";
        name = firstname + lastname;
        salary = 5;
        annualsalary = salary*12;
        idnm++;
    }
    employee(int id, String firstname, String lastname, int salary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.name = firstname + " " + lastname;
        this.salary = salary;
        this.id = idnm;
        idnm++;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualsalary() {
        return annualsalary;
    }

    public void setAnnualsalary(int annualsalary) {
        this.annualsalary = annualsalary;
    }

    public void raiseSalary(double percent){
        double newsalary = percent * salary + salary;
        salary = newsalary;
    }
}
