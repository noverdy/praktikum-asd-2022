package pertemuan11;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashTableOpenHashing hash = new HashTableOpenHashing(7);

        hash.insert("Hello");
        hash.insert("Halo");
        hash.insert("Hai");
        hash.insert("Test");
        hash.insert("Test");
        hash.printTable();
//
//        HashMap<String, Integer> hariDalamBulan = new HashMap<>();
//        hariDalamBulan.put("Januari", 31);
//        hariDalamBulan.put("Februari", 28);
//        hariDalamBulan.put("Maret", 31);
//        hariDalamBulan.put("April", 30);
//        hariDalamBulan.put("Mei", 31);
//
//        System.out.println(hariDalamBulan.get("Desember"));
    }
}
