package pakiet;

import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class organizm  {
    cecha[] cechy;

    public organizm() {

        cechy = new cecha[24];
        for(int i=0;i<cechy.length;i++)
        {
            cechy[i] = new cecha();
        }
    }
    
    public organizm(int x) {
        cechy = new cecha[24];
        for(int i=0;i<cechy.length;i++)
        {
            cechy[i] = new cecha(x);
        }
    }
    
    void inicjacjalizacja()
    {
        wypelnij();
    }
    
    void drukuj()
    {
        drukuj_dna();
        for(int i=0;i<cechy.length;i++){
            System.out.print((i+1) + " ");
            cechy[i].drukuj_wartosci();
        }
        System.out.print("\n");
    }
    
    String drukuj(int x)
    {
        String temp = drukuj_dna(0);
        for(int i=0;i<cechy.length;i++){
            temp += ((i+1) + " ");
            temp += cechy[i].sprawdz_ceche(0);
            temp += cechy[i].sprawdz_typ(0);
        }
        temp += "\n";
        return temp;
    }
    
    void drukuj_dna(){
        for(int i=0;i<cechy.length;i++)
                System.out.print(cechy[i].wartosc);
        System.out.print("\n");
    }
    
    String drukuj_dna(int x){
        String temp = "";
        for(int i=0;i<cechy.length;i++)
                temp += cechy[i].wartosc;
        temp += "\n";
        return temp;
    }
    
    
    
    void wypelnij()
    { 
        char temp[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','w','x','y','z'};
        //Random generator = new Random();
        for(int i=0; i<cechy.length; i++) {
            //int tempor=generator.nextInt(4);
            for(int j=0;j<cechy[i].typ.length;j++)
            {   
                if(cechy[i].typ[j])
                {
                    cechy[i].wartosc="" + cechy[i].wartosc + "" + ((char)(temp[i/*tempor*/] + (-32)));
                }
                else
                {
                    cechy[i].wartosc=""+cechy[i].wartosc + "" + temp[i];
                }
            }
        }
    }
    

//public static void main(String[] args) {

//        organizm rodzic1;  
//        organizm rodzic2; 
//        
//        rodzic1 = new organizm();
//        rodzic1.plec=true;//ojciec
//        rodzic1.inicjacjalizacja();
//        rodzic1.drukuj();
//        
//        rodzic2 = new organizm();
//        rodzic2.plec=false;//matka
//        rodzic2.inicjacjalizacja();
//        rodzic2.drukuj();
//        
//        Krzyzowki krzyzowka1 = new Krzyzowki(rodzic1,rodzic2);
//        krzyzowka1.gen_cross(/*krzyzowka1.rodzic1, krzyzowka1.rodzic2*/);
        
//        organizm []potomek;
//        potomek = new organizm[krzyzowka1.ilosc_potomstwa];
//        for(int i=0;i<krzyzowka1.ilosc_potomstwa;i++)
//        {
//            potomek[i] = new organizm(0);
//            potomek[i] = krzyzowka1.offspring[i];
//        }
//
//        for(int i=0;i<potomek.length;i++)
//            potomek[i].drukuj();
    
//}
}
