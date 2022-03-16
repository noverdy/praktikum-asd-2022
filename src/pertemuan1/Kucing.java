package pertemuan1;

public class Kucing {
    String jenis;
    String warna;

    public Kucing(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
    }

    public void ngomong() {
        if (warna.equalsIgnoreCase("oren")) {
            System.out.println("AAAARRRH");
        }
        else {
            System.out.println("Meooong");
        }
    }
}
