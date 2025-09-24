class Employee extends Sortable {
    private String name;
    protected double salary;
    private int hireday, hiremonth, hireyear;

    public Employee(String n, double s, int d, int m, int y) {
        name = n;
        salary = s;
        hireday = d;
        hiremonth = m;
        hireyear = y;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public int hireYear() {
        return hireyear;
    }

    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return +1;
        return 0;
    }
}
