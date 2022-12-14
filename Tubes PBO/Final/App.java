public class App {
    public App() {
    }

    public static void main(String[] args) {
        Komputer com1 = new Komputer(12, 10000);
        Komputer com2 = new Komputer(13, 9000);
        Member mem1 = new Member(1, "Alfian");
        Member mem2 = new Member(2, "Rizky");
        mem1.aksesKomputer(com1, 2);
        mem2.aksesKomputer(com2, 3);
        com1.displayStatus();
        mem1.tinggalkanKomputer(com1);
        com1.displayStatus();
    }
}
