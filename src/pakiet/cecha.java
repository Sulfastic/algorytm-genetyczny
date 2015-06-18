/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sulf
 */
package pakiet;

import java.util.Random;

public class cecha {
    int jakosc;
    String wartosc;
    boolean[] typ;

    public cecha() {
        Random generator = new Random();
        wartosc = "";
        jakosc=generator.nextInt(4);
        typ = new boolean[2];
        typ[0]=generator.nextBoolean();
        typ[1]=generator.nextBoolean();
    }
    
    public cecha(int x) 
    {
        wartosc = "";
        typ = new boolean[2];
    }
    
    void sprawdz_ceche()
    {
        if(jakosc==0)
            System.out.print("Słaba ");
        if(jakosc==1)
            System.out.print("Średnia ");
        if(jakosc==2)
            System.out.print("Dobra ");
        if(jakosc==3)
            System.out.print("Bardzo dobra ");
    }
    
    String sprawdz_ceche(int x)
    {
        String temp="";
        if(jakosc==0)
            temp="Słaba ";
        if(jakosc==1)
            temp = "Średnia ";
        if(jakosc==2)
            temp = "Dobra ";
        if(jakosc==3)
            temp = "Bardzo dobra ";
        return temp;
    }
    
    void sprawdz_typ()
    {
        for(int i=0;i<typ.length;i++)
            if(typ[i])
                System.out.print(" Dominujaca");//1 aka true
            else
                System.out.print(" Recesywna");//0 aka false
            System.out.print("\n");
    }
    
    String sprawdz_typ(int x)
    {
        String temp = "";
        for(int i=0;i<typ.length;i++)
            if(typ[i])
                temp += " Dominujaca";//1 aka true
            else
                temp += " Recesywna";//0 aka false
            temp += "\n";
        return temp;
    }
    
    void drukuj_wartosci(){
            sprawdz_ceche();
            sprawdz_typ();
        }
}
