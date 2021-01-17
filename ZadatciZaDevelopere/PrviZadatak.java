package ZadatciZaDevelopere;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PrviZadatak {

    private static final int Ograničenje = 3;

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        Integer bodoviIgrac = 0, bodoviPC = 0;
        String unosIgrac, unosPC;

        while(bodoviIgrac < Ograničenje && bodoviPC < Ograničenje){

            System.out.println("Trenutno bodovno stanje je: " + bodoviIgrac + " za igrača i " + bodoviPC + " za PC.");
            System.out.print("Unesite alat: ");

            unosIgrac = unos.nextLine();
            unosPC = OdabirPC();


            System.out.println("Tvoj odabir je: " + unosIgrac + ", odabir računala je: " + unosPC);

            if(unosIgrac.equals("kamen") && unosPC.equals("škare")){

                bodoviIgrac++;

            }else if(unosIgrac.equals("škare") && unosPC.equals("kamen")){

                bodoviPC++;

            }else if(unosIgrac.equals("škare") && unosPC.equals("papir")){

                bodoviIgrac++;

            }else if(unosIgrac.equals("papir") && unosPC.equals("škare")){

                bodoviPC++;

            }else if(unosIgrac.equals("papir") && unosPC.equals("kamen")){

                bodoviIgrac++;

            }else if(unosIgrac.equals("kamen") && unosPC.equals("papir")){

                bodoviPC++;

            }else if(unosIgrac.equals("kamen") && unosPC.equals("kamen")){
                System.out.println("Isti odabir!");
                System.out.println("Pokušajte ponovno!");
            }else if(unosIgrac.equals("škare") && unosPC.equals("škare")){
                System.out.println("Isti odabir!");
                System.out.println("Pokušajte ponovno!");
            }else if(unosIgrac.equals("papir") && unosPC.equals("papir")){
                System.out.println("Isti odabir!");
                System.out.println("Pokušajte ponovno!");
            }else{
                System.out.println("Pogrešan unos!");
            }
        }
        String pobjednik;
        if(bodoviIgrac > bodoviPC){
            pobjednik = "Korisnik";
        }else{
            pobjednik = "PC";
        }

        System.out.print("Igra je završila, pobjednik je: " + pobjednik);

    }

    private static String OdabirPC(){
        List<String> popis = new ArrayList<>();
        popis.add("kamen");
        popis.add("škare");
        popis.add("papir");
        int randIndex = new Random().nextInt(popis.size());
        String odabir = popis.get(randIndex);
        return odabir;
    }
}
