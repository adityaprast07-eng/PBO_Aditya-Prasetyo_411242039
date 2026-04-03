import java.util.Scanner;

public class  LatihanKonversisuhu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double celcius, fahrenheit, reamur;
        
        System.out.print("Masukan Nilai Derajat Celcius : ");
        celcius = input.nextDouble();
        
        fahrenheit = (9.0/5.0) * celcius + 32;
        reamur = (4.0/5.0) * celcius;
        
        System.out.println("Hasil Konversi : ");
        System.out.println("Derajat Fahrenheit : " + fahrenheit);
        System.out.println("Derajat Reamur     : " + reamur);
    }
}