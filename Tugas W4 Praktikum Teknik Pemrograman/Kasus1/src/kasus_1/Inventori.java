package kasus_1;

public class Inventori {
    Barang[] barangs;  //deklarasi class Barang bervariable barangs dengan tipe data array
    
    //(Methods)
    void initBarang() { //untuk menginisialisasi objek Barang
        barangs = new Barang[2]; //untuk menginstansiasi(new)barangs
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    //(Methods)
    void showBarang() { //menampilkan nilai dari variable nama_barang dan stok
        System.out.println(barangs[0].getNama() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNama() + "(" + barangs[1].getStok() + ")");  
    }
    
    //(Methods)
    void pengadaan() { //proses pengadaan stok
        initBarang();
        
        barangs[0].setStok(20);
       // barangs[0].stok -= 30; //Bisa juga dikurangi dong?
       // barangs[0].stok *= 30; //dikali juga bisa dong??
        showBarang();
    }
    
    //(Main Method)
    public static void main(String[] args) {
        Inventori beli = new Inventori(); //instansiasi variable beli dengan class Inventori
        beli.pengadaan();  //memanggil variable beli dengan methods pengadaan
    }
}   