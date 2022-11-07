//Revi putra hernel 2111523022

public class Mahasiswa extends Elemen{

private int sks;

public int jamSibuk;

public Mahasiswa(String nama, int sks) {
    super(nama);
    jamSibuk = sks * 3;

    }   
    public int getJamSibuk(){
    return jamSibuk;    
    }

    public void tampilkan(){
    System.out.println(nama + " adalah Mahasiswa dengan jam sibuk" + " " + jamSibuk);
    }
}

class Asdos extends Mahasiswa{

private int jamNgasdos;

public Asdos(String nama, int sks, int jamNgasdos) {

super(nama,sks);

jamSibuk = jamSibuk + jamNgasdos;

    }

public int getJamSibuk(){

return jamSibuk;
    }
public void tampilkan(){

System.out.println(nama + " adalah Asdos dengan jam sibuk" + " " + jamSibuk);
    }
    
}


