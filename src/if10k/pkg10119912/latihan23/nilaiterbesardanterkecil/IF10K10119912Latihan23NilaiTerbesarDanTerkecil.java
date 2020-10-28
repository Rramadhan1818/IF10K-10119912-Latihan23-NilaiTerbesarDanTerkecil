/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class IF10K10119912Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama_petugas;
        int maksimum, minimum, jumlah_mhs, i, array[];
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Petugas: ");
        nama_petugas = scan.next();
        System.out.print("Masukkan Banyak Nilai Mahasiswa: ");
        jumlah_mhs = scan.nextInt();
        array = new int[jumlah_mhs];

        for(i = 0; i < jumlah_mhs; i++) {
          System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) +" = " );
          array[i] = scan.nextInt();
        }
        maksimum = array[0];        
        minimum = array[0];

        for(i = 0; i < jumlah_mhs; i++) {
          if (array[i] > maksimum){
            maksimum = array[i];
          }
          else if(array[i] < minimum){
              minimum = array[i];  
            }  
        }
        
        System.out.println();
        System.out.println("---------- Hasil Nilai Mahasiswa -----------");

        for(i = 0; i < jumlah_mhs; i++) {
          System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " " + array[i] );
          
        }        
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + maksimum);
        System.out.println("Nilai Terkecil adalah " + minimum);        
        
        System.out.println("Petugas : " + nama_petugas);


    }
    
}
