class Manusia{
    private String nama;
    private Uang uang;

    Manusia(String nilai){
        this.nama=nilai;
    }

    public void setUang(Uang uang){
        this.uang=uang;
    }

    public void status(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Punya uang "+this.uang.getUang());
    }

    public String getNama(){
        return this.nama;
    }
}

class Uang{
    private int kembalian;
    private int uang;
    private Manusia manusia;
    private Barang barang;

    Uang(){
        this.uang = 150000;
    }

    public int getUang(){
        return this.uang;
    }

    public void setManusia(Manusia manusia){
        this.manusia=manusia;
    }

    public void beli(){
        System.out.println("Saya membeli "+this.barang.getNama()+" seharga "+this.barang.getHarga());
        if (this.uang > this.barang.getHarga()){
            kembalian = this.uang - this.barang.getHarga();
        }else{
            kembalian = 0;
            this.uang-=kembalian;
        }
    }

    public int getKembalian(){
        return kembalian;
    }

    public void setBarang(Barang barang){
        this.barang=barang;
    }
}

class Barang{
    private String nama;
    private int harga;

    Barang(String nilai,int value){
        this.nama=nilai;
        this.harga=value;
    }

    public int getHarga(){
        return this.harga;
    }

    public String getNama(){
        return this.nama;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Manusia orang1 = new Manusia("Adam");
        Barang barang1 = new Barang("Tas", 75000);
        Uang nominal1 = new Uang();
        orang1.setUang(nominal1);
        nominal1.setManusia(orang1);
        orang1.status();
        nominal1.setBarang(barang1);
        nominal1.beli();
        System.out.println("sisa uang adalah "+nominal1.getKembalian());

        System.out.println("-");
        System.out.println("GANTI ORANG");
        System.out.println("-");

        Manusia orang2 = new Manusia("Adam");
        Barang barang2 = new Barang("Sepatu",50000);
        orang2.setUang(nominal1);
        nominal1.setManusia(orang2);
        orang2.status();
        nominal1.setBarang(barang2); 
        nominal1.beli();
        System.out.println("Sisa uang adalah "+nominal1.getKembalian());
    }
}
