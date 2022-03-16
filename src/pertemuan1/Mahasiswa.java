package pertemuan1;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public void setNama(String namaBaru) {
        nama = namaBaru;
    }
}
