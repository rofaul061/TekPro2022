package kasus3;

class KelasDua
{
    {
        System.out.println(5); //tidak ada pembuatan objek dengan class KelasDua sehingga tidak tampil pada output
    }
    
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu(); //semua atribut pada KelasSatu dipanggil
        KelasSatu dua = new KelasSatu(10);//Pemanggilan parameter agar menggunakan constructor int i
    }
}