import java.util.ArrayList;
import java.util.Observable;

public class Silo extends Observable {
    
    
    private ArrayList<Cellule> listeCellules;
    private int cellulesDisponibles;
    private int id;
    private final int max;

    public Silo(){
        listeCellules = new ArrayList<Cellule>();
        id = -1;
        cellulesDisponibles = 10;
        max = 10;	
    }
    
    public void initCellules(){
        try{
            ajoute(new Cellule(new Ble(1, "src", "dest", 300, 52), true, 12, 12, 12, 12, 410));
            ajoute(new Cellule(new Ble(2, "src", "dest", 405, 52), true, 12, 12, 12, 12, 410));
            ajoute(new Cellule(new Ble(3, "src", "dest", 180, 52), true, 12, 12, 12, 12, 820));
            ajoute(new Cellule(new Ble(4, "src", "dest", 185, 52), true, 12, 12, 12, 12, 820));
            ajoute(new Cellule(new Ble(5, "src", "dest", 900, 52), true, 12, 12, 12, 12, 960));
            ajoute(new Cellule(new Ble(6, "src", "dest", 55, 52), true, 12, 12, 12, 12, 1100));
            ajoute(new Cellule(new Ble(7, "src", "dest", 900, 52), true, 12, 12, 12, 12, 1100));
            ajoute(new Cellule(new Ble(8, "src", "dest", 850, 52), true, 12, 12, 12, 12, 1370));
            ajoute(new Cellule(new Ble(9, "src", "dest", 1250, 52), true, 12, 12, 12, 12, 1370));
            ajoute(new Cellule(new Ble(10, "src", "dest", 1360, 52), true, 12, 12, 12, 12, 1370));
            this.notifyObservers();
        }catch(SiloPleinException e){
            e.printStackTrace();
        }
    }

    public Silo(int i, int cD, int m) {
        listeCellules = new ArrayList<Cellule>();
        id = i;
        cellulesDisponibles = cD;
       
        if(m>0) {
            max = m;
        }
        else if(m==0){
            max=1;
        }
        else max = -m;
    }

    public ArrayList<Cellule> getListe() {
            return listeCellules;
    }

    public void setListe(ArrayList al) {
            listeCellules = al;
    }

    public int getMax() {
            return max;
    }
    
    public int getCellulesDisponibles() {
        int res = 0;
        
        for(int i=0; i<this.listeCellules.size(); i++)
            if(this.listeCellules.get(i).isUtilisee())
                res++;
        
        this.cellulesDisponibles -= res;
        
        return this.cellulesDisponibles;
        
    }


    public int getNbElements() {
            return listeCellules.size();
    }

    public boolean estPlein() {
            if(getNbElements()==max) return true;
            return false;
    }

    public boolean estVide() {
            if(getNbElements()==0) return true;
            return false;
    }
    
    public ArrayList<lotCereales> getCereales(){
        
        ArrayList<lotCereales> res = new ArrayList<lotCereales>();
        
        for(int i=0; i< this.listeCellules.size(); i++)
        {
            if(this.listeCellules.get(i).isUtilisee() == true)
                res.add(this.listeCellules.get(i).getProduit());
        }
        
        return res;
    }
    
    public boolean ajouterCereales(lotCereales lc){
        
       if(cellulesDisponibles > 0){
           this.listeCellules.get(listeCellules.size()-cellulesDisponibles).setProduit(lc);
           this.cellulesDisponibles--;
           return true;
       }
       else
        return false;
    }
    
    
    public void ajoute(Cellule c) throws SiloPleinException {
            if(!estPlein()) {
                    listeCellules.add(c);
                    setChanged();
                    notifyObservers();
            }
            else throw new SiloPleinException();
    }

    public void ajoute() throws SiloPleinException {
    if(!estPlein() && !estVide()) {
                listeCellules.add(listeCellules.get(listeCellules.size()-1));
                setChanged();
                notifyObservers();
            }
            else if(estVide()) {
                listeCellules.add(new Cellule());
                setChanged();
                notifyObservers();
            }
            else throw new SiloPleinException();
    }

    public void retire() throws SiloVideException {
            if(!estVide()) {
                    listeCellules.remove(listeCellules.size()-1);
                    setChanged();
                    notifyObservers();
            }
            else throw new SiloVideException();
    }

    public double getVolume() {
            double v = 0;
            for(Cellule c : listeCellules) {
                    v += c.getProduit().getVolume();
            }
            return v;
    }

    public void boycottOrigine(String o) {
        //TODO
    }
    

    public String toString() {
        String s = "MAX :"+max+"\n";
        for(Cellule c : listeCellules) {
            s += c.toString()+"\n";
        }
        return s;
    }

    public void affiche() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Silo s = (Silo)o;
        return (s.listeCellules == this.listeCellules && s.max == this.max);
    }
        
        
}
        

