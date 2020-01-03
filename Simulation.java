public class Simulation extends Thread {
    
    private boolean alarmeInsectisation, variationTmp, variationH,variationH2S,variationCH4,arriveeCam,sortieCam;
    
    
    public void declencheAlarme(){};
    public void arriveCamion(){arriveeCam=true;};
    public void sortieCamion(){sortieCam = true;};
    public void Insectes(){alarmeInsectisation=true;};
    public void variationTemperature(){variationTmp=true;};
    public void variationHumidite(){variationH=true;};
    public void variationH2S(){variationH2S=true;};
    public void variationCH4(){variationCH4=true;};
    
    
    
    public Simulation(String name){
    super(name);
    }
    
    /*  
    public void run(){
        while(true)
        {}
     }    
    */
 
    
}
