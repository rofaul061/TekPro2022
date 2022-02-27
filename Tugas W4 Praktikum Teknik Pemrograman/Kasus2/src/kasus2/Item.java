package kasus2;

public class Item {
    private String name;
    private Item() {
        this.name = "Ipin"; //this ditambakan mengacu kepada variable yang dimiliki class Item
    }
    public Item(String name) {
     this.name = "Ipin"; //panambahan variable this.name diisi dengan string Ipin
     System.out.println(this.name);//menampilkan variable this.name
}
}