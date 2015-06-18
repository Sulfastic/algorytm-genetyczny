/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet;

/**
 *
 * @author Sulf
 */
public class start {
    organizm rodzic1;  
    organizm rodzic2; 
    
    organizm temp1 = new organizm(0);
    organizm temp2 = new organizm(0);
    
    int licznik=0;
    int pokolenie=2;
    
    String temp;
    
    public void create1()
    {
        rodzic1 = new organizm();
        //rodzic1.plec=true;
        rodzic1.inicjacjalizacja();
        temp = rodzic1.drukuj(0);
    }
    
    public void create_temp(organizm zwierzak)
    {
        if(licznik==1)
        {
            temp1 = zwierzak;
        }
        if(licznik==2)
        {
            temp2 = zwierzak;
        }
    }
    
    public String sprawdz_czy_optymalne()
    {
        int licz=0;
        for(int i=0;i<24;i++)
        {
            if(temp1.cechy[i].jakosc == temp2.cechy[i].jakosc)
                licz++;               
        }
        if(licz==24)
            return "\nOsiągnięto organizm o optymalnym kodzie genetycznym\n"; 
        return "";
    }
    
    public String drukuj()
    {
        return temp;
    }
    
    public void create2()
    {
        rodzic2 = new organizm();
        //rodzic2.plec=true;
        rodzic2.inicjacjalizacja();
        temp = rodzic2.drukuj(0);
    }
    
    public void cross()
    {   
        licznik++;
        Krzyzowki krzyzowka = new Krzyzowki(rodzic1,rodzic2);
        krzyzowka.gen_cross();      
        
        temp=krzyzowka.offspring.drukuj(0);
        
        create_temp(krzyzowka.get());
        drukuj();
        if(licznik==2)
        {
            pokolenie++;
            licznik=0;
            rodzic1=temp1;
            rodzic2=temp2;
        }
    }
}
