import java.util.Observable;
import java.util.Observer;

public class Vue extends javax.swing.JFrame implements Observer{

    private Silo s;
    
    public Vue() {
        this.setTitle("La S.A.R.L. Beuzelin vous remercie d'utiliser son performant programme");
        initComponents();
        initNames();
        s = new Silo();
        s.addObserver(this);
        s.initCellules();
        Controlleur c = new Controlleur(s);
        this.ajoutControlleur(c);
    }
    
    
    
    public void ajoutControlleur(Controlleur c){
        BtAspirer1.addActionListener(c);
        BtAspirer2.addActionListener(c);
        BtAspirer3.addActionListener(c);
        BtAspirer4.addActionListener(c);
        BtAspirer5.addActionListener(c);
        BtAspirer6.addActionListener(c);
        BtAspirer7.addActionListener(c);
        BtAspirer8.addActionListener(c);
        BtAspirer9.addActionListener(c);
        BtAspirer10.addActionListener(c);
        
        BtDesinsectiser1.addActionListener(c);
        BtDesinsectiser2.addActionListener(c);
        BtDesinsectiser3.addActionListener(c);
        BtDesinsectiser4.addActionListener(c);
        BtDesinsectiser5.addActionListener(c);
        BtDesinsectiser6.addActionListener(c);
        BtDesinsectiser7.addActionListener(c);
        BtDesinsectiser8.addActionListener(c);
        BtDesinsectiser9.addActionListener(c);
        BtDesinsectiser10.addActionListener(c);
        
        BtNettoyer1.addActionListener(c);
        BtNettoyer2.addActionListener(c);
        BtNettoyer3.addActionListener(c);
        BtNettoyer4.addActionListener(c);
        BtNettoyer5.addActionListener(c);
        BtNettoyer6.addActionListener(c);
        BtNettoyer7.addActionListener(c);
        BtNettoyer8.addActionListener(c);
        BtNettoyer9.addActionListener(c);
        BtNettoyer10.addActionListener(c);
        
        BtVentiler1.addActionListener(c);
        BtVentiler2.addActionListener(c);
        BtVentiler3.addActionListener(c);
        BtVentiler4.addActionListener(c);
        BtVentiler5.addActionListener(c);
        BtVentiler6.addActionListener(c);
        BtVentiler7.addActionListener(c);
        BtVentiler8.addActionListener(c);
        BtVentiler9.addActionListener(c);
        BtVentiler10.addActionListener(c);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update");
        Silo silo = (Silo) o;
        if(silo.getListe().size() == 10){
            lbLot1.setText(silo.getCereales().get(0).getType() + ", lot n°" + silo.getCereales().get(0).getIdProduit());
            lbLot2.setText(silo.getCereales().get(1).getType() + ", lot n°" + silo.getCereales().get(1).getIdProduit());
            lbLot3.setText(silo.getCereales().get(2).getType() + ", lot n°" + silo.getCereales().get(2).getIdProduit());
            lbLot4.setText(silo.getCereales().get(3).getType() + ", lot n°" + silo.getCereales().get(3).getIdProduit());
            lbLot5.setText(silo.getCereales().get(4).getType() + ", lot n°" + silo.getCereales().get(4).getIdProduit());
            lbLot6.setText(silo.getCereales().get(5).getType() + ", lot n°" + silo.getCereales().get(5).getIdProduit());
            lbLot7.setText(silo.getCereales().get(6).getType() + ", lot n°" + silo.getCereales().get(6).getIdProduit());
            lbLot8.setText(silo.getCereales().get(7).getType() + ", lot n°" + silo.getCereales().get(7).getIdProduit());
            lbLot9.setText(silo.getCereales().get(8).getType() + ", lot n°" + silo.getCereales().get(8).getIdProduit());
            lbLot10.setText(silo.getCereales().get(9).getType() + ", lot n°" + silo.getCereales().get(9).getIdProduit());

            lbHumidite1.setText("Humidité : " + silo.getListe().get(0).getHumidite());
            lbHumidite2.setText("Humidité : " + silo.getListe().get(1).getHumidite());
            lbHumidite3.setText("Humidité : " + silo.getListe().get(2).getHumidite());
            lbHumidite4.setText("Humidité : " + silo.getListe().get(3).getHumidite());
            lbHumidite5.setText("Humidité : " + silo.getListe().get(4).getHumidite());
            lbHumidite6.setText("Humidité : " + silo.getListe().get(5).getHumidite());
            lbHumidite7.setText("Humidité : " + silo.getListe().get(6).getHumidite());
            lbHumidite8.setText("Humidité : " + silo.getListe().get(7).getHumidite());
            lbHumidite9.setText("Humidité : " + silo.getListe().get(8).getHumidite());
            lbHumidite10.setText("Humidité : " + silo.getListe().get(9).getHumidite());

            lbTemperature1.setText("Temperature : " + silo.getListe().get(0).getTemperature());
            lbTemperature2.setText("Temperature : " + silo.getListe().get(1).getTemperature());
            lbTemperature3.setText("Temperature : " + silo.getListe().get(2).getTemperature());
            lbTemperature4.setText("Temperature : " + silo.getListe().get(3).getTemperature());
            lbTemperature5.setText("Temperature : " + silo.getListe().get(4).getTemperature());
            lbTemperature6.setText("Temperature : " + silo.getListe().get(5).getTemperature());
            lbTemperature7.setText("Temperature : " + silo.getListe().get(6).getTemperature());
            lbTemperature8.setText("Temperature : " + silo.getListe().get(7).getTemperature());
            lbTemperature9.setText("Temperature : " + silo.getListe().get(8).getTemperature());
            lbTemperature10.setText("Temperature : " + silo.getListe().get(9).getTemperature());

            lbConcentrationCH4_1.setText("Concentration CH4 : " + silo.getListe().get(0).getConcentrationCH4());
            lbConcentrationCH4_2.setText("Concentration CH4 : " + silo.getListe().get(1).getConcentrationCH4());
            lbConcentrationCH4_3.setText("Concentration CH4 : " + silo.getListe().get(2).getConcentrationCH4());
            lbConcentrationCH4_4.setText("Concentration CH4 : " + silo.getListe().get(3).getConcentrationCH4());
            lbConcentrationCH4_5.setText("Concentration CH4 : " + silo.getListe().get(4).getConcentrationCH4());
            lbConcentrationCH4_6.setText("Concentration CH4 : " + silo.getListe().get(5).getConcentrationCH4());
            lbConcentrationCH4_7.setText("Concentration CH4 : " + silo.getListe().get(6).getConcentrationCH4());
            lbConcentrationCH4_8.setText("Concentration CH4 : " + silo.getListe().get(7).getConcentrationCH4());
            lbConcentrationCH4_9.setText("Concentration CH4 : " + silo.getListe().get(8).getConcentrationCH4());
            lbConcentrationCH4_10.setText("Concentration CH4 : " + silo.getListe().get(9).getConcentrationCH4());

            lbConcentrationH2S_1.setText("Concentration H2S : " + silo.getListe().get(0).getConcentrationH2S());
            lbConcentrationH2S_2.setText("Concentration H2S : " + silo.getListe().get(1).getConcentrationH2S());
            lbConcentrationH2S_3.setText("Concentration H2S : " + silo.getListe().get(2).getConcentrationH2S());
            lbConcentrationH2S_4.setText("Concentration H2S : " + silo.getListe().get(3).getConcentrationH2S());
            lbConcentrationH2S_5.setText("Concentration H2S : " + silo.getListe().get(4).getConcentrationH2S());
            lbConcentrationH2S_6.setText("Concentration H2S : " + silo.getListe().get(5).getConcentrationH2S());
            lbConcentrationH2S_7.setText("Concentration H2S : " + silo.getListe().get(6).getConcentrationH2S());
            lbConcentrationH2S_8.setText("Concentration H2S : " + silo.getListe().get(7).getConcentrationH2S());
            lbConcentrationH2S_9.setText("Concentration H2S : " + silo.getListe().get(8).getConcentrationH2S());
            lbConcentrationH2S_10.setText("Concentration H2S : " + silo.getListe().get(9).getConcentrationH2S());

            lbAlarme1.setText(silo.getListe().get(0).getAlarme() ? "oui" : "non");
            lbAlarme2.setText(silo.getListe().get(1).getAlarme() ? "oui" : "non");
            lbAlarme3.setText(silo.getListe().get(2).getAlarme() ? "oui" : "non");
            lbAlarme4.setText(silo.getListe().get(3).getAlarme() ? "oui" : "non");
            lbAlarme5.setText(silo.getListe().get(4).getAlarme() ? "oui" : "non");
            lbAlarme6.setText(silo.getListe().get(5).getAlarme() ? "oui" : "non");
            lbAlarme7.setText(silo.getListe().get(6).getAlarme() ? "oui" : "non");
            lbAlarme8.setText(silo.getListe().get(7).getAlarme() ? "oui" : "non");
            lbAlarme9.setText(silo.getListe().get(8).getAlarme() ? "oui" : "non");
            lbAlarme10.setText(silo.getListe().get(9).getAlarme() ? "oui" : "non");

            lbInsectes1.setText(silo.getListe().get(0).isPresenceInsectes() ? "oui" : "non");
            lbInsectes2.setText(silo.getListe().get(1).isPresenceInsectes() ? "oui" : "non");
            lbInsectes3.setText(silo.getListe().get(2).isPresenceInsectes() ? "oui" : "non");
            lbInsectes4.setText(silo.getListe().get(3).isPresenceInsectes() ? "oui" : "non");
            lbInsectes5.setText(silo.getListe().get(4).isPresenceInsectes() ? "oui" : "non");
            lbInsectes6.setText(silo.getListe().get(5).isPresenceInsectes() ? "oui" : "non");
            lbInsectes7.setText(silo.getListe().get(6).isPresenceInsectes() ? "oui" : "non");
            lbInsectes8.setText(silo.getListe().get(7).isPresenceInsectes() ? "oui" : "non");
            lbInsectes9.setText(silo.getListe().get(8).isPresenceInsectes() ? "oui" : "non");
            lbInsectes10.setText(silo.getListe().get(9).isPresenceInsectes() ? "oui" : "non");

            pbProgression1.setValue((int)(silo.getCereales().get(0).getVolume()*100 / silo.getListe().get(0).getVolumeMax()));
            pbProgression2.setValue((int)(silo.getCereales().get(1).getVolume()*100 / silo.getListe().get(1).getVolumeMax()));
            pbProgression3.setValue((int)(silo.getCereales().get(2).getVolume()*100 / silo.getListe().get(2).getVolumeMax()));
            pbProgression4.setValue((int)(silo.getCereales().get(3).getVolume()*100 / silo.getListe().get(3).getVolumeMax()));
            pbProgression5.setValue((int)(silo.getCereales().get(4).getVolume()*100 / silo.getListe().get(4).getVolumeMax()));
            pbProgression6.setValue((int)(silo.getCereales().get(5).getVolume()*100 / silo.getListe().get(5).getVolumeMax()));
            pbProgression7.setValue((int)(silo.getCereales().get(6).getVolume()*100 / silo.getListe().get(6).getVolumeMax()));
            pbProgression8.setValue((int)(silo.getCereales().get(7).getVolume()*100 / silo.getListe().get(7).getVolumeMax()));
            pbProgression9.setValue((int)(silo.getCereales().get(8).getVolume()*100 / silo.getListe().get(8).getVolumeMax()));
            pbProgression10.setValue((int)(silo.getCereales().get(9).getVolume()*100 / silo.getListe().get(9).getVolumeMax()));
        
        }
    }
    
