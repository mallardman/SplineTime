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
public class GageTolerence {
    //Table 70 for both
    protected double spaceWidth;
    protected double toothThickness;
    //Table 74
    //Also works with alt a
    protected double GOSpaceWidthStandA;
    protected double GOSPaceWidthAltB = .0002;
    protected double majorDiameterCheckingSurf = .0002; 
    
    public GageTolerence(Gear inGear){
        runCalculationsMainTol(inGear);
    }
    
    protected void calculateMajorDiameter(Gear inGear){}
    
    protected double calculateOverPinMeasurements(Gear inGear){
        return 0;
    }
    
    protected void runCalculationsMainTol(Gear inGear){
        spaceWidth = calculateSpaceWidth(inGear);
        calculateWearAllowances(inGear);
        toothThickness = spaceWidth;
    }
    
    private void calculateWearAllowances(Gear inGear){
        if(inGear.getPitchDiametric() <= 20){
            GOSpaceWidthStandA = .0003;
        }
        
        else{
            this.GOSpaceWidthStandA = .0002; 
        }
    }
    
    private double calculateSpaceWidth(Gear inGear){
        
        if(inGear.getPitchDiametric() >= 12){
            if(inGear.getNumberOfTeeth() < 50){
                return .00010;
            }
            
            if(inGear.getNumberOfTeeth() > 50 && inGear.getNumberOfTeeth() < 55){
                return .00011;
            }
            
            if(inGear.getNumberOfTeeth() > 55 && inGear.getNumberOfTeeth() < 60){
                return .00012;
            }
            
            if(inGear.getNumberOfTeeth() >= 60){
                return .00013;
            } 
        }
        
        if(inGear.getPitchDiametric() <= 5 ){
            if(inGear.getNumberOfTeeth() < 22){
                return .00010;
            }
            
            if(inGear.getNumberOfTeeth() >= 22 && inGear.getNumberOfTeeth() < 24){
                return .00011;
            }
            
            if(inGear.getNumberOfTeeth() >= 24 && inGear.getNumberOfTeeth() < 26){
                return .00012;
            }
            
            if(inGear.getNumberOfTeeth() >= 26 && inGear.getNumberOfTeeth() < 28){
                return .00013;
            }
            
            if(inGear.getNumberOfTeeth() >= 28 && inGear.getNumberOfTeeth() < 30){
                return .00014;
            }
            
            if(inGear.getNumberOfTeeth() >= 30 && inGear.getNumberOfTeeth() < 32){
                return .00015;
            }
            
            if(inGear.getNumberOfTeeth() >= 32 && inGear.getNumberOfTeeth() < 34){
                return .00016;
            }
            
            if(inGear.getNumberOfTeeth() >= 34 && inGear.getNumberOfTeeth() < 36){
                return .00017;
            }
            
            if(inGear.getNumberOfTeeth() >= 36 && inGear.getNumberOfTeeth() < 38){
                return .00018;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00019;
            }
            
            if(inGear.getNumberOfTeeth() >= 40){
                return .00020;
            }
           
        }
        
        if(inGear.getPitchDiametric() == 6){
            if(inGear.getNumberOfTeeth() < 26){
                return .00010;
            }
            
            if(inGear.getNumberOfTeeth() >= 26 && inGear.getNumberOfTeeth() < 28){
                return .00011;
            }
            
            if(inGear.getNumberOfTeeth() >= 28 && inGear.getNumberOfTeeth() < 30){
                return .00012;
            }
            
            if(inGear.getNumberOfTeeth() >= 30 && inGear.getNumberOfTeeth() < 32){
                return .00013;
            }
            
            if(inGear.getNumberOfTeeth() >= 32 && inGear.getNumberOfTeeth() < 34){
                return .00013;
            }
            
            if(inGear.getNumberOfTeeth() >= 34 && inGear.getNumberOfTeeth() < 36){
                return .00014;
            }
            
            if(inGear.getNumberOfTeeth() >= 36 && inGear.getNumberOfTeeth() < 38){
                return .00015;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00016;
            }
            
            if(inGear.getNumberOfTeeth() >= 40 && inGear.getNumberOfTeeth() < 42){
                return .00017;
            }
            
            if(inGear.getNumberOfTeeth() >= 42 && inGear.getNumberOfTeeth() < 45){
                return .00018;
            }
            
            if(inGear.getNumberOfTeeth() >= 45 && inGear.getNumberOfTeeth() < 50){
                return .00019;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00021;
            }
            
            if(inGear.getNumberOfTeeth() >= 55 && inGear.getNumberOfTeeth() < 60){
                return .00023;
            }
            
            if(inGear.getNumberOfTeeth() > 60){
                return .00025;
            }
        }
        
        if(inGear.getPitchDiametric() == 8){
            if(inGear.getNumberOfTeeth() < 34){
                return .00010;
            }
            
            if(inGear.getNumberOfTeeth() >= 34 && inGear.getNumberOfTeeth() < 38){
                return .00011;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00012;
            }
            
            if(inGear.getNumberOfTeeth() >= 40 && inGear.getNumberOfTeeth() < 45){
                return .00013;
            }
            
            if(inGear.getNumberOfTeeth() >= 45 && inGear.getNumberOfTeeth() < 50){
                return .00014;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00016;
            }
            
            if(inGear.getNumberOfTeeth() >= 55 && inGear.getNumberOfTeeth() < 60){
                return .00018;
            }
            
            if(inGear.getNumberOfTeeth() >= 60){
                return .00020;
            }
            
        }
        
        if(inGear.getPitchDiametric() == 10){
            if(inGear.getNumberOfTeeth() < 42){
                return .00010;
            }
            
            if(inGear.getNumberOfTeeth() >= 42 && inGear.getNumberOfTeeth() < 50){
                return .00011;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00013;
            }
            
            if(inGear.getNumberOfTeeth() >= 55 && inGear.getNumberOfTeeth() < 60){
                return .00015;
            }
            
            if(inGear.getNumberOfTeeth() >= 60){
                return .00017;
            }
        }
        
        return -1.00;
        
    }

    public double getSpaceWidth() {
        return spaceWidth;
    }

    public double getToothThickness() {
        return toothThickness;
    }

    public double getGOSpaceWidthStandA() {
        return GOSpaceWidthStandA;
    }

    public double getGOSPaceWidthAltB() {
        return GOSPaceWidthAltB;
    }

    public double getMajorDiameterCheckingSurf() {
        return majorDiameterCheckingSurf;
    }
    
    
    
    
}
