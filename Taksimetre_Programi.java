package Taksimetre;
import java.util.Scanner;
public class Taksimetre_Programi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, open = 10;
        double perKm = 2.20, total;

        try{
        System.out.print("Gidilecek mesafeyi km cinsinden yazınız : ");
        km = input.nextInt();
        } finally{input.close();}

        total = (perKm * km) + open;
        total = (total < 20) ? 20 : total;

        System.out.println("Kilometre başına tutar : "+perKm+" TL");
        System.out.println("Taksimetre açılış tutarı : "+open+" TL");
        System.out.println("Gidilen kilometre : "+km+" km");
        System.out.println("Ödeyeceğiniz tutar : "+total+" TL");


    }
}