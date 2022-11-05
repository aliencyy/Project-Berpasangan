package Project_Berpasangan;
import java.util.Scanner;


/**
 * @author Kelsy Amirah dan Najla Raihana Kamila
 * @version 01-11-2022
 */
public class MainLaundry {
    public static void main(String[] args) {
        /**
         * Inisialisasi variabel
         */
        int pilihan;
        int pilihanJasa;
        int pilihanPaket;
        String namaPelanggan;
        int noHp;
        String alamatPelanggan;
        int jumlahItem;
        double jumlahHarga;
        Scanner ldr = new Scanner(System.in);

        /**
         * Membuat objek yang akan digunakan di class main
         */
        Pakaian pakaian = new Pakaian();
        Selimut selimut = new Selimut();
        tasSepatu tassepatu = new tasSepatu();
        Boneka boneka = new Boneka();

        System.out.println("Selamat datang di Laundry Time!");
        System.out.println("Berikut paket yang dapat dipilih");
        System.out.println("+------------------------------------------------------------------------------------------------------------+");
        System.out.println("|\tPakaian\t\t|\tSelimut\t\t|\tTas dan Sepatu\t\t|\t   Boneka   \t     |");
        System.out.println("+------------------------------------------------------------------------------------------------------------+");
        System.out.println("|      PAKET 1 \t\t|\tPAKET 1\t\t|\t   PAKET 1\t\t|\t   PAKET 1\t     |");
        System.out.println("|      Mencuci\t\t|\tMencuci\t\t|\t Dry Cleaning\t\t|\t Dry Cleaning\t     |");
        System.out.println("|   Harga: Rp5.000\t|     Harga: 6.000\t|\tHarga: 15.000\t\t|\tHarga: 15.000\t     |");
        System.out.println("+------------------------------------------------------------------------------------------------------------+");
        System.out.println("|      PAKET 2 \t\t|\tPAKET 2\t\t|\t   PAKET 2\t\t|\t   PAKET 2\t     |");
        System.out.println("|      Menggosok\t|\tMenggosok\t|\t    Vakum\t\t|\t    Vakum\t     |");
        System.out.println("|   Harga: Rp6.000\t|     Harga: 10.000\t|\tHarga: 10.000\t\t|\tHarga: 10.000\t     |");
        System.out.println("+------------------------------------------------------------------------------------------------------------+");
        System.out.println("|      PAKET 3 \t\t|\tPAKET 3\t\t|\t   PAKET 3\t\t|\t   PAKET 3\t     |");
        System.out.println("| Mencuci & Menggosok\t|   Mencuci & Menggosok\t|    Dry Cleaning & Vakum\t|    Dry Cleaning & Vakum    |");
        System.out.println("|   Harga: Rp10.000\t|     Harga: 15.000\t|\tHarga: 20.000\t\t|\tHarga: 20.000\t     |");
        System.out.println("+------------------------------------------------------------------------------------------------------------+");

        /**
         * Scanner untuk memilih jasa laundry
         */
        System.out.print("Masukkan jasa yang anda inginkan : ");
        pilihanJasa = ldr.nextInt();
        /**
         * jasa pakaian
         */
        if(pilihanJasa == 1){
            System.out.print("Anda memilih jasa Laundry Pakaian\n");
            /**
             * Scanner untuk memilih paket 
             */
            System.out.print("Masukkan pilihan paket anda : ");
            pilihanPaket = ldr.nextInt();
            if(pilihanPaket == 1){
                System.out.println("Anda memilih PAKET 1 (" + pakaian.Paket1() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : "); 
                jumlahItem = ldr.nextInt();
                jumlahHarga = pakaian.hargaPaket1()*jumlahItem;

            }else if(pilihanPaket == 2){
                System.out.println("Anda memilih PAKET 2 (" + pakaian.Paket2() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : "); 
                jumlahItem = ldr.nextInt();
                jumlahHarga = pakaian.hargaPaket2()*jumlahItem;

            }else if(pilihanPaket == 3){
                System.out.println("Anda memilih PAKET 3 (" + pakaian.Paket3() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : "); 
                jumlahItem = ldr.nextInt();
                jumlahHarga = pakaian.hargaPaket3()*jumlahItem;

            }else{
                System.out.println("Hanya ada 3 paket yang disediakan.");
            }  
        /**
        * jasa selimut
        */

        }else if(pilihanJasa == 2){
            System.out.println("Anda memilih jasa Laundry Selimut\n");
            /**
             * Scanner untuk memilih paket 
             */
            System.out.print("Masukkan pilihan paket anda : ");
            pilihanPaket = ldr.nextInt();
            if(pilihanPaket == 1){
                System.out.println("Anda memilih PAKET 1 (" + selimut.Paket1() + ")");
                System.out.print("\nMasukkan berat selimut anda (minimal 1 kg) : ");   
                jumlahItem = ldr.nextInt();
                jumlahHarga = selimut.hargaPaket1()*jumlahItem;

            }else if(pilihanPaket == 2){
                System.out.println("Anda memilih PAKET 2 (" + selimut.Paket2() + ")");
                System.out.print("\nMasukkan berat selimut anda (minimal 1 kg) : ");  
                jumlahItem = ldr.nextInt();
                jumlahHarga = selimut.hargaPaket2()*jumlahItem;

            }else if(pilihanPaket == 3){
                System.out.println("Anda memilih PAKET 3 (" + selimut.Paket3() + ")");
                System.out.print("\nMasukkan berat selimut anda (minimal 1 kg) : "); 
                jumlahItem = ldr.nextInt();
                jumlahHarga = selimut.hargaPaket3()*jumlahItem;
                
            }else{
                System.out.println("Hanya ada 3 paket yang disediakan.");
            }

         /**
         * jasa Tas dan Sepatu
         */
        }else if(pilihanJasa == 3){
            System.out.println("Anda memilih jasa Laundry Tas dan Sepatu");
            /**
             * Scanner untuk memilih paket 
             */
            System.out.print("Masukkan pilihan paket anda : ");
            pilihanPaket = ldr.nextInt();
            if(pilihanPaket == 1){
                System.out.println("Anda memilih PAKET 1 (" + tasSepatu.Paket1() + ")");
                System.out.print("\nMasukkan jumlah tas/sepatu anda (minimal 1 buah) : ");   
            }else if(pilihanPaket == 2){
                System.out.println("Anda memilih PAKET 2 (" + tasSepatu.Paket2() + ")");
                System.out.print("\nMasukkan jumlah tas/sepatu anda (minimal 1 buah) : ");  
            }else if(pilihanPaket == 3){
                System.out.println("Anda memilih PAKET 3 (" + tasSepatu.Paket3() + ")");
                System.out.print("\nMasukkan jumlah tas/sepatu anda (minimal 1 buah) : "); 
            }
        /**
         * jasa Boneka
         */
        }else if(pilihanJasa == 4){
            System.out.println("Anda memilih jasa Laundry Boneka");
            /**
             * Scanner untuk memilih paket 
             */
            System.out.print("Masukkan pilihan paket anda : ");
            pilihanPaket = ldr.nextInt();
            if(pilihanPaket == 1){
                System.out.println("Anda memilih PAKET 1 (" + boneka.Paket1() + ")");
                System.out.print("\nMasukkan jumlah boneka anda (minimal 1 buah) : ");   
            }else if(pilihanPaket == 2){
                System.out.println("Anda memilih PAKET 2 (" + boneka.Paket2() + ")");
                System.out.print("\nMasukkan jumlah boneka anda (minimal 1 buah) : ");  
            }else if(pilihanPaket == 3){
                System.out.println("Anda memilih PAKET 3 (" + boneka.Paket2() + ")");
                System.out.print("\nMasukkan jumlah boneka anda (minimal 1 buah) : "); 
            }
        }else {
            System.out.println("Inputan anda invalid");
        }
    }
}
