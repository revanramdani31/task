public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[3] = new Employee("Asabel Vidal", 1000000, 1, 11, 1993);

        // Naikkan gaji semua pegawai 5%
        for (Employee e : staff) e.raiseSalary(5);

        // Cetak sebelum sorting
        System.out.println("=== SEBELUM SORTING ===");
        for (Employee e : staff) e.print();

        // Lakukan sorting berdasarkan salary
        Sortable.shell_sort(staff);

        // Cetak sesudah sorting
        System.out.println("\n=== SESUDAH SORTING ===");
        for (Employee e : staff) e.print();
    }
}
