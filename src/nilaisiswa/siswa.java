/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class siswa {
    String nama, kelas, NISN;
    int absen, nilai;
    
    Scanner input = new Scanner(System.in);

    void biodata() {
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Kelas : ");
        kelas = input.nextLine();
        System.out.print("Nomor Absen : ");
        absen = input.nextInt();
        System.out.print("Masukan NISN anda : ");
        NISN = input.next();
        System.out.print("Masukkan nilai anda : ");
        nilai = input.nextInt();
        System.out.println("========================");
            System.out.println("Nama anda : "+nama);
            System.out.println("Kelas anda : "+kelas);
            System.out.println("Nomor absen anda : "+absen);
            System.out.println("NISN anda : "+NISN);
            System.out.println("Nilai anda : "+nilai);
        if (nilai >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Mohon maaf anda tidak lulus");
            
            
        }}

}
