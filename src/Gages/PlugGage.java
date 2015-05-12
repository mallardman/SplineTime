package Gages;


import Gages.PlugGageTolerence;
import Gears.Gear;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class PlugGage extends Gage{
    protected double majorDiameterPlus;
    protected double majorDiameterMinus;
    protected double MOPNewPlus;
    protected double MOPNewMinus;
    protected PlugGageTolerence tolGage;
    
    PlugGage(Gear myGear){
        super(myGear);
        tolGage = new PlugGageTolerence(myGear);
    }
    
    PlugGage(){
        super();
    }
    
    public double getMajorDiameterPlus() {
        return majorDiameterPlus;
    }

    public double getMajorDiameterMinus() {
        return majorDiameterMinus;
    }

    public double getMOPNewPlus() {
        return MOPNewPlus;
    }

    public double getMOPNewMinus() {
        return MOPNewMinus;
    }
    
    
    
}
