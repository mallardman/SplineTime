package Gears;


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
public class FlatMajorDiameterGearInternal extends Gear {
    
    public FlatMajorDiameterGearInternal(Gear inGear){
        super(inGear);
        this.runCalculations();
    }
    
    @Override
    protected void calculateFormDiameter(){
      this.formDiameter =
        ((this.numberOfTeeth + .8)/this.pitchDiametric) + 
              2 * this.formClearance - .004;
    }
            
    @Override
    public void setPressureAngle(double pressureAngle) {
            if(pressureAngle > 0 && pressureAngle <= 30){
		this.pressureAngle = pressureAngle % 180;
            }   
	}
    
    //Major Diameter Maximum
    @Override
    protected void calculateMajorDiameter(){
        this.majorDiameter = (this.numberOfTeeth + 1) / this.pitchDiametric;
    }
        
    
    @Override
    protected void calculateMinorDiameter(){
        this.minorDiameter = (this.numberOfTeeth - 1) / this.pitchDiametric;
    }
}
