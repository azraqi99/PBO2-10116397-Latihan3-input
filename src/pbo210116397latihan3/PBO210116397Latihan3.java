/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Memasukkan nilai dari keyboard
 */
package pbo210116397latihan3;

import java.util.Scanner;

public class PBO210116397Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.print("Masukkan Nama Anda: ");
      Scanner scanner = new Scanner(System.in);
      
      String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
       
    }
    
}
