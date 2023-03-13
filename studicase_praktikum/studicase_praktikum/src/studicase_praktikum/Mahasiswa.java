package studicase_praktikum;

class Mahasiswa {
    private String nama;
    private int nim;
    private float ipk;
    
    public Mahasiswa(String nama, int nim, float ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getNim() {
        return nim;
    }
    
    public void setNim(int nim) {
        this.nim = nim;
    }
    
    public float getIpk() {
        return ipk;
    }
    
    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}
