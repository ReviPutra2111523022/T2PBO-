public class Dosen extends Elemen{

public int jamSibuk;

private int jumlahHariKerja;

public Dosen(String nama, int jumlahHariKerja) {

super(nama);

jamSibuk = jumlahHariKerja * 8;
        
    }

public void tampilkan(){

System.out.println(nama + " adalah dosen dengan jam sibuk" + " " + jamSibuk);
    }
public int getJamSibuk(){
    
return jamSibuk;
    }
}