    public void initNames(){                    
        BtAspirer1.setName("BtAspirer1");
        BtAspirer2.setName("BtAspirer2");
        BtAspirer3.setName("BtAspirer3");
        BtAspirer4.setName("BtAspirer4");
        BtAspirer5.setName("BtAspirer5");
        BtAspirer6.setName("BtAspirer6");
        BtAspirer7.setName("BtAspirer7");
        BtAspirer8.setName("BtAspirer8");
        BtAspirer9.setName("BtAspirer9");
        BtAspirer10.setName("BtAspirer10");
        
        BtDesinsectiser1.setName("BtDesinsectiser1");
        BtDesinsectiser2.setName("BtDesinsectiser2");
        BtDesinsectiser3.setName("BtDesinsectiser3");
        BtDesinsectiser4.setName("BtDesinsectiser4");
        BtDesinsectiser5.setName("BtDesinsectiser5");
        BtDesinsectiser6.setName("BtDesinsectiser6");
        BtDesinsectiser7.setName("BtDesinsectiser7");
        BtDesinsectiser8.setName("BtDesinsectiser8");
        BtDesinsectiser9.setName("BtDesinsectiser9");
        BtDesinsectiser10.setName("BtDesinsectiser10");
        
        BtNettoyer1.setName("BtNettoyer1");
        BtNettoyer2.setName("BtNettoyer2");
        BtNettoyer3.setName("BtNettoyer3");
        BtNettoyer4.setName("BtNettoyer4");
        BtNettoyer5.setName("BtNettoyer5");
        BtNettoyer6.setName("BtNettoyer6");
        BtNettoyer7.setName("BtNettoyer7");
        BtNettoyer8.setName("BtNettoyer8");
        BtNettoyer9.setName("BtNettoyer9");
        BtNettoyer10.setName("BtNettoyer10");
        
        BtVentiler1.setName("BtVentiler1");
        BtVentiler2.setName("BtVentiler2");
        BtVentiler3.setName("BtVentiler3");
        BtVentiler4.setName("BtVentiler4");
        BtVentiler5.setName("BtVentiler5");
        BtVentiler6.setName("BtVentiler6");
        BtVentiler7.setName("BtVentiler7");
        BtVentiler8.setName("BtVentiler8");
        BtVentiler9.setName("BtVentiler9");
        BtVentiler10.setName("BtVentiler10");
        
        lbAlarme1.setName("lbAlarme1");
        lbAlarme2.setName("lbAlarme2");
        lbAlarme3.setName("lbAlarme3");
        lbAlarme4.setName("lbAlarme4");
        lbAlarme5.setName("lbAlarme5");
        lbAlarme6.setName("lbAlarme6");
        lbAlarme7.setName("lbAlarme7");
        lbAlarme8.setName("lbAlarme8");
        lbAlarme9.setName("lbAlarme9");
        lbAlarme10.setName("lbAlarme10");
               
        lbConcentrationCH4_1.setName("lbConcentrationCH4_1");
        lbConcentrationCH4_2.setName("lbConcentrationCH4_2");
        lbConcentrationCH4_3.setName("lbConcentrationCH4_3");
        lbConcentrationCH4_4.setName("lbConcentrationCH4_4");
        lbConcentrationCH4_5.setName("lbConcentrationCH4_5");
        lbConcentrationCH4_6.setName("lbConcentrationCH4_6");
        lbConcentrationCH4_7.setName("lbConcentrationCH4_7");
        lbConcentrationCH4_8.setName("lbConcentrationCH4_8");
        lbConcentrationCH4_9.setName("lbConcentrationCH4_9");
        lbConcentrationCH4_10.setName("lbConcentrationCH4_10");
        
        lbConcentrationH2S_1.setName("lbConcentrationH2S_1");
        lbConcentrationH2S_2.setName("lbConcentrationH2S_2");
        lbConcentrationH2S_3.setName("lbConcentrationH2S_3");
        lbConcentrationH2S_4.setName("lbConcentrationH2S_4");
        lbConcentrationH2S_5.setName("lbConcentrationH2S_5");
        lbConcentrationH2S_6.setName("lbConcentrationH2S_6");
        lbConcentrationH2S_7.setName("lbConcentrationH2S_7");
        lbConcentrationH2S_8.setName("lbConcentrationH2S_8");
        lbConcentrationH2S_9.setName("lbConcentrationH2S_9");
        lbConcentrationH2S_10.setName("lbConcentrationH2S_10");
        
        lbHumidite1.setName("lbHumidite1");
        lbHumidite2.setName("lbHumidite2");
        lbHumidite3.setName("lbHumidite3");
        lbHumidite4.setName("lbHumidite4");
        lbHumidite5.setName("lbHumidite5");
        lbHumidite6.setName("lbHumidite6");
        lbHumidite7.setName("lbHumidite7");
        lbHumidite8.setName("lbHumidite8");
        lbHumidite9.setName("lbHumidite9");
        lbHumidite10.setName("lbHumidite10");
        
        lbInsectes1.setName("lbInsectes1");
        lbInsectes2.setName("lbInsectes2");
        lbInsectes3.setName("lbInsectes3");
        lbInsectes4.setName("lbInsectes4");
        lbInsectes5.setName("lbInsectes5");
        lbInsectes6.setName("lbInsectes6");
        lbInsectes7.setName("lbInsectes7");
        lbInsectes8.setName("lbInsectes8");
        lbInsectes9.setName("lbInsectes9");
        lbInsectes10.setName("lbInsectes10");
        
        lbLot1.setName("lbLot1");
        lbLot2.setName("lbLot2");
        lbLot3.setName("lbLot3");
        lbLot4.setName("lbLot4");
        lbLot5.setName("lbLot5");
        lbLot6.setName("lbLot6");
        lbLot7.setName("lbLot7");
        lbLot8.setName("lbLot8");
        lbLot9.setName("lbLot9");
        lbLot10.setName("lbLot10");
        
        lbTemperature1.setName("lbTemperature1");
        lbTemperature2.setName("lbTemperature2");
        lbTemperature3.setName("lbTemperature3");
        lbTemperature4.setName("lbTemperature4");
        lbTemperature5.setName("lbTemperature5");
        lbTemperature6.setName("lbTemperature6");
        lbTemperature7.setName("lbTemperature7");
        lbTemperature8.setName("lbTemperature8");
        lbTemperature9.setName("lbTemperature9");
        lbTemperature10.setName("lbTemperature10");
        
        pbProgression1.setName("pbProgression1");
        pbProgression2.setName("pbProgression2");
        pbProgression3.setName("pbProgression3");
        pbProgression4.setName("pbProgression4");
        pbProgression5.setName("pbProgression5");
        pbProgression6.setName("pbProgression6");
        pbProgression7.setName("pbProgression7");
        pbProgression8.setName("pbProgression8");
        pbProgression9.setName("pbProgression9");
        pbProgression10.setName("pbProgression10");
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbLot1 = new javax.swing.JLabel();
        BtNettoyer1 = new javax.swing.JButton();
        lbHumidite1 = new javax.swing.JLabel();
        BtVentiler1 = new javax.swing.JButton();
        lbTemperature1 = new javax.swing.JLabel();
        BtAspirer1 = new javax.swing.JButton();
        lbConcentrationCH4_1 = new javax.swing.JLabel();
        BtDesinsectiser1 = new javax.swing.JButton();
        lbConcentrationH2S_1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbAlarme1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbInsectes1 = new javax.swing.JLabel();
        pbProgression1 = new javax.swing.JProgressBar();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbLot2 = new javax.swing.JLabel();
        BtNettoyer2 = new javax.swing.JButton();
        lbHumidite2 = new javax.swing.JLabel();
        BtVentiler2 = new javax.swing.JButton();
        lbTemperature2 = new javax.swing.JLabel();
        BtAspirer2 = new javax.swing.JButton();
        lbConcentrationCH4_2 = new javax.swing.JLabel();
        BtDesinsectiser2 = new javax.swing.JButton();
        lbConcentrationH2S_2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbAlarme2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbInsectes2 = new javax.swing.JLabel();
        pbProgression2 = new javax.swing.JProgressBar();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        lbLot3 = new javax.swing.JLabel();
        BtNettoyer3 = new javax.swing.JButton();
        lbHumidite3 = new javax.swing.JLabel();
        BtVentiler3 = new javax.swing.JButton();
        lbTemperature3 = new javax.swing.JLabel();
        BtAspirer3 = new javax.swing.JButton();
        lbConcentrationCH4_3 = new javax.swing.JLabel();
        BtDesinsectiser3 = new javax.swing.JButton();
        lbConcentrationH2S_3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbAlarme3 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbInsectes3 = new javax.swing.JLabel();
        pbProgression3 = new javax.swing.JProgressBar();
        jPanel16 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        lbLot4 = new javax.swing.JLabel();
        BtNettoyer4 = new javax.swing.JButton();
        lbHumidite4 = new javax.swing.JLabel();
        BtVentiler4 = new javax.swing.JButton();
        lbTemperature4 = new javax.swing.JLabel();
        BtAspirer4 = new javax.swing.JButton();
        lbConcentrationCH4_4 = new javax.swing.JLabel();
        BtDesinsectiser4 = new javax.swing.JButton();
        lbConcentrationH2S_4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lbAlarme4 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        lbInsectes4 = new javax.swing.JLabel();
        pbProgression4 = new javax.swing.JProgressBar();
        jPanel18 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        lbLot5 = new javax.swing.JLabel();
        BtNettoyer5 = new javax.swing.JButton();
        lbHumidite5 = new javax.swing.JLabel();
        BtVentiler5 = new javax.swing.JButton();
        lbTemperature5 = new javax.swing.JLabel();
        BtAspirer5 = new javax.swing.JButton();
        lbConcentrationCH4_5 = new javax.swing.JLabel();
        BtDesinsectiser5 = new javax.swing.JButton();
        lbConcentrationH2S_5 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lbAlarme5 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        lbInsectes5 = new javax.swing.JLabel();
        pbProgression5 = new javax.swing.JProgressBar();
        jPanel20 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        lbLot6 = new javax.swing.JLabel();
        BtNettoyer6 = new javax.swing.JButton();
        lbHumidite6 = new javax.swing.JLabel();
        BtVentiler6 = new javax.swing.JButton();
        lbTemperature6 = new javax.swing.JLabel();
        BtAspirer6 = new javax.swing.JButton();
        lbConcentrationCH4_6 = new javax.swing.JLabel();
        BtDesinsectiser6 = new javax.swing.JButton();
        lbConcentrationH2S_6 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lbAlarme6 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        lbInsectes6 = new javax.swing.JLabel();
        pbProgression6 = new javax.swing.JProgressBar();
        jPanel22 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        lbLot7 = new javax.swing.JLabel();
        BtNettoyer7 = new javax.swing.JButton();
        lbHumidite7 = new javax.swing.JLabel();
        BtVentiler7 = new javax.swing.JButton();
        lbTemperature7 = new javax.swing.JLabel();
        BtAspirer7 = new javax.swing.JButton();
        lbConcentrationCH4_7 = new javax.swing.JLabel();
        BtDesinsectiser7 = new javax.swing.JButton();
        lbConcentrationH2S_7 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        lbAlarme7 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        lbInsectes7 = new javax.swing.JLabel();
        pbProgression7 = new javax.swing.JProgressBar();
        jPanel24 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        lbLot8 = new javax.swing.JLabel();
        BtNettoyer8 = new javax.swing.JButton();
        lbHumidite8 = new javax.swing.JLabel();
        BtVentiler8 = new javax.swing.JButton();
        lbTemperature8 = new javax.swing.JLabel();
        BtAspirer8 = new javax.swing.JButton();
        lbConcentrationCH4_8 = new javax.swing.JLabel();
        BtDesinsectiser8 = new javax.swing.JButton();
        lbConcentrationH2S_8 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        lbAlarme8 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lbInsectes8 = new javax.swing.JLabel();
        pbProgression8 = new javax.swing.JProgressBar();
        jPanel26 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        lbLot9 = new javax.swing.JLabel();
        BtNettoyer9 = new javax.swing.JButton();
        lbHumidite9 = new javax.swing.JLabel();
        BtVentiler9 = new javax.swing.JButton();
        lbTemperature9 = new javax.swing.JLabel();
        BtAspirer9 = new javax.swing.JButton();
        lbConcentrationCH4_9 = new javax.swing.JLabel();
        BtDesinsectiser9 = new javax.swing.JButton();
        lbConcentrationH2S_9 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        lbAlarme9 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        lbInsectes9 = new javax.swing.JLabel();
        pbProgression9 = new javax.swing.JProgressBar();
        jPanel28 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        lbLot10 = new javax.swing.JLabel();
        BtNettoyer10 = new javax.swing.JButton();
        lbHumidite10 = new javax.swing.JLabel();
        BtVentiler10 = new javax.swing.JButton();
        lbTemperature10 = new javax.swing.JLabel();
        BtAspirer10 = new javax.swing.JButton();
        lbConcentrationCH4_10 = new javax.swing.JLabel();
        BtDesinsectiser10 = new javax.swing.JButton();
        lbConcentrationH2S_10 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        lbAlarme10 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        lbInsectes10 = new javax.swing.JLabel();
        pbProgression10 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 5));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Cellule 1");
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel11.setLayout(new java.awt.GridLayout(7, 2));

        jLabel11.setText("Lot de cereales :");
        jPanel11.add(jLabel11);

        lbLot1.setText("Blé, lot n°12");
        jPanel11.add(lbLot1);

        BtNettoyer1.setText("Nettoyer");
        jPanel11.add(BtNettoyer1);

        lbHumidite1.setText("Humidité : ");
        jPanel11.add(lbHumidite1);

        BtVentiler1.setText("Ventiler");
        jPanel11.add(BtVentiler1);

        lbTemperature1.setText("Temperature : ");
        jPanel11.add(lbTemperature1);

        BtAspirer1.setText("Aspirer");
        jPanel11.add(BtAspirer1);

        lbConcentrationCH4_1.setText("Concentration CH4 :");
        jPanel11.add(lbConcentrationCH4_1);

        BtDesinsectiser1.setText("Desinsectiser");
        jPanel11.add(BtDesinsectiser1);

        lbConcentrationH2S_1.setText("Concentration H2S :");
        jPanel11.add(lbConcentrationH2S_1);

        jLabel6.setText("Alarme en cours :");
        jPanel11.add(jLabel6);

        lbAlarme1.setText("Non");
        jPanel11.add(lbAlarme1);

        jLabel8.setText("Presence d'insectes :");
        jPanel11.add(jLabel8);

        lbInsectes1.setText("Non");
        jPanel11.add(lbInsectes1);

        jPanel1.add(jPanel11, java.awt.BorderLayout.CENTER);
        jPanel1.add(pbProgression1, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel12.setText("Cellule 2");
        jPanel12.add(jLabel12, java.awt.BorderLayout.NORTH);

        jPanel13.setLayout(new java.awt.GridLayout(7, 2));

        jLabel13.setText("Lot de cereales :");
        jPanel13.add(jLabel13);

        lbLot2.setText("Blé, lot n°12");
        jPanel13.add(lbLot2);

        BtNettoyer2.setText("Nettoyer");
        jPanel13.add(BtNettoyer2);

        lbHumidite2.setText("Humidité : ");
        jPanel13.add(lbHumidite2);

        BtVentiler2.setText("Ventiler");
        jPanel13.add(BtVentiler2);

        lbTemperature2.setText("Temperature : ");
        jPanel13.add(lbTemperature2);

        BtAspirer2.setText("Aspirer");
        jPanel13.add(BtAspirer2);

        lbConcentrationCH4_2.setText("Concentration CH4 :");
        jPanel13.add(lbConcentrationCH4_2);

        BtDesinsectiser2.setText("Desinsectiser");
        jPanel13.add(BtDesinsectiser2);

        lbConcentrationH2S_2.setText("Concentration H2S :");
        jPanel13.add(lbConcentrationH2S_2);

        jLabel19.setText("Alarme en cours :");
        jPanel13.add(jLabel19);

        lbAlarme2.setText("Non");
        jPanel13.add(lbAlarme2);

        jLabel21.setText("Presence d'insectes :");
        jPanel13.add(jLabel21);

        lbInsectes2.setText("Non");
        jPanel13.add(lbInsectes2);

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);
        jPanel12.add(pbProgression2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel12);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel23.setText("Cellule 3");
        jPanel14.add(jLabel23, java.awt.BorderLayout.NORTH);

        jPanel15.setLayout(new java.awt.GridLayout(7, 2));

        jLabel24.setText("Lot de cereales :");
        jPanel15.add(jLabel24);

        lbLot3.setText("Blé, lot n°12");
        jPanel15.add(lbLot3);

        BtNettoyer3.setText("Nettoyer");
        jPanel15.add(BtNettoyer3);

        lbHumidite3.setText("Humidité : ");
        jPanel15.add(lbHumidite3);

        BtVentiler3.setText("Ventiler");
        jPanel15.add(BtVentiler3);

        lbTemperature3.setText("Temperature : ");
        jPanel15.add(lbTemperature3);

        BtAspirer3.setText("Aspirer");
        jPanel15.add(BtAspirer3);

        lbConcentrationCH4_3.setText("Concentration CH4 :");
        jPanel15.add(lbConcentrationCH4_3);

        BtDesinsectiser3.setText("Desinsectiser");
        jPanel15.add(BtDesinsectiser3);

        lbConcentrationH2S_3.setText("Concentration H2S :");
        jPanel15.add(lbConcentrationH2S_3);

        jLabel30.setText("Alarme en cours :");
        jPanel15.add(jLabel30);

        lbAlarme3.setText("Non");
        jPanel15.add(lbAlarme3);

        jLabel32.setText("Presence d'insectes :");
        jPanel15.add(jLabel32);

        lbInsectes3.setText("Non");
        jPanel15.add(lbInsectes3);

        jPanel14.add(jPanel15, java.awt.BorderLayout.CENTER);
        jPanel14.add(pbProgression3, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel14);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel34.setText("Cellule 4");
        jPanel16.add(jLabel34, java.awt.BorderLayout.NORTH);

        jPanel17.setLayout(new java.awt.GridLayout(7, 2));

        jLabel35.setText("Lot de cereales :");
        jPanel17.add(jLabel35);

        lbLot4.setText("Blé, lot n°12");
        jPanel17.add(lbLot4);

        BtNettoyer4.setText("Nettoyer");
        jPanel17.add(BtNettoyer4);

        lbHumidite4.setText("Humidité : ");
        jPanel17.add(lbHumidite4);

        BtVentiler4.setText("Ventiler");
        jPanel17.add(BtVentiler4);

        lbTemperature4.setText("Temperature : ");
        jPanel17.add(lbTemperature4);

        BtAspirer4.setText("Aspirer");
        jPanel17.add(BtAspirer4);

        lbConcentrationCH4_4.setText("Concentration CH4 :");
        jPanel17.add(lbConcentrationCH4_4);

        BtDesinsectiser4.setText("Desinsectiser");
        jPanel17.add(BtDesinsectiser4);

        lbConcentrationH2S_4.setText("Concentration H2S :");
        jPanel17.add(lbConcentrationH2S_4);

        jLabel41.setText("Alarme en cours :");
        jPanel17.add(jLabel41);

        lbAlarme4.setText("Non");
        jPanel17.add(lbAlarme4);

        jLabel43.setText("Presence d'insectes :");
        jPanel17.add(jLabel43);

        lbInsectes4.setText("Non");
        jPanel17.add(lbInsectes4);

        jPanel16.add(jPanel17, java.awt.BorderLayout.CENTER);
        jPanel16.add(pbProgression4, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel16);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel45.setText("Cellule 5");
        jPanel18.add(jLabel45, java.awt.BorderLayout.NORTH);

        jPanel19.setLayout(new java.awt.GridLayout(7, 2));

        jLabel46.setText("Lot de cereales :");
        jPanel19.add(jLabel46);

        lbLot5.setText("Blé, lot n°12");
        jPanel19.add(lbLot5);

        BtNettoyer5.setText("Nettoyer");
        jPanel19.add(BtNettoyer5);

        lbHumidite5.setText("Humidité : ");
        jPanel19.add(lbHumidite5);

        BtVentiler5.setText("Ventiler");
        jPanel19.add(BtVentiler5);

        lbTemperature5.setText("Temperature : ");
        jPanel19.add(lbTemperature5);

        BtAspirer5.setText("Aspirer");
        jPanel19.add(BtAspirer5);

        lbConcentrationCH4_5.setText("Concentration CH4 :");
        jPanel19.add(lbConcentrationCH4_5);

        BtDesinsectiser5.setText("Desinsectiser");
        jPanel19.add(BtDesinsectiser5);

        lbConcentrationH2S_5.setText("Concentration H2S :");
        jPanel19.add(lbConcentrationH2S_5);

        jLabel52.setText("Alarme en cours :");
        jPanel19.add(jLabel52);

        lbAlarme5.setText("Non");
        jPanel19.add(lbAlarme5);

        jLabel54.setText("Presence d'insectes :");
        jPanel19.add(jLabel54);

        lbInsectes5.setText("Non");
        jPanel19.add(lbInsectes5);

        jPanel18.add(jPanel19, java.awt.BorderLayout.CENTER);
        jPanel18.add(pbProgression5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel18);

        jPanel20.setLayout(new java.awt.BorderLayout());

        jLabel56.setText("Cellule 6");
        jPanel20.add(jLabel56, java.awt.BorderLayout.NORTH);

        jPanel21.setLayout(new java.awt.GridLayout(7, 2));

        jLabel57.setText("Lot de cereales :");
        jPanel21.add(jLabel57);

        lbLot6.setText("Blé, lot n°12");
        jPanel21.add(lbLot6);

        BtNettoyer6.setText("Nettoyer");
        jPanel21.add(BtNettoyer6);

        lbHumidite6.setText("Humidité : ");
        jPanel21.add(lbHumidite6);

        BtVentiler6.setText("Ventiler");
        jPanel21.add(BtVentiler6);

        lbTemperature6.setText("Temperature : ");
        jPanel21.add(lbTemperature6);

        BtAspirer6.setText("Aspirer");
        jPanel21.add(BtAspirer6);

        lbConcentrationCH4_6.setText("Concentration CH4 :");
        jPanel21.add(lbConcentrationCH4_6);

        BtDesinsectiser6.setText("Desinsectiser");
        jPanel21.add(BtDesinsectiser6);

        lbConcentrationH2S_6.setText("Concentration H2S :");
        jPanel21.add(lbConcentrationH2S_6);

        jLabel63.setText("Alarme en cours :");
        jPanel21.add(jLabel63);

        lbAlarme6.setText("Non");
        jPanel21.add(lbAlarme6);

        jLabel65.setText("Presence d'insectes :");
        jPanel21.add(jLabel65);

        lbInsectes6.setText("Non");
        jPanel21.add(lbInsectes6);

        jPanel20.add(jPanel21, java.awt.BorderLayout.CENTER);
        jPanel20.add(pbProgression6, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel20);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel67.setText("Cellule 7");
        jPanel22.add(jLabel67, java.awt.BorderLayout.NORTH);

        jPanel23.setLayout(new java.awt.GridLayout(7, 2));

        jLabel68.setText("Lot de cereales :");
        jPanel23.add(jLabel68);

        lbLot7.setText("Blé, lot n°12");
        jPanel23.add(lbLot7);

        BtNettoyer7.setText("Nettoyer");
        jPanel23.add(BtNettoyer7);

        lbHumidite7.setText("Humidité : ");
        jPanel23.add(lbHumidite7);

        BtVentiler7.setText("Ventiler");
        jPanel23.add(BtVentiler7);

        lbTemperature7.setText("Temperature : ");
        jPanel23.add(lbTemperature7);

        BtAspirer7.setText("Aspirer");
        jPanel23.add(BtAspirer7);

        lbConcentrationCH4_7.setText("Concentration CH4 :");
        jPanel23.add(lbConcentrationCH4_7);

        BtDesinsectiser7.setText("Desinsectiser");
        jPanel23.add(BtDesinsectiser7);

        lbConcentrationH2S_7.setText("Concentration H2S :");
        jPanel23.add(lbConcentrationH2S_7);

        jLabel74.setText("Alarme en cours :");
        jPanel23.add(jLabel74);

        lbAlarme7.setText("Non");
        jPanel23.add(lbAlarme7);

        jLabel76.setText("Presence d'insectes :");
        jPanel23.add(jLabel76);

        lbInsectes7.setText("Non");
        jPanel23.add(lbInsectes7);

        jPanel22.add(jPanel23, java.awt.BorderLayout.CENTER);
        jPanel22.add(pbProgression7, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel22);

        jPanel24.setLayout(new java.awt.BorderLayout());

        jLabel78.setText("Cellule 8");
        jPanel24.add(jLabel78, java.awt.BorderLayout.NORTH);

        jPanel25.setLayout(new java.awt.GridLayout(7, 2));

        jLabel79.setText("Lot de cereales :");
        jPanel25.add(jLabel79);

        lbLot8.setText("Blé, lot n°12");
        jPanel25.add(lbLot8);

        BtNettoyer8.setText("Nettoyer");
        jPanel25.add(BtNettoyer8);

        lbHumidite8.setText("Humidité : ");
        jPanel25.add(lbHumidite8);

        BtVentiler8.setText("Ventiler");
        jPanel25.add(BtVentiler8);

        lbTemperature8.setText("Temperature : ");
        jPanel25.add(lbTemperature8);

        BtAspirer8.setText("Aspirer");
        jPanel25.add(BtAspirer8);

        lbConcentrationCH4_8.setText("Concentration CH4 :");
        jPanel25.add(lbConcentrationCH4_8);

        BtDesinsectiser8.setText("Desinsectiser");
        jPanel25.add(BtDesinsectiser8);

        lbConcentrationH2S_8.setText("Concentration H2S :");
        jPanel25.add(lbConcentrationH2S_8);

        jLabel85.setText("Alarme en cours :");
        jPanel25.add(jLabel85);

        lbAlarme8.setText("Non");
        jPanel25.add(lbAlarme8);

        jLabel87.setText("Presence d'insectes :");
        jPanel25.add(jLabel87);

        lbInsectes8.setText("Non");
        jPanel25.add(lbInsectes8);

        jPanel24.add(jPanel25, java.awt.BorderLayout.CENTER);
        jPanel24.add(pbProgression8, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel24);

        jPanel26.setLayout(new java.awt.BorderLayout());

        jLabel89.setText("Cellule 9");
        jPanel26.add(jLabel89, java.awt.BorderLayout.NORTH);

        jPanel27.setLayout(new java.awt.GridLayout(7, 2));

        jLabel90.setText("Lot de cereales :");
        jPanel27.add(jLabel90);

        lbLot9.setText("Blé, lot n°12");
        jPanel27.add(lbLot9);

        BtNettoyer9.setText("Nettoyer");
        jPanel27.add(BtNettoyer9);

        lbHumidite9.setText("Humidité : ");
        jPanel27.add(lbHumidite9);

        BtVentiler9.setText("Ventiler");
        jPanel27.add(BtVentiler9);

        lbTemperature9.setText("Temperature : ");
        jPanel27.add(lbTemperature9);

        BtAspirer9.setText("Aspirer");
        jPanel27.add(BtAspirer9);

        lbConcentrationCH4_9.setText("Concentration CH4 :");
        jPanel27.add(lbConcentrationCH4_9);

        BtDesinsectiser9.setText("Desinsectiser");
        jPanel27.add(BtDesinsectiser9);

        lbConcentrationH2S_9.setText("Concentration H2S :");
        jPanel27.add(lbConcentrationH2S_9);

        jLabel96.setText("Alarme en cours :");
        jPanel27.add(jLabel96);

        lbAlarme9.setText("Non");
        jPanel27.add(lbAlarme9);

        jLabel98.setText("Presence d'insectes :");
        jPanel27.add(jLabel98);

        lbInsectes9.setText("Non");
        jPanel27.add(lbInsectes9);

        jPanel26.add(jPanel27, java.awt.BorderLayout.CENTER);
        jPanel26.add(pbProgression9, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel26);

        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel100.setText("Cellule 10");
        jPanel28.add(jLabel100, java.awt.BorderLayout.NORTH);

        jPanel29.setLayout(new java.awt.GridLayout(7, 2));

        jLabel101.setText("Lot de cereales :");
        jPanel29.add(jLabel101);

        lbLot10.setText("Blé, lot n°12");
        jPanel29.add(lbLot10);

        BtNettoyer10.setText("Nettoyer");
        jPanel29.add(BtNettoyer10);

        lbHumidite10.setText("Humidité : ");
        jPanel29.add(lbHumidite10);

        BtVentiler10.setText("Ventiler");
        jPanel29.add(BtVentiler10);

        lbTemperature10.setText("Temperature : ");
        jPanel29.add(lbTemperature10);

        BtAspirer10.setText("Aspirer");
        jPanel29.add(BtAspirer10);

        lbConcentrationCH4_10.setText("Concentration CH4 :");
        jPanel29.add(lbConcentrationCH4_10);

        BtDesinsectiser10.setText("Desinsectiser");
        jPanel29.add(BtDesinsectiser10);

        lbConcentrationH2S_10.setText("Concentration H2S :");
        jPanel29.add(lbConcentrationH2S_10);

        jLabel107.setText("Alarme en cours :");
        jPanel29.add(jLabel107);

        lbAlarme10.setText("Non");
        jPanel29.add(lbAlarme10);

        jLabel109.setText("Presence d'insectes :");
        jPanel29.add(jLabel109);

        lbInsectes10.setText("Non");
        jPanel29.add(lbInsectes10);

        jPanel28.add(jPanel29, java.awt.BorderLayout.CENTER);
        jPanel28.add(pbProgression10, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vue().setVisible(true);
            }
        });
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAspirer1;
    private javax.swing.JButton BtAspirer10;
    private javax.swing.JButton BtAspirer2;
    private javax.swing.JButton BtAspirer3;
    private javax.swing.JButton BtAspirer4;
    private javax.swing.JButton BtAspirer5;
    private javax.swing.JButton BtAspirer6;
    private javax.swing.JButton BtAspirer7;
    private javax.swing.JButton BtAspirer8;
    private javax.swing.JButton BtAspirer9;
    private javax.swing.JButton BtDesinsectiser1;
    private javax.swing.JButton BtDesinsectiser10;
    private javax.swing.JButton BtDesinsectiser2;
    private javax.swing.JButton BtDesinsectiser3;
    private javax.swing.JButton BtDesinsectiser4;
    private javax.swing.JButton BtDesinsectiser5;
    private javax.swing.JButton BtDesinsectiser6;
    private javax.swing.JButton BtDesinsectiser7;
    private javax.swing.JButton BtDesinsectiser8;
    private javax.swing.JButton BtDesinsectiser9;
    private javax.swing.JButton BtNettoyer1;
    private javax.swing.JButton BtNettoyer10;
    private javax.swing.JButton BtNettoyer2;
    private javax.swing.JButton BtNettoyer3;
    private javax.swing.JButton BtNettoyer4;
    private javax.swing.JButton BtNettoyer5;
    private javax.swing.JButton BtNettoyer6;
    private javax.swing.JButton BtNettoyer7;
    private javax.swing.JButton BtNettoyer8;
    private javax.swing.JButton BtNettoyer9;
    private javax.swing.JButton BtVentiler1;
    private javax.swing.JButton BtVentiler10;
    private javax.swing.JButton BtVentiler2;
    private javax.swing.JButton BtVentiler3;
    private javax.swing.JButton BtVentiler4;
    private javax.swing.JButton BtVentiler5;
    private javax.swing.JButton BtVentiler6;
    private javax.swing.JButton BtVentiler7;
    private javax.swing.JButton BtVentiler8;
    private javax.swing.JButton BtVentiler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JLabel lbAlarme1;
    private javax.swing.JLabel lbAlarme10;
    private javax.swing.JLabel lbAlarme2;
    private javax.swing.JLabel lbAlarme3;
    private javax.swing.JLabel lbAlarme4;
    private javax.swing.JLabel lbAlarme5;
    private javax.swing.JLabel lbAlarme6;
    private javax.swing.JLabel lbAlarme7;
    private javax.swing.JLabel lbAlarme8;
    private javax.swing.JLabel lbAlarme9;
    private javax.swing.JLabel lbConcentrationCH4_1;
    private javax.swing.JLabel lbConcentrationCH4_10;
    private javax.swing.JLabel lbConcentrationCH4_2;
    private javax.swing.JLabel lbConcentrationCH4_3;
    private javax.swing.JLabel lbConcentrationCH4_4;
    private javax.swing.JLabel lbConcentrationCH4_5;
    private javax.swing.JLabel lbConcentrationCH4_6;
    private javax.swing.JLabel lbConcentrationCH4_7;
    private javax.swing.JLabel lbConcentrationCH4_8;
    private javax.swing.JLabel lbConcentrationCH4_9;
    private javax.swing.JLabel lbConcentrationH2S_1;
    private javax.swing.JLabel lbConcentrationH2S_10;
    private javax.swing.JLabel lbConcentrationH2S_2;
    private javax.swing.JLabel lbConcentrationH2S_3;
    private javax.swing.JLabel lbConcentrationH2S_4;
    private javax.swing.JLabel lbConcentrationH2S_5;
    private javax.swing.JLabel lbConcentrationH2S_6;
    private javax.swing.JLabel lbConcentrationH2S_7;
    private javax.swing.JLabel lbConcentrationH2S_8;
    private javax.swing.JLabel lbConcentrationH2S_9;
    private javax.swing.JLabel lbHumidite1;
    private javax.swing.JLabel lbHumidite10;
    private javax.swing.JLabel lbHumidite2;
    private javax.swing.JLabel lbHumidite3;
    private javax.swing.JLabel lbHumidite4;
    private javax.swing.JLabel lbHumidite5;
    private javax.swing.JLabel lbHumidite6;
    private javax.swing.JLabel lbHumidite7;
    private javax.swing.JLabel lbHumidite8;
    private javax.swing.JLabel lbHumidite9;
    private javax.swing.JLabel lbInsectes1;
    private javax.swing.JLabel lbInsectes10;
    private javax.swing.JLabel lbInsectes2;
    private javax.swing.JLabel lbInsectes3;
    private javax.swing.JLabel lbInsectes4;
    private javax.swing.JLabel lbInsectes5;
    private javax.swing.JLabel lbInsectes6;
    private javax.swing.JLabel lbInsectes7;
    private javax.swing.JLabel lbInsectes8;
    private javax.swing.JLabel lbInsectes9;
    private javax.swing.JLabel lbLot1;
    private javax.swing.JLabel lbLot10;
    private javax.swing.JLabel lbLot2;
    private javax.swing.JLabel lbLot3;
    private javax.swing.JLabel lbLot4;
    private javax.swing.JLabel lbLot5;
    private javax.swing.JLabel lbLot6;
    private javax.swing.JLabel lbLot7;
    private javax.swing.JLabel lbLot8;
    private javax.swing.JLabel lbLot9;
    private javax.swing.JLabel lbTemperature1;
    private javax.swing.JLabel lbTemperature10;
    private javax.swing.JLabel lbTemperature2;
    private javax.swing.JLabel lbTemperature3;
    private javax.swing.JLabel lbTemperature4;
    private javax.swing.JLabel lbTemperature5;
    private javax.swing.JLabel lbTemperature6;
    private javax.swing.JLabel lbTemperature7;
    private javax.swing.JLabel lbTemperature8;
    private javax.swing.JLabel lbTemperature9;
    private javax.swing.JProgressBar pbProgression1;
    private javax.swing.JProgressBar pbProgression10;
    private javax.swing.JProgressBar pbProgression2;
    private javax.swing.JProgressBar pbProgression3;
    private javax.swing.JProgressBar pbProgression4;
    private javax.swing.JProgressBar pbProgression5;
    private javax.swing.JProgressBar pbProgression6;
    private javax.swing.JProgressBar pbProgression7;
    private javax.swing.JProgressBar pbProgression8;
    private javax.swing.JProgressBar pbProgression9;
    // End of variables declaration//GEN-END:variables
}
