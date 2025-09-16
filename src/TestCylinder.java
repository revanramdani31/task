public class TestCylinder {
    public static void main(String[] args) {
        // Membuat objek Cylinder dengan radius=2.0 dan height=10.0
        Cylinder c1 = new Cylinder(2.0, 10.0);

        // Uji luas permukaan
        System.out.println("Surface area: " + c1.getArea());

        // Uji volume
        System.out.println("Volume: " + c1.getVolume());

        // Menguji method toString() yang sudah dioverride
        System.out.println("Hasil toString() dari Cylinder:");
        System.out.println(c1.toString());

        // Bisa juga langsung dicetak tanpa memanggil toString()
        System.out.println("Cetak objek langsung:");
        System.out.println(c1);

    }
}
