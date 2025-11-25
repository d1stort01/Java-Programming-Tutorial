public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String idCard;

    private static int totalEmployee = 0;
    private static double totalSalary = 0.0;
    private static final double MIN_SALARY = 600.0;

    public Employee(int id, int age, String name) {
        if (age < 18) {
            throw new AgeLowException("Age is lower than 18");
        }
        if (age > 60) {
            throw new AgeHighException("Age is higher than 60");
        }
        if (name == null || name.isEmpty()) {
            throw new EmptyException("Name is empty");
        }
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Employee(int id, int age, String name, double salary, String idCard) {
        this(id, age, name);
        if (salary < MIN_SALARY) {
            throw new SalaryLowException("Salary is lower than MIN_SALARY");
        }
        this.salary = salary;
        this.idCard = idCard;
        totalEmployee++;
        totalSalary += salary;
    }

    public void addSalary(double salary) {
        double newSalary = this.salary + salary;
        if (newSalary > totalSalary) {
            throw new SalaryHighException("Salary is higher than TOTAL_SALARY");
        }
        this.salary = newSalary;
        totalSalary += salary;
    }

    public void minusSalary(double salary) {
        double newSalary = this.salary - salary;
        if (newSalary < MIN_SALARY) {
            throw new SalaryLowException("Salary is lower than MIN_SALARY");
        }
        this.salary = newSalary;
        totalSalary -= salary;
    }

    public static void showTotalSalary() {
        if (totalSalary <= 0) {
            throw new EmptyException("Total Salary is empty");
        }
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void showTotalEmployee() {
        if (totalEmployee <= 0) {
            throw new EmptyException("Total Employee is empty");
        }
        System.out.println("Total Employee: " + totalEmployee);
    }
}
