package Gears;


import Gears.Gear;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco test
 */
public class FilletGearInternal extends Gear{
    
    public FilletGearInternal(Gear inGear){
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
            if(pressureAngle > 0 && pressureAngle <= 45){
		this.pressureAngle = pressureAngle % 180;
            }   
	}
    
    //Major Diameter Maximum
    @Override
    protected void calculateMajorDiameter(){
        if(pressureAngle > 0 && pressureAngle <= 30){
            this.majorDiameter = (this.numberOfTeeth + 1.8) / this.pitchDiametric;
        }
        
        if(pressureAngle > 30 && pressureAngle <= 37.5){
            this.majorDiameter = (this.numberOfTeeth + 1.6) / this.pitchDiametric;
        }
        
        if(pressureAngle > 37.5 && pressureAngle <= 45){
            this.majorDiameter = (this.numberOfTeeth + 1.4) / this.pitchDiametric;
        }
    }
        
    @Override
    protected void calculateMinorDiameter(){
        if(pressureAngle > 0 && pressureAngle <= 30){
            this.minorDiameter = (this.numberOfTeeth - 1) / this.pitchDiametric;
        }
        
        if(pressureAngle >30 && pressureAngle <= 37.5){
            this.minorDiameter = (this.numberOfTeeth - .8) / this.pitchDiametric;
        }
        
        if(pressureAngle > 37.5 && pressureAngle <= 45){
            this.minorDiameter = (this.numberOfTeeth - .6) / this.pitchDiametric;
        }
    }
    
    
}
