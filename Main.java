import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        ArrayList<String> ya = new ArrayList<String>();
        Scanner hoay = new Scanner(System.in);

        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("Arabica");
        arabica.setJumlahStokKopi(40);
        ya.add(arabica.getJenisKopi());

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        ya.add(robusta.getJenisKopi());

        MesinKopi flores = new MesinKopi();
        flores.setJenisKopi("Flores");
        flores.setJumlahStokKopi(40);
        ya.add(flores.getJenisKopi());

        for(int i=0; i< ya.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+ya.get(i));
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;


        ArrayList<String> hu = new ArrayList<String>();

        Topping susu = new Topping();
        susu.setJenisTopping("Susu");
        susu.setJumlahStokTopping(40);
        hu.add(susu.getJenisTopping());

        Topping gula = new Topping();
        gula.setJenisTopping("Gula");
        gula.setJumlahStokTopping(40);
        hu.add(gula.getJenisTopping());

        Topping cream = new Topping();
        cream.setJenisTopping("Cream");
        cream.setJumlahStokTopping(40);
        hu.add(cream.getJenisTopping());

        for(int i=0; i< hu.size();i++){
            int j= i+1;
            System.out.println("Menu topping adalah "+j+" "+hu.get(i));
        }
        System.out.println("Masukan Topping yang mau dipilih ");
        int pilihanTopping = hoay.nextInt() -1;

        System.out.println("Pesanan kopi Anda " + ya.get(pilihanKopi) + " dengan Topping " + hu.get(pilihanTopping));
    }
    }

