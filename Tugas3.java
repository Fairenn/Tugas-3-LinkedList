import java.util.LinkedList;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        
        System.out.println("==TUGAS 3 LINKEDLIST (TAMBAHAN)==");

        LinkedList<String> nama = new LinkedList<>();
        LinkedList<String> nim = new LinkedList<>();
        LinkedList<String> alamat = new LinkedList<>();

        nama.add("FAIZ");
        nama.add("ABDULLAH");
        nim.add("2011522008");
        alamat.add("Koto");
        alamat.add("Tangah");

        do{
            Scanner pilihan = new Scanner(System.in);

            System.out.println("MENU FUNGSI PADA LINKEDLIST : ");
            System.out.println("1. menampilkan data sekarang");
            System.out.println("2. menghitung ukuran/size data");
            System.out.println("3. menambahkan elemen pada data");
            System.out.println("4. mengubah elemen pada data");
            System.out.println("5. mengambil elemen pada data");
            System.out.println("6. menghapus elemen pada data");
            System.out.println("7. mengecek ke-ada-an elemen pada data");
            System.out.println("8. keluar");

            System.out.printf("Pilihan : ");
            int menu = pilihan.nextInt();
            switch(menu){
                case 1:
                    //data sekarang
                    System.out.println("\n==DATA MAHASISWA==");
                    System.out.println("Nama : "+nama);
                    System.out.println("NIM : "+nim);
                    System.out.println("Alamat : "+alamat);
                    System.out.println("----------------------------------------");
                break;

                case 2:
                    //menghitung ukuran(size) objek
                    System.out.println("\n==menghitung ukuran/size objek==");

                    System.out.println("\nJumlah elemen pada Nama : "+nama.size());
                    System.out.println("Jumlah elemen pada NIM : "+nim.size());
                    System.out.println("Jumlah elemen pada Alamat : "+alamat.size());
                    System.out.println("----------------------------------------");
                break;

                case 3:
                    //menambahkan elemen pada objek
                    System.out.println("\n==menambahkan elemen pada objek==");
                    System.out.println("\n==DATA MAHASISWA SEKARANG==");
                    System.out.println("Nama : "+nama);
                    System.out.println("NIM : "+nim);
                    System.out.println("Alamat : "+alamat);

                    nama.addFirst("MUHAMMAD");
                    alamat.addLast("Padang");

                    System.out.println("\n==DATA MAHASISWA SETELAH DITAMBAH==");

                    System.out.println("Nama : "+nama);
                    System.out.println("NIM : "+nim);
                    System.out.println("Alamat : "+alamat);
                    System.out.println("----------------------------------------");
                break;

                case 4:
                    //mengubah elemen pada objek
                    System.out.println("\n==mengubah elemen pada objek==");
                    System.out.println("\n==DATA MAHASISWA SEKARANG==");
                    System.out.println("Nama : "+nama);
                    System.out.println("NIM : "+nim);
                    System.out.println("Alamat : "+alamat);

                    nama.set(1,"BIN");
                    alamat.set(0,"Tangah");

                    System.out.println("\n==DATA MAHASISWA SETELAH DIUBAH==");
                    System.out.println("Nama : "+nama);
                    System.out.println("NIM : "+nim);
                    System.out.println("Alamat : "+alamat);
                    System.out.println("----------------------------------------");
                break;

                case 5:
                    //mengambil elemen pada objek
                    System.out.println("\n==MENGAMBIL ELEMEN PADA OBJEK==");
                    System.out.println("\nelemen pertama pada nama yaitu : "+nama.getFirst());
                    System.out.println("elemen terakhir pada alamat yaitu : "+alamat.getLast());
                    System.out.println("----------------------------------------");
                break;

                case 6:
                    //menghapus elemen pada objek
                    System.out.println("\n==menghapus elemen pada objek==");
                    System.out.println("\n==DATA MAHASISWA SEKARANG==");
                    System.out.println("Nama : "+nama);
                    System.out.println("NIM : "+nim);
                    System.out.println("Alamat : "+alamat);

                    nama.remove(0);
                    alamat.removeFirst();

                    System.out.println("\n==DATA MAHASISWA SETELAH DIHAPUS==");
                    System.out.println("Nama : "+nama);
                    System.out.println("NIM : "+nim);
                    System.out.println("Alamat : "+alamat);
                    System.out.println("----------------------------------------");
                break;

                case 7:
                    //mengecek ke-ada-an elemen pada objek saat ini
                    System.out.println("\n==MENGECEK KEBERADAAN ELEMEN PADA OBJEK==");
                    System.out.println("\nADA ELEMEN DI OBJEK TU?");

                    if(nama.isEmpty()){
                        System.out.println("Objek Kosong");
                    }else{
                        System.out.println("Terdapat elemen dalam objek");
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 8:
                System.out.println("==TERIMA KASIH==");
                System.exit(0);
                

                default:
                System.out.println("\nPILIHAN TIDAK TERSEDIA");
                break;
            } 
        } while(true);
    }
}
