package Gages;


import Gages.PlugGage;
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
public class MajorDiameterPlugGO extends PlugGage{
    
    private double majorDiameterWorn;
    
    public MajorDiameterPlugGO(Gear inGear){
        super(inGear);
        this.majorDiameterPlus = inGear.getMajorDiameter() + 
                this.tolGage.GOSpaceWidthStandA + this.tolGage.majorDiameter;
        this.majorDiameterMinus = inGear.getMajorDiameter() + 
                this.tolGage.GOSpaceWidthStandA;
        majorDiameterWorn = inGear.getMajorDiameter();
    }

    public double getMajorDiameterWorn() {
        return majorDiameterWorn;
    }
    
}
