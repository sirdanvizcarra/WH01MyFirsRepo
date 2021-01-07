/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Daniel Vizcarra ESPE - DCCO
 */
public class Area {
    
    private int height;
    private int width;
    private int initNumberOfFoodPiles;
    private int tickDuration;

    @Override
    public String toString() {
        return height + ","  + width + "," + initNumberOfFoodPiles + "," + tickDuration;
    }
    
    
    
    public static void main(String[] args) {
        //TODO code application logic here
        
        Area area = new Area();
        
        area.setInitNumberOfFoodPiles(2);
        
        area.setTickDuration(1000);
        
        area.setWidth(20);
      
    }
    
    
    
    
    
    
    
    public void setup(){
        
    }
    
    public void add(Colony colony){
        
    }
    
    public void add(AntEater antEater){
        
    }
    
    public boolean isAnyFoodRemaining(){
        
        return true;
    }
    
    public Cell getCell(int row, int col){
        
        Cell cell = new Cell();
        
        return cell;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the initNumberOfFoodPiles
     */
    public int getInitNumberOfFoodPiles() {
        return initNumberOfFoodPiles;
    }

    /**
     * @param initNumberOfFoodPiles the initNumberOfFoodPiles to set
     */
    public void setInitNumberOfFoodPiles(int initNumberOfFoodPiles) {
        this.initNumberOfFoodPiles = initNumberOfFoodPiles;
    }

    /**
     * @return the tickDuration
     */
    public int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }
    
            
}
