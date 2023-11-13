package ProjectLatihan;

import java.util.Scanner;

public class tagihanPDAM {

    static void tampilNama(int id){
        String namaPelanggan[]={"Ali","Budi","Dani","Edi","Umar"};
            System.out.println(namaPelanggan[id-1]);
        }
    static void hitungTarif(int jumlahPemakaian){
    int harga=0;
        if(jumlahPemakaian > 0 && jumlahPemakaian<10){
        jumlahPemakaian=10;
        harga=jumlahPemakaian*2000;
       }
       else if (jumlahPemakaian>=11 && jumlahPemakaian<=20) {
        harga=jumlahPemakaian*3000;
       }
       else if(jumlahPemakaian>=21 && jumlahPemakaian<=30){
        harga=jumlahPemakaian*4000;
       }
       else if(jumlahPemakaian>=31){
        harga=jumlahPemakaian*5000;
       }
       System.out.println(harga);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Tagihan PDAM=====");
        System.out.print("Masukkan id Pelanggan: ");
        int id=input.nextInt();
        tampilNama(id);
        System.out.print("Masukkan jumlah penggunaan air: ");
        int air=input.nextInt();
        System.out.print("Total: ");
        hitungTarif(air);
    }

}
