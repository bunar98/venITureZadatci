package ZadatciZaDevelopere;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int B, kol;

        System.out.print("Unesite kolicinu brojeva u polju:");
        kol = unos.nextInt();
        System.out.print("Unesite zadani broj za zbroj:");
        B = unos.nextInt();

        Integer[] polje = new Integer[kol];

        for (int i = 0; i < kol; i++){
            System.out.print("Unesite " + (i + 1) + ". broj niza:");
            polje[i] = unos.nextInt();
        }

        Arrays.sort(polje, Collections.reverseOrder());

        int trenutniZbroj = 0;
        int brojBrojeva = 0;
        int glavnaProvjera = 0;

        for(int z = 0; z < kol; z++){
            int provjera = polje[z];
            if(provjera != B){
                for(int j = 0; j < kol; j++){
                    int broj = polje[j];
                    if(broj < B) {
                        while(trenutniZbroj + broj <= B) {
                            trenutniZbroj = trenutniZbroj + broj;
                            brojBrojeva++;
                        }
                    }
                }
            }else if(provjera == B){
                glavnaProvjera = provjera;
                System.out.println("1");
                break;
            }
        }

        if(glavnaProvjera != B){
            if(trenutniZbroj != B){
                System.out.println("-1");
            }else if(trenutniZbroj == B){
                System.out.println(brojBrojeva);
            }
        }
    }
}
