public class TestHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing(3, "betina", 1.5);
        Musang musang = new Musang(1, "Jantan", 0.5);
        Kelinci kelinci = new Kelinci(2, "Jantan", 0.8);


        kucing.walk();
        kucing.eat();
        kucing.sleep();

        musang.walk();
        musang.eat();
        musang.sleep();

        kelinci.walk();
        kelinci.eat();
        kelinci.sleep();
    }
}
