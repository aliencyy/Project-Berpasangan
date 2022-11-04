/**
 * @author Kelsy Amirah dan Najla Raihana Kamila
 * @version 01-11-2022
 */

public class MainLaundryTime {
    public static void main(String[] args) {
        int pilihan; 
        Scanner ldr = new Scanner(System.in);

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
            System.out.print("Anda memilih jasa Laundry Pakaian");
            /**
             * Scanner untuk memilih paket 
             */
            System.out.print("Masukkan pilihan paket anda : ");
            pilihanPaket = ldr.nextInt();
            if(pilihanPaket == 1){
                System.out.println("Anda memilih PAKET 1 (" + pakaian.Paket1() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : ");   
            }else if(pilihanPaket == 2){
                System.out.println("Anda memilih PAKET 2 (" + pakaian.Paket2() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : ");  
            }else if(pilihanPaket == 3){
                System.out.println("Anda memilih PAKET 3 (" + pakaian.Paket3() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : "); 
            }else{
                System.out.println("Hanya ada 3 paket yang disediakan.");
            }
          /**
          * jasa selimut
          */
        }else if(pilihanJasa == 2){
            System.out.println("Anda memilih jasa Laundry Selimut");
            /**
             * Scanner untuk memilih paket 
             */
            System.out.print("Masukkan pilihan paket anda : ");
            pilihanPaket = ldr.nextInt();
            if(pilihanPaket == 1){
                System.out.println("Anda memilih PAKET 1 (" + selimut.Paket1() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : ");   
            }else if(pilihanPaket == 2){
                System.out.println("Anda memilih PAKET 2 (" + selimut.Paket2() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : ");  
            }else if(pilihanPaket == 3){
                System.out.println("Anda memilih PAKET 3 (" + selimut.Paket3() + ")");
                System.out.print("\nMasukkan berat pakaian anda (minimal 1 kg) : "); 
            }else{
                System.out.println("Hanya ada 3 paket yang disediakan.");
            }
    }
}
