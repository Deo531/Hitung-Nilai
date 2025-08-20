import java.util.Scanner;

public class hitungNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai Anda: ");
        int nilai = input.nextInt();
        String kriteria;

        if (nilai >= 96 && nilai >= 100){
            kriteria = "A";
        } else if (nilai >= 91 && nilai <= 95) {
            kriteria = "A-";
        } else if (nilai >= 86 && nilai <= 90) {
            kriteria = "B+";
        } else if (nilai >= 81 && nilai <= 85) {
            kriteria = "B";
        } else if (nilai >= 75 && nilai <= 80) {
            kriteria = "B-";
        } else if (nilai >= 70 && nilai <= 74) {
            kriteria = "C+";
        } else if (nilai >= 65 && nilai <= 69) {
            kriteria = "C";
        } else if (nilai >= 60 && nilai <= 64) {
            kriteria = "C-";
        } else if (nilai >= 55 && nilai <= 59) {
            kriteria = "D+";
        } else if (nilai >= 0 && nilai <= 54) {
            kriteria = "D-";
        } else {
            kriteria = "Nilai tidak valid";

            System.out.println("Predikat nilai anda adalah: " + kriteria);
        }
            switch (kriteria) { 
                case "A" :
                    System.out.println("Predikat nilai A: Sangat baik"); 
                    break; 
                case "B+" :
                case "B" :
                case "B-" :
                    System.out.println("Predikat nilai B: Baik"); 
                    break; 
                case "C+" : 
                case "C" : 
                case "C-" : 
                    System.out.println("Predikat nilai C: Cukup"); 
                    break; 
                case "D+" : 
                case "D-" :  
                    System.out.println("Predikat nilai D: Kurang"); 
                    break;
                default:
                    System.out.println("Predikat nilai tidak valid");
        }
    }
}
