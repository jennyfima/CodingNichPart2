package latihanpraktikum01;
import java.util.Scanner;

public class LatihanPraktikum01 {
    
    public static void main(String[] args) {
        Scanner masukan=new Scanner(System.in);
System.out.print("Masukan Nama:");
String nama = masukan.nextLine();
System.out.print("Masukan Nim:");
String nim = masukan.nextLine();
System.out.print("Program Studi:");
String prodi = masukan.nextLine();
System.out.println("annyeonghaseo" + nama + " dengan nim" + nim + " dari Program Studi" + prodi);
    }
    
}
