/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuts;

/**
 *
 * @author hp
 */
public class ProjectUTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("-----------------------------------");
        
        System.out.println("Selamat Datang di Aplikasi DegDegan");
        
        System.out.println("-----------------------------------");
        
        System.out.println("Berikut adalah Perhitungan dari Bisnis Start-up Bapak Amir");
        
        System.out.println("");
        
        
        System.out.println("________________________________________________________________________");
        Modal m = new Modal ();
        System.out.println("Jumlah Seluruh Kelapa adalah : " + m.hitungModal1(5000, 7500, 8300, 9100) + " Buah");
        Modal2 n = new Modal2 ();
        System.out.println("Jumlah Kelapa per truk adalah : " + n.hitungJml(3000, 1.2)+ " Buah");
        System.out.println("");
        System.out.println("Sehingga jumlah Truk yang dibutuhkan sekitar :" + m.hitungModal1(5000, 7500, 8300, 9100)/n.hitungJml(3000, 1.2)+ " Truk atau 12 Truk" );
        System.out.println("________________________________________________________________________");
        hargaJual hj = new hargaJual ();
        
        
        
        int jumlah = (int) (m.hitungModal(5000)+m.hitungModal(7500)+m.hitungModal(8300)+m.hitungModal(9100));
        System.out.println("Modal Untuk Membeli Buah Kelapa Selama 1 Bulan Rp " + jumlah );
        
        int jumlah2 = (int) (n.hitungTruk(2,15)+n.hitungTruk(3,30)+n.hitungTruk(3,35)+n.hitungTruk(3,75));
        System.out.println("Modal Untuk biaya akomodasi Truk selama sebulan Rp " + jumlah2 );
        System.out.println("");
        int jumlah3 = (int) (jumlah + jumlah2);
      
        
        int hargajual = (int) (jumlah3 + hj.hitungJual(15000000));
        System.out.println("Sehingga Total Modal ditambah keuntungan minimal yang diinginkan (15.000.000) adalah Rp " + hargajual);
        System.out.println("________________________________________________________________________");
        int fixhargajual = (int) (hargajual/m.hitungModal1(5000, 7500, 8300, 9100));
        System.out.println("Jadi, Harga Jual Minimum adalah Rp " + fixhargajual);
        
        
        
        
    }
    
}
