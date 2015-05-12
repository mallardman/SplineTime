/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gages;
import Gears.*;

/**
 *
 * @author marco
 */
public class CompositeRingGOSide extends RingGage {
    
    //Circular Space Width
    protected double CSWNew;
    protected double CSWWorn;
    private double measuringPinData;
    //Measurement Between Pins
    private double MBPToothMaster;
    private double MBPNotMasterNewPlus;
    private double MBPNotMasterNewMinus;
    
    public CompositeRingGOSide(Gear myGear){
        super(myGear);
        this.minorDiameterPlus = myGear.getFormDiameter();
        this.minorDiameterMinus = myGear.getFormDiameter() - 
                tol.getMajorDiameter();
        this.formDiameter = myGear.getMajorDiameter() + 2 * myGear.getTeethGap();
        CSWNew = myGear.getToothThickness() - tol.getToothThickness();
        CSWWorn = myGear.getToothThickness();
        measuringPinData = 1.7280/myGear.getPitchDiametric();
        MBPToothMaster = myGear.getToothThickness();
        this.MBPNotMasterNewPlus = 0.0;
        this.MBPNotMasterNewMinus = this.tol.getBetweenPins();
    }

    public double getCSWNew() {
        return CSWNew;
    }

    public double getCSWWorn() {
        return CSWWorn;
    }

    public double getMeasuringPinData() {
        return measuringPinData;
    }

    public double getMBPToothMaster() {
        return MBPToothMaster;
    }

    public double getMBPNotMasterNewPlus() {
        return MBPNotMasterNewPlus;
    }

    public double getMBPNotMasterNewMinus() {
        return MBPNotMasterNewMinus;
    }
    
    
}
