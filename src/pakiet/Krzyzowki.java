/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Krzyzowki {
    organizm rodzic1;  
    organizm rodzic2; 
    //List<organizm> lista = new ArrayList<organizm>();

    organizm offspring;
    
    public Krzyzowki(organizm rodz1, organizm rodz2){
        rodzic1 = rodz1; //ojciec
        rodzic2 = rodz2; //matka

        offspring = new organizm(0);
    }
    
    public organizm get()
    {
        return offspring;
    }
        
    void szansa_dziedziczenia(int indeks, int i, organizm rodz1, organizm rodz2)
    {

        Random generator = new Random();
        boolean temp = false;
        
        if(generator.nextBoolean())
        {
            offspring.cechy[i].typ[0]=rodz1.cechy[i].typ[0];
            offspring.cechy[i].wartosc="" + offspring.cechy[i].wartosc + "" + rodz1.cechy[i].wartosc.charAt(0);
            temp = false;
        }
        else
        {
            offspring.cechy[i].typ[0]=rodz2.cechy[i].typ[0];
            offspring.cechy[i].wartosc="" + offspring.cechy[i].wartosc + "" + rodz2.cechy[i].wartosc.charAt(0);
                
            temp=true;
        }
    
        if(temp)
        {
            offspring.cechy[i].typ[1]=rodz1.cechy[i].typ[1];
            offspring.cechy[i].wartosc="" + offspring.cechy[i].wartosc + "" + rodz1.cechy[i].wartosc.charAt(1);
            
        }
        else
        {
            offspring.cechy[i].typ[1]=rodz2.cechy[i].typ[1];
            offspring.cechy[i].wartosc="" + offspring.cechy[i].wartosc + "" + rodz2.cechy[i].wartosc.charAt(1);
           
        }
    }
        
        void gen_cross()
        {
        for(int i=0;i<rodzic1.cechy.length;i++)
        {
            szansa_dziedziczenia(0,i,rodzic1,rodzic2);
        }
            for(int j=0;j<rodzic1.cechy.length;j++)
            {
                if(offspring.cechy[j].typ[0] & offspring.cechy[j].typ[1])//dominujaca dominujaca
                    if(rodzic1.cechy[j].jakosc>=rodzic2.cechy[j].jakosc)
                    {
                        offspring.cechy[j].jakosc = rodzic1.cechy[j].jakosc;
                    }
                    else 
                    {
                        offspring.cechy[j].jakosc = rodzic2.cechy[j].jakosc;
                    }

                else if((offspring.cechy[j].typ[0]==false) & (offspring.cechy[j].typ[1]==false))//recesywna recesywna
                    if(rodzic1.cechy[j].jakosc>=rodzic2.cechy[j].jakosc)
                    {
                        offspring.cechy[j].jakosc = rodzic1.cechy[j].jakosc;
                    }
                    else 
                    {
                        offspring.cechy[j].jakosc = rodzic2.cechy[j].jakosc;
                    }

                else if((offspring.cechy[j].typ[0]==false) & (offspring.cechy[j].typ[1]==true))//recesywna dominujaca
                {
                    offspring.cechy[j].jakosc = rodzic2.cechy[j].jakosc;
                }

                else if((offspring.cechy[j].typ[0]==true) & (offspring.cechy[j].typ[1]==false))//recesywna dominujaca
                {
                    offspring.cechy[j].jakosc = rodzic1.cechy[j].jakosc;
                }
        }
    }
    
}
