package Gages;


import Gears.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Gage {
    protected double majorDiameter;
    protected double minorDiameter;
    protected double pitchDiameter;
    protected double formDiameter;
    
    Gage(){}
    
    Gage(Gear inGear){
    }
    
    public void runCalculations(Gear inGear){
        
    }
   
    
    public double getMajorDiameter() {
        return majorDiameter;
    }

    public double getMinorDiameter() {
        return minorDiameter;
    }

    public double getPitchDiameter() {
        return pitchDiameter;
    }

    public double getFormDiameter() {
        return formDiameter;
    }

    
}
