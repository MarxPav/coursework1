//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static int EMPLOYEE_NUMBER = 10;
    private static Employee[] employees = new Employee[EMPLOYEE_NUMBER];

    public static void main(String[] args) {
        employees[0] = new Employee("Павел Петрович ", 80_300, 1);
        employees[1] = new Employee("Сергей Егорович ", 95_800, 2);
        employees[2] = new Employee("Анастасия Семёновна ", 55_550, 4);
        employees[3] = new Employee("Мария Дмитриевна ", 65_000, 4);
        employees[4] = new Employee("Пётр Анатольевич", 97_000, 2);
        employees[5] = new Employee("Алексей Петрович", 38_000, 3);
        employees[6] = new Employee("Сергей Станиславович", 33_000, 3);
        employees[7] = new Employee("Регина Баджуханяновна", 35_000, 3);
        employees[8] = new Employee("Исмаил Иргануинович", 50_800, 1);
        employees[9] = new Employee("Елена Анатольевна", 43_550, 5);

        printEmployees();

        int salarySum = getSalarySum();
        System.out.println("Сумму затрат на зарплату в месяц = " + salarySum);

        System.out.println("Сотрудник с минимальной зарплатой - " + getMinSumEmployee());

        System.out.println("Сотрудник с максимальной зарплатой - " + getMaxSumEmployee());

        System.out.println("Среднее значение зарплат = " + getAverageSalary());

        printEmployeesFullNames();
    }

    private static void printEmployees() {

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    private static int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    private static Employee getMinSumEmployee() {
        Employee minSumEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < minSumEmployee.getSalary()) {
                minSumEmployee = employee;
            }
        }

        return minSumEmployee;

    }

    private static Employee getMaxSumEmployee() {
        Employee maxSumEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > maxSumEmployee.getSalary()) {
                maxSumEmployee = employee;
            }
        }

        return maxSumEmployee;
    }
    private static double getAverageSalary() {
        return (double) getSalarySum() / employees.length;
    }

    private static void printEmployeesFullNames() {
        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника: " + employee.getFullName());
        }
    }
}