
public class TestEmployee {
    public static void main() {
        try {
            Employee e1 = new Employee(1001, 20, "Alice", 3000, "123456789012345678");
            Employee e2 = new Employee(1002, 25, "Bob", 4000, "123456789012345679");

            Employee.showTotalEmployee();
            Employee.showTotalSalary();

            e1.addSalary(1000);
            Employee.showTotalSalary();

            e2.minusSalary(1000);

        } catch (EmptyException | AgeLowException | AgeHighException
                 | SalaryLowException | SalaryHighException | IllegalIdException e) {
            System.out.println(e.getMessage());
        }
    }
}

