package studicase_praktikum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Studicase_praktikum {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Mahasiswa> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        while(true){
        System.out.println(" 1. create \n 2. read \n 3. update \n 4. delete \n 5. exit \n Masukkan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        
        
            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> tampil();
                case 3 -> ubah();
                case 4 -> hapus();
                case 5 -> System.exit(0);
                default -> System.out.println("PILIHAN SALAH!");
            }
            System.out.println("\n\n");
        }
    }
    
    static void tambah() throws IOException{
        System.out.println("Masukkan Nama : ");
        String nama = br.readLine();
        
        System.out.println("Masukkan NIM : ");
        int nim = Integer.parseInt(br.readLine());
        
        System.out.println("Masukkan IPK : ");
        float ipk = Float.parseFloat(br.readLine());
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, ipk);
        list.add(mhs);
        System.out.println("Data Berhasil Ditambahkan.");
    }
    
    static void tampil(){
        if (list.isEmpty()){
            System.out.println("List Masih Kosong Wal...");
        }else{
            System.out.println("\n");
            for(int i = 0; i< list.size(); i++){
                System.out.print(i+1+"\t");
                System.out.print(list.get(i).getNama() + "\t");
                System.out.print(list.get(i).getNim() + "\t");
                System.out.println(list.get(i).getIpk());
            }
        }
    }
    
    static void ubah() throws IOException{
        tampil();
        System.out.println("Mau Ubah Data Ke Berapa : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        System.out.println("Mau Ubah Menjadi : ");
        
        System.out.println("Nama Baru: ");
        list.get(pilihan).setNama(br.readLine());
        
        System.out.println("NIM Baru: ");
        list.get(pilihan).setNim(Integer.parseInt(br.readLine()));
        
        System.out.println("IPK Baru: ");
        list.get(pilihan).setIpk(Float.parseFloat(br.readLine()));
        
        System.out.println("Data Berhasil Diubah...");
    }
    
    static void hapus() throws IOException{
        tampil();
        System.out.println("Mau Hapus Data Ke Berapa : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        list.remove(pilihan);
        System.out.println("Data Udah Dihapus YAK...");
    }
    
}
