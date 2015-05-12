package Gages;


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
public class CompPlugSideFitGO extends PlugGage {
    private double CTTNew;
    private double CTTWorn;
    private double measuringPinDiameter;
    private double MOPNew;
    private double MOPworn;
    
    public CompPlugSideFitGO(){
        
    }
    
    public CompPlugSideFitGO(Gear inGear){
        super(inGear);
        runCalculations(inGear);
    }
    
    //Start Getters
    
    @Override
    public void runCalculations( Gear inGear){
        this.majorDiameterPlus = inGear.getFormDiameter() + tolGage.getOverPinMeasurements();
        this.minorDiameter = inGear.getFormDiameter();
        this.formDiameter = inGear.getMinorDiameter() -  2 * inGear.getFormClearance();
        this.measuringPinDiameter = 1.9200 / inGear.getPitchDiametric();
        this.majorDiameterMinus = inGear.getFormDiameter();
        //Check with client to see if Standard B is being used.
        this.CTTNew = inGear.getToothThickness() + tolGage.getGOSpaceWidthStandA();
        this.CTTWorn = inGear.getTeethGap();
        this.MOPNewPlus = tolGage.getOverPinMeasurements();
        this.MOPNewMinus = 0.0;
        this.MOPworn=0;
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
