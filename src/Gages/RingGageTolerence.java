/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gages;
import Gears.*;

public class RingGageTolerence extends GageTolerence{
    private double sidesOfTeeth;
    private double majorDiameter;
    private double betweenPins;
    
    public RingGageTolerence(Gear gearIn){
        super(gearIn);
        calculateMajorDiameter(gearIn);
        betweenPins = calculateBetweenPins(gearIn);
    }
    
    @Override
    protected void calculateMajorDiameter(Gear inGear) {
        if(inGear.getMinorDiameter() <= 6.00){
            this.majorDiameter = .0005 ;
            sidesOfTeeth = .0005;
        }
        
        else{
            this.majorDiameter = .0010;
            sidesOfTeeth = .0005;
        }
    }
    
    private double calculateBetweenPins(Gear inGear){
        if(inGear.getNumberOfTeeth() < 10){
            return .00068;
        }
        
        if(inGear.getNumberOfTeeth() < 12 && inGear.getNumberOfTeeth() >= 10){
            return .00028;
        }
        
        if(inGear.getNumberOfTeeth() < 14 && inGear.getNumberOfTeeth() >= 12){
            return .00024;
        }
        
        if(inGear.getNumberOfTeeth() < 16 && inGear.getNumberOfTeeth() >= 14){
            return .00022;
        }
        
        if(inGear.getNumberOfTeeth() < 18 && inGear.getNumberOfTeeth() >= 16){
            return .00021;
        }
        
        if(inGear.getNumberOfTeeth() < 22 && inGear.getNumberOfTeeth() >= 18){
            return .00020;
        }
        
        if(inGear.getPitchDiametric() <= 5){
            
            if(inGear.getNumberOfTeeth() >= 22 && inGear.getNumberOfTeeth() < 24){
                return .00022;
            }
            
            if(inGear.getNumberOfTeeth() >= 24 && inGear.getNumberOfTeeth() < 26){
                return .00023;
            }
            
            if(inGear.getNumberOfTeeth() >= 26 && inGear.getNumberOfTeeth() < 28){
                return .00025;
            }
            
            if(inGear.getNumberOfTeeth() >= 28 && inGear.getNumberOfTeeth() < 30){
                return .00027;
            }
            
            if(inGear.getNumberOfTeeth() >= 30 && inGear.getNumberOfTeeth() < 32){
                return .00028;
            }
            
            if(inGear.getNumberOfTeeth() >= 32 && inGear.getNumberOfTeeth() < 34){
                return .00030;
            }
            
            if(inGear.getNumberOfTeeth() >= 34 && inGear.getNumberOfTeeth() < 36){
                return .00032;
            }
            
            if(inGear.getNumberOfTeeth() >= 36 && inGear.getNumberOfTeeth() < 38){
                return .00033;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00035;
            }
            
            if(inGear.getNumberOfTeeth() >= 40){
                return .00037;
            }
            
        }
        
        if(inGear.getPitchDiametric() == 6){
            if(inGear.getNumberOfTeeth() >= 22 && inGear.getNumberOfTeeth() < 26){
                return .00020;
            }
            
            if(inGear.getNumberOfTeeth() >= 26 && inGear.getNumberOfTeeth() < 28){
                return .00021;
            }
            
            if(inGear.getNumberOfTeeth() >= 28 && inGear.getNumberOfTeeth() < 30){
                return .00023;
            }
            
            if(inGear.getNumberOfTeeth() >= 30 && inGear.getNumberOfTeeth() < 32){
                return .00024;
            }
            
            if(inGear.getNumberOfTeeth() >= 32 && inGear.getNumberOfTeeth() < 34){
                return .00025;
            }
            
            if(inGear.getNumberOfTeeth() >= 34 && inGear.getNumberOfTeeth() < 36){
                return .00026;
            }
            
            if(inGear.getNumberOfTeeth() >= 36 && inGear.getNumberOfTeeth() < 38){
                return .00028;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00030;
            }
            
            if(inGear.getNumberOfTeeth() >= 40 && inGear.getNumberOfTeeth() < 42){
                return .00031;
            }
            
            if(inGear.getNumberOfTeeth() >= 42 && inGear.getNumberOfTeeth() < 50){
                return .00033;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00037;
            }
            
            if(inGear.getNumberOfTeeth() >= 55){
                return .00040;
            }
            
        }
        
        if(inGear.getPitchDiametric() == 8){
            if(inGear.getNumberOfTeeth() >= 22 && inGear.getNumberOfTeeth() < 36){
                return .00020;
            }
            
            if(inGear.getNumberOfTeeth() >= 36 && inGear.getNumberOfTeeth() < 38){
                return .00021;
            }
            
            if(inGear.getNumberOfTeeth() >= 38 && inGear.getNumberOfTeeth() < 40){
                return .00022;
            }
            
            if(inGear.getNumberOfTeeth() >= 40 && inGear.getNumberOfTeeth() < 45){
                return .00024;
            }
            
            if(inGear.getNumberOfTeeth() >= 45 && inGear.getNumberOfTeeth() < 50){
                return .00026;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00029;
            }
            
            if(inGear.getNumberOfTeeth() >= 55 && inGear.getNumberOfTeeth() < 60){
                return .00031;
            }
            
            if(inGear.getNumberOfTeeth() >= 60){
                return .00035;
            }
        }
        
        if(inGear.getPitchDiametric() == 10){
            if(inGear.getNumberOfTeeth() >= 22 && inGear.getNumberOfTeeth() < 50){
                return .00020;
            }
            
            if(inGear.getNumberOfTeeth() >= 50 && inGear.getNumberOfTeeth() < 55){
                return .00024;
            }
            
            if(inGear.getNumberOfTeeth() >= 55 && inGear.getNumberOfTeeth() < 60){
                return .00028;
            }
            
            if(inGear.getNumberOfTeeth() >= 60){
                return .00032;
            }
        }
        
        return .00020;
    }

    public double getSidesOfTeeth() {
        return sidesOfTeeth;
    }

    public double getMajorDiameter() {
        return majorDiameter;
    }

    public double getBetweenPins() {
        return betweenPins;
    }
    
    
     
}
