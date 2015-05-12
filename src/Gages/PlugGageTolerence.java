package Gages;


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

public class PlugGageTolerence extends GageTolerence{
    //Equal to tooth thickness tolerance.
    //Table 71
    protected double overPinMeasurements;
    //Table 
    protected double majorDiameter;
    protected double sidesOfTeeth;
    
    
    PlugGageTolerence(Gear inGear){
        super(inGear);
        runCalculations(inGear);
        sidesOfTeeth = .0005;
    }
    
    private void runCalculations(Gear inGear){
        calculateMajorDiameter(inGear);
        overPinMeasurements = this.calculateOverPinMeasurements(inGear);        
    }
    //Write up additional documentation for pitch diametrics of less than 5
    
    protected void calculateMajorDiameter(Gear inGear){
        if(inGear.getMajorDiameter() <= 1.50){
            this.majorDiameter = .0001;
        }
        
        if(inGear.getMajorDiameter() > 1.50 && inGear.getMajorDiameter() <= 6.00){
            this.majorDiameter = .0002;
        }
        
        if(inGear.getMajorDiameter() > 6.00){
            this.majorDiameter = .0003;
        }
        
        
    }
    
    protected double calculateOverPinMeasurements(Gear inGear){
       
        if(inGear.getPitchDiametric() <= 5){
            if(inGear.getNumberOfTeeth() < 28){
                return .00020;
            }
            
            if(inGear.getNumberOfTeeth() >= 28 && inGear.getNumberOfTeeth() < 30){
                return .00022;
            }
            
            if(inGear.getNumberOfTeeth() >= 30 && inGear.getNumberOfTeeth() < 32){
                return .00024;
            }
            
            if(inGear.getNumberOfTeeth() >= 32 && inGear.getNumberOfTeeth() < 34){
                return .00025;
            }
            
            if(inGear.getNumberOfTeeth() >= 34 && inGear.getNumberOfTeeth() < 36){
                return .00027;
            }
            
            if(inGear.getNumberOfTeeth() >= 36 && inGear.getNumberOfTeeth() < 38){
                return .00029;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00031;
            }
            
            if(inGear.getNumberOfTeeth() >= 40){
                return .00032;
            }
        }
        
        if(inGear.getPitchDiametric() == 6){
            if(inGear.getNumberOfTeeth() < 32){
                return .00020;
            }
            
            if(inGear.getNumberOfTeeth() >= 32 && inGear.getNumberOfTeeth() < 34){
                return .00021;
            }
            
            if(inGear.getNumberOfTeeth() >= 34 && inGear.getNumberOfTeeth() < 36){
                return .00023;
            }
            
            if(inGear.getNumberOfTeeth() >= 36 && inGear.getNumberOfTeeth() < 38){
                return .00024;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00025;
            }
            
            if(inGear.getNumberOfTeeth() >= 40 && inGear.getNumberOfTeeth() < 42){
                return .00027;
            }
            
            if(inGear.getNumberOfTeeth() >= 42 && inGear.getNumberOfTeeth() < 45){
                return .00028;
            }
            
            if(inGear.getNumberOfTeeth() >= 45 && inGear.getNumberOfTeeth() < 50){
                return .00030;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00035;
            }
            
            if(inGear.getNumberOfTeeth() >= 55 && inGear.getNumberOfTeeth() < 60){
                return .00039;
            }
            
            if(inGear.getNumberOfTeeth() >= 60){
                return .00043;
            }
            
        }
        
        if(inGear.getPitchDiametric() == 8){
            if(inGear.getNumberOfTeeth() < 42){
                return .00020;
            }
            
            if(inGear.getNumberOfTeeth() >= 42 && inGear.getNumberOfTeeth() < 45){
                return .00021;
            }
            
            if(inGear.getNumberOfTeeth() >= 45 && inGear.getNumberOfTeeth() < 50){
                return .00022;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00026;
            }
            
            if(inGear.getNumberOfTeeth() >= 55 && inGear.getNumberOfTeeth() < 60){
                return .00029;
            }
            
            if(inGear.getNumberOfTeeth() >= 60){
                return .00032;
            }
        }
       
            return .00020;
    }

    public double getOverPinMeasurements() {
        return overPinMeasurements;
    }

    public double getMajorDiameter() {
        return majorDiameter;
    }

    public double getSidesOfTeeth() {
        return sidesOfTeeth;
    }
       
}
