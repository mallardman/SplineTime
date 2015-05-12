package Gages;


import Gages.PlugGage;
import Gages.PlugGageTolerence;
import Gears.Gear;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This also works for not go major diameter.
 * @author marco
 */
public class CompPlugSideFitAndMajorNOGO extends PlugGage {
    private double CTTNew;
    private double CTTWorn;
    private double measuringPinDiameter;
    private double MOPNew;
    private double MOPworn;
    
    public CompPlugSideFitAndMajorNOGO(){
        
    }
    
    public CompPlugSideFitAndMajorNOGO(Gear inGear){
        super(inGear);
        runCalculations(inGear);
    }
    
    //Start Getters
    
    @Override
    public void runCalculations( Gear inGear){
        this.majorDiameterPlus = calculateMajorDiameterBase(inGear) + .001;
        this.minorDiameter = inGear.getFormDiameter();
        this.formDiameter = inGear.getMinorDiameter() -  2 * inGear.getFormClearance();
        this.measuringPinDiameter = 1.9200 / inGear.getPitchDiametric();
        this.majorDiameterMinus = calculateMajorDiameterBase(inGear) - .001; 
        this.CTTNew = inGear.getToothThickness();
        this.CTTWorn = 0.00;
        this.MOPNewPlus = 0.00;
        this.MOPNewMinus = tolGage.getOverPinMeasurements();
        this.MOPworn=0;
    }
    
    private double calculateMajorDiameterBase(Gear inGear){
        return (2 * inGear.getFormDiameter() + inGear.getPitchDiameter()) / 3;
    }
    
    
    public double getCTTNew() {
        return CTTNew;
    }

    public double getCTTWorn() {
        return CTTWorn;
    }

    public double getMeasuringPinDiameter() {
        return measuringPinDiameter;
    }

    public double getMOPNew() {
        return MOPNew;
    }

    public double getMOPworn() {
        return MOPworn;
    }
    
    
    
    //End Getters

    public PlugGageTolerence getTolGage() {
        return tolGage;
    }
    
}
