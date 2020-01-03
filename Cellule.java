public class Cellule {
        
        private double volumeMax;

    
	private lotCereales produit;
	private float concentrationH2S, concentrationCH4, temperature, humidite;
        private boolean alarme = false;
        private boolean presenceInsectes = false;

    
        
        private boolean utilisee;

        public Cellule(){
            produit = null;
            utilisee = false;

            concentrationH2S = 0;
            concentrationCH4 = 0;
            temperature = 0;
            humidite = 0;
            volumeMax = 410;
                
	}

	public Cellule(lotCereales lc,boolean u, float cH, float cC, float t, float h, double v){
            //pensez a faire if lc.volume > volupme + exception
		produit = lc;
                utilisee = u;
                
		concentrationH2S = cH;
		concentrationCH4 = cC;
		temperature = t;
		humidite = h;
                volumeMax = v;
                
	}

	public float getConcentrationH2S(){ return concentrationH2S;}
	public float getConcentrationCH4(){ return concentrationCH4;}
	public float getTemperature(){ return temperature;}
	public float getHumidite(){ return humidite;}
        
        public lotCereales getProduit(){return this.produit;}
        public boolean isUtilisee(){return this.utilisee;}
        public boolean getAlarme(){return this.alarme;}
        public boolean isPresenceInsectes() {return presenceInsectes;}
        public double getVolumeMax() {return volumeMax;}

        public void setVolumeMax(double volumeMax) {this.volumeMax = volumeMax;}
        
        public void setPresenceInsectes(boolean presenceInsectes) {this.presenceInsectes = presenceInsectes;}
        
        public void setProduit(lotCereales lc){
            this.produit = lc; 
            if(lc !=null)
                this.utilisee = true;
            else
                this.utilisee = false;
        }
        public void vider(){this.produit = null; this.utilisee = false;}
        
	public void nettoyer(){}
	public void ventiler(){}
	public void aspirer(){}
	public void desinsectisation(){}
	public void setAlarme(boolean a){this.alarme = a;}
}
