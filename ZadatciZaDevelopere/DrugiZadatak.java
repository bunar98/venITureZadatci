package ZadatciZaDevelopere;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        String provjera;
        String radna;

        System.out.print("Unesite tekst za provjeru:");
        provjera = unos.nextLine();
        int check = 0;

        radna = provjera.toLowerCase();
        radna = radna.replace('.', ' ');
        radna = radna.replace(',', ' ');
        radna = radna.replace('?', ' ');
        radna = radna.replace('!', ' ');
        radna = radna.replaceAll("\\s", "");

        // radna = radna.replace('bilo koji znak',''); -> ja sam zamjenio sve osnovne znakove
        // koji se mogu naći u rečenici, ukoliko treba još neke dodatne znakove zanemariti
        // za izvršavanje programa samo se nadoda linija koda

        int kolicina = radna.length();

        char[] trenutno = new char[kolicina];

        trenutno = radna.toCharArray();
        int j = kolicina - 1;

        for(int i = 0; i < kolicina/2; i++){
            if(trenutno[i] != trenutno[j]){
                check = 1;
            }else{
                j--;
            }
        }
        if(check == 1){
            System.out.println("Nije palindrom!");
        }else{
            System.out.println("Palindrom je!");
        }
    }
}
