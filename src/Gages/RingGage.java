/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gages;
import Gears.*;
/**
 *
 * @author marco
 */
public class RingGage extends Gage {
    
    protected double minorDiameterPlus;
    protected double minorDiameterMinus;
    protected int numberOfSectors;
    protected RingGageTolerence tol;
    
    public RingGage(Gear inGear){
        super(inGear);
        tol = new RingGageTolerence(inGear); 
        calculateNumberOfSectors(inGear);
    }
    
    protected void calculateNumberOfSectors(Gear inGear){
        if(30 > inGear.getNumberOfTeeth()){
            numberOfSectors = 2;
        }
        
        if(31 <= inGear.getNumberOfTeeth() && 44 >= inGear.getNumberOfTeeth()){
            numberOfSectors = 3;
        }
        
        if(44 <= inGear.getNumberOfTeeth() && 58 >= inGear.getNumberOfTeeth()){
            numberOfSectors = 4;
        }
        
        if(59 <= inGear.getNumberOfTeeth() && 72 >= inGear.getNumberOfTeeth()){
            numberOfSectors = 5;
        }
        
        if(73 <= inGear.getNumberOfTeeth() && 86 >= inGear.getNumberOfTeeth()){
            numberOfSectors = 6;
        }
        
        if(87 <= inGear.getNumberOfTeeth() && 100 >= inGear.getNumberOfTeeth()){
            numberOfSectors = 7;
        }
        
        if(inGear.getNumberOfTeeth() > 100){
            numberOfSectors = 
                    (int)Math.floor(inGear.getNumberOfTeeth() * .075 + .5);
        }
    }

    public double getMinorDiameterPlus() {
        return minorDiameterPlus;
    }

    public double getMinorDiameterMinus() {
        return minorDiameterMinus;
    }

    public int getNumberOfSectors() {
        return numberOfSectors;
    }

    public RingGageTolerence getTol() {
        return tol;
    }
    
    
    
}
