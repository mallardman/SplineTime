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
public class FlatSideFitGearInternal extends Gear{
    
    public FlatSideFitGearInternal(Gear inGear){
        super(inGear);
        this.runCalculations();
    }
    
    @Override
    protected void calculateFormDiameter(){
      this.formDiameter =
      ((this.numberOfTeeth + 1)/this.pitchDiametric) + 2 * this.formClearance;
    }
    
    @Override
    public void setPressureAngle(double pressureAngle) {
            if(pressureAngle > 0 && pressureAngle <= 30){
		this.pressureAngle = pressureAngle % 180;
            }
            
            else{
                this.pressureAngle = 30;
            }
	}
    
    //Major Diameter Maximum
    @Override
    protected void calculateMajorDiameter(){
        this.majorDiameter = (this.numberOfTeeth + 1.35) / this.pitchDiametric; 
    }
        
    
    @Override
    protected void calculateMinorDiameter(){
        this.minorDiameter = (this.numberOfTeeth - 1) / this.pitchDiametric;
    }
    
}
