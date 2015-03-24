/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author eroSKo
 */
public class Obchodnici {
    String meno;
    Obchodnik[] zoznam;
    int pocetObchodnikov;
    Obchodnik zac;
    Obchodnik kon;
    
    public Obchodnici(){}
        public void Pridaj (Obchodnik O1){}
        public void Odstran(Obchodnik O1){}
        
  
        
    
public class Obchodnik{
    String meno;
    String priezvisko;
    int vek;
        private Object dalsi;
    

public Obchodnik(String imeno, String iPriezvisko, int iVek){
    meno = imeno;
    priezvisko = iPriezvisko;
    vek = iVek;
    Obchodnik dalsi = null;
    
    
    }
    }

public Obchodnici(String imeno){
meno = imeno;
zoznam = new Obchodnik[5];
pocetObchodnikov =0;
zac  = null;
kon  = null;

}
public void PridajObchodnika(Obchodnik O1){
    pocetObchodnikov++;
    zoznam[pocetObchodnikov-1]=O1;
    if (pocetObchodnikov>=zoznam.length){
        Obchodnik[] novyZoznam = new Obchodnik[zoznam.length*2];
        for(int i=0; i<zoznam.length; i++){
            
        
        novyZoznam[i] =zoznam[i];
        }
        zoznam = novyZoznam;
        if (zac==null){
            O1.dalsi=null;
            zac= O1;
            kon=zac;
        }else{
            O1.dalsi=null;
            kon.dalsi=O1;
            kon=O1;
        }
    }
    
}
public void OdstranObchodnka(int index){
    for (int i = index; i<pocetObchodnikov-1;i++){
        zoznam[i] = zoznam[i+1];
    }
    pocetObchodnikov--;
}
public void ZistiInfo(String imeno){
    boolean nasielSa =false;
    Obchodnik pom =zac;
    while(pom != null){
        if(pom.meno.equals(imeno)){
            System.out.println(pom.toString());
            nasielSa=true;
        }
    pom = (Obchodnik) pom.dalsi;
    
}

if (!nasielSa) System.out.println("Nieje v zozname");

  }
 public void VzmayObchodnikazZoznamu(String iMeno){
     Obchodnik pom =zac;
     if (zac.meno.equals(iMeno)){
         zac= (Obchodnik) zac.dalsi;
         pom = null;
     }else {
         Obchodnik pred = zac;
         pom = (Obchodnik) zac.dalsi;
         while (pom !=null){
             if(pom.meno.equals(iMeno)){
                 pred.dalsi =pom.dalsi;
                 pom  =null;
             }
             pom =(Obchodnik) pom.dalsi;
             pred =(Obchodnik) pred.dalsi;
         }
         
     }
     
 }


}

