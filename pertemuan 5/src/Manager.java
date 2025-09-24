import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    @Override
    public int compare(Sortable b) {
        if (b instanceof Manager) {
            Manager m = (Manager) b;
            return Integer.compare(this.hireYear(), m.hireYear());
        } else if (b instanceof Employee) {
            Employee e = (Employee) b;
            if (this.salary < e.salary) return -1;
            if (this.salary > e.salary) return +1;
            return 0;
        }
        return 0;
    }
}
