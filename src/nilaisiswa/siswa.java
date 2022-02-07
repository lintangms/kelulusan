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
String Nama, Kelas;
int Nilai;

Scanner input = new Scanner(System.in);

void ingfo(){
    System.out.println("Nama anda : ");
    Nama = input.nextLine();
    System.out.println("Kelas anda : ");
    Kelas = input.nextLine();
    
    
}
void Nilai(){
    System.out.println("Masukan nilai anda : ");
    Nilai = input.nextInt();
    
    if (Nilai >= 80){
        System.out.println("Selamat anda lulus");
        System.out.println("Ibumu pasti bangga");
    }
    else{
        System.out.println("Kok nilainya kurang bang?");
    }
}
    
    }


    