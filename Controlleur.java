import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlleur implements ActionListener{

    private Silo silo;
    
    public Controlleur(Silo s){
        this.silo = s;
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //cellule 1
        if(((Component)e.getSource()).getName().equals("BtAspirer1")){
            System.out.println("a1");
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser1")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer1")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler1")){
            
        }
        
        //cellule 2
        else if(((Component)e.getSource()).getName().equals("BtAspirer2")){
            System.out.println("a2");
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser2")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer2")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler2")){
            
        }
        
        //cellule 3
        else if(((Component)e.getSource()).getName().equals("BtAspirer3")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser3")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer3")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler3")){
            
        }
        
        //cellule 4
        else if(((Component)e.getSource()).getName().equals("BtAspirer4")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser4")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer4")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler4")){
            
        }
        
        //cellule 5
        else if(((Component)e.getSource()).getName().equals("BtAspirer5")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser5")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer5")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler5")){
            
        }
        
        //cellule 6
        else if(((Component)e.getSource()).getName().equals("BtAspirer6")){
            System.out.println("a6");
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser6")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer6")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler6")){
            
        }
        
        //cellule 7
        else if(((Component)e.getSource()).getName().equals("BtAspirer7")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser7")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer7")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler7")){
            
        }
        
        //cellule 8
        else if(((Component)e.getSource()).getName().equals("BtAspirer8")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser8")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer8")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler8")){
            
        }
        
        //cellule 9
        else if(((Component)e.getSource()).getName().equals("BtAspirer9")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser9")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer9")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler9")){
            
        }
        
        //cellule 10
        else if(((Component)e.getSource()).getName().equals("BtAspirer10")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtDesinsectiser10")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtNettoyer10")){
            
        }
        else if(((Component)e.getSource()).getName().equals("BtVentiler10")){
            
        }
    }
    
}
