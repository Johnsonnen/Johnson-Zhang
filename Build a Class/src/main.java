public class main {
    public static void main(String[]args) {
        employee John = new employee(5, "John", "Zhou", 15);
        System.out.println(John.getFirstname());
        System.out.println(John.getSalary());
        John.raiseSalary(0.5);
        System.out.println(John.getSalary());
    }
}