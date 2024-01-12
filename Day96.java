package Day96;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList nmaHewan = new ArrayList();
        
        nmaHewan.add ("jerapa");
        nmaHewan.add ("buaya");
        nmaHewan.add ("monyet");
        nmaHewan.add ("serigala");
        nmaHewan.add ("harimau");
        nmaHewan.add ("ikan");
        nmaHewan.add ("kelinci");
        nmaHewan.add ("panda");
        nmaHewan.add ("ayam");
        nmaHewan.add ("sapi");
        System.out.print("nama hewan : " + nmaHewan);
        
        //fungsi menghapus index
        nmaHewan.remove(3);
        System.out.println("\n\nnama hewan yang di hapus : " + nmaHewan);
        
        //fungsi menambah index
        nmaHewan.add("biawak");
        System.out.println("\nnama hewan yang di tambahkan : " + nmaHewan);
        
        //menampilkan index sesuai yang di inginkan
        System.out.println("\nnama hewan di index ke-8 : " + nmaHewan.get(8));
        
        
    }
    
}
