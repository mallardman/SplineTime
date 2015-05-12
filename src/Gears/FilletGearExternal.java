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
public class FilletGearExternal extends Gear{
    
    public FilletGearExternal(Gear inGear){
        super(inGear);
        this.runCalculations();
        
    }
    
    @Override
    protected void calculateFormDiameter(){
        if(this.pressureAngle <= 30 && this.pressureAngle > 0){
            this.formDiameter =
                ((this.numberOfTeeth - 1)/this.pitchDiametric) 
                    - 2 * this.formClearance;
        }
        
        if(this.pressureAngle <= 37.5 && this.pressureAngle > 30){
            this.formDiameter =
                ((this.numberOfTeeth - .8)/this.pitchDiametric) 
                    - 2 * this.formClearance;
        }
        
        if(this.pressureAngle <= 45 && this.pressureAngle > 37.5){
            this.formDiameter =
                ((this.numberOfTeeth - .6)/this.pitchDiametric) 
                    - 2 * this.formClearance;
        }
    
    }
    
    @Override
    public void setPressureAngle(double pressureAngle) {
            if(pressureAngle > 0 && pressureAngle <= 45){
		this.pressureAngle = pressureAngle % 180;
            }   
	}
    
    @Override
    protected void calculateMajorDiameter(){
        this.majorDiameter = (this.numberOfTeeth + 1) / this.pitchDiametric;
    }
    //Minor Diameter Minimum
    @Override
    protected void calculateMinorDiameter(){
        if(pressureAngle > 0 && pressureAngle <= 30){
            if(this.pitchDiametric >= 2.5 && this.pitchDiametric <= 12){
                this.minorDiameter = (this.numberOfTeeth - 1.8) / this.pitchDiametric;
            }
  
            else{
                this.minorDiameter = (this.numberOfTeeth - 2) / this.pitchDiametric;
            }
            
        }
        
        if(pressureAngle > 30 && pressureAngle <= 37.5){
            this.minorDiameter = (this.numberOfTeeth - 1.3) / this.pitchDiametric;
        }
        
        if(pressureAngle > 37.5 && pressureAngle <= 45 && pitchDiametric >= 10){
            this.minorDiameter = (this.numberOfTeeth - 1) / this.pitchDiametric;
        }
        
    }
    
    
}
