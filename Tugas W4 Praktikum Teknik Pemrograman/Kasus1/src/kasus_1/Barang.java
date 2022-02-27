package kasus_1;

public class Barang{
    
    //attribute (ditambah private untuk pembungkusan setStok)
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    //constructor
      public Barang(String kode, String nama, int stk){
       this.kode_barang = kode;
       this.nama_barang = nama;
       this.stok = stk;
      } //penambahan this. untuk pembungkusan setStok
      
      //accessor
      public String getKode() {//untuk mendapatkan kode
          return this.kode_barang;
      }
      
      //accessor
      public String getNama() {//untuk mendapatkan nama barang
          return this.nama_barang;
      }
      
      //accessor
      public int getStok() {//untuk mendapatkan stok
          return this.stok;
      }
      
      //mutator
      public void setStok(int stk){//untuk membungkus statemnet yang hanya berisi += 
          this.stok += stk;
      }
}