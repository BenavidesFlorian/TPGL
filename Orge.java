public class Orge extends lotCereales{
    
    public Orge(int id, String p, String d, double v, double po){
        this.idProduit = id;
        this.provenance = p;
        this.destination = d;
        this.volume = v;
        this.poids = po;
    }

    @Override
    public int getIdProduit() {return this.idProduit;}
    @Override
    public String getProvenance() {return this.provenance;}
    @Override
    public String getDestination() {return this.destination;}
    @Override
    public double getVolume() {return this.volume;}
    @Override
    public double getPoids(){return this.poids;};

    
    @Override
    public void setIdProduit(int id) {this.idProduit=id;}
    @Override
    public void setProvenance(String p) {this.provenance=p;}
    @Override
    public void setDestination(String d) {this.destination=d;}
    @Override
    public void setVolume(double v) {this.volume=v;}
    @Override
    public void setPoids(double p){this.poids=p;};
    
    
    public String getType(){return "Orge";}
    
    
}
