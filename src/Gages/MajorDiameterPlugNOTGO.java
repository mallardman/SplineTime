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
public class MajorDiameterPlugNOTGO extends PlugGage{
    
    private double majorDiameterWorn;
    
    public MajorDiameterPlugNOTGO(Gear inGear){
        super(inGear);
        this.majorDiameterPlus = inGear.getMajorDiameter() + 
                this.tolGage.GOSpaceWidthStandA;
        this.majorDiameterMinus = inGear.getMajorDiameter() - 
                this.tolGage.GOSpaceWidthStandA;
    }
    
}
