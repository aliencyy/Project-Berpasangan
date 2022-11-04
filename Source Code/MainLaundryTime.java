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
        System.out.print("Masukkan paket yang anda inginkan : ");
        pilihan = ldr.nextInt();
    }
}
