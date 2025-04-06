import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KelimeSayac kelimeSayac = new KelimeSayac();

        System.out.println("Bir kelime yada cümle giriniz");

        String input = scanner.nextLine();

        String kelimeler[] =input.split("");

        for (String kelime:kelimeler){
            kelimeSayac.kelimeEkle(kelime.toLowerCase());
        }
        System.out.println("Cümledeki yada kelimedeki tüm tekrar eden kelimerlerin sayısı : ");
        kelimeSayac.kelimeleSayilariGoster();
    }
}
