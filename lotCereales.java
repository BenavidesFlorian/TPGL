public abstract class lotCereales{
        
    int idProduit = -1;
    String type ="";
    String provenance ="";
    String destination = "";
    double volume = 0; 
    double poids = 0;
    
    abstract int getIdProduit();
    abstract String getProvenance();
    abstract String getDestination();
    abstract double getVolume();
    abstract double getPoids();
    
    
    abstract void setIdProduit(int id);
    abstract void setProvenance(String p);
    abstract void setDestination(String d);
    abstract void setVolume(double v);
    abstract void setPoids(double p);
    
    
    abstract String getType();
    
}
