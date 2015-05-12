package Gears;


public class Gear{
	//Declarations
	//These should be set in the constructor
	protected int numberOfTeeth;
	protected double majorDiameter;
	protected double pitchDiametric;
	protected double minorDiameter;
        protected double formDiameter;
	protected double toothThickness;
	protected double pressureAngle;
        protected double formClearance;
	protected double helixAngle;
        
	//Methods should be made to find these
	//Done
	protected double baseCircleDiameter;
	//@toDO
	protected double ballDiameter;
	//Done
	protected double teethGap;
	//Circumference of the minor circle;
	protected double pitchCirc;
	//Not done don't know what helix angle is.
	protected double lead;
	//Pitch Diameter
	protected double pitchDiameter;
	
	public Gear(){
		
	}
        
        public Gear(Gear inGear){
            numberOfTeeth = inGear.getNumberOfTeeth();
            pitchDiametric = inGear.getPitchDiametric();
            pressureAngle = inGear.getPressureAngle();
        }
	
	//Start calculation methods 
	protected void calculateBaseDiameter(){
		this.baseCircleDiameter = 
                    this.pitchDiameter * Math.cos(Math.PI * this.pressureAngle / 180.0);		
	}
        
	
	protected void calculatePitchCircumference(){
		this.pitchCirc = this.pitchDiameter * Math.PI; 
	}
        
        protected void calculateFormClearance(){
            double temp = 0;
            
            temp = .2 / this.pitchDiametric + .002;
            if(temp < .002){
                temp = .002;
            }
            
            if(temp > .010){
                temp = .010;
            }
            
            this.formClearance = temp;
        }
	
        //Do this
	protected void calculateTeethGap(){
		this.teethGap = Math.PI/(2 * this.pitchDiametric);
	}
	
	//Don't know what the helix angle is
	protected void calculateLead(){
		this.lead = this.pitchDiameter * Math.PI / Math.tan(this.helixAngle);  
	}
	
	protected void calculatePitchDiameter(){
		this.pitchDiameter = this.numberOfTeeth / this.pitchDiametric;
	}
        
        protected void calculateToothThickness(){
                this.toothThickness = Math.PI / (2 * this.pitchDiametric);
        }
        
        protected void calculateMajorDiameter(){
        }
        
        protected void calculateMinorDiameter(){
        }
        
        protected void calculateFormDiameter(){
        }
        
	public void runCalculations(){
		calculatePitchDiameter();
		calculatePitchCircumference();
                calculateFormDiameter();
		calculateTeethGap();
                calculateMinorDiameter();
                calculateMajorDiameter();
		calculateBaseDiameter();
		calculateLead();
	}
	//End calculation methods
	
	
	//Start setters and getters
	public int getNumberOfTeeth() {
		return numberOfTeeth;
	}

	public void setNumberOfTeeth(int numberOfTeeth) {
            if(numberOfTeeth > 1){
		this.numberOfTeeth = numberOfTeeth;
            }
            
	}

	public double getMajorDiameter() {
		return majorDiameter;
	}

        public void setFormDiameter(double formDiameter) {
            if(formDiameter > 0){
                this.formDiameter = formDiameter;
            }
            
        }
        
        
/*
	public double getFormDiameter() {
		return formDiameter;
	}

	public void setFormDiameter(double formDiameter) {
		this.formDiameter = formDiameter;
	}
*/
	public double getPitchDiameter() {
		return pitchDiameter;
	}

	public double getPitchDiametric() {
		return pitchDiametric;
	}

	public void setPitchDiametric(double pitchDiametric) {
                if(pitchDiametric > 0){
                    this.pitchDiametric = pitchDiametric;
                }
	}

	public double getMinorDiameter() {
		return minorDiameter;
	}

	public double getToothThickness() {
		return toothThickness;
	}

	public void setToothThickness(double toothThickness) {
            if(toothThickness > 0){
		this.toothThickness = toothThickness;
            }
	}

	public double getPressureAngle() {
		return pressureAngle;
	}

	public void setPressureAngle(double pressureAngle) {
            if(pressureAngle > 0){
		this.pressureAngle = pressureAngle % 180;
            }   
	}

	public double getBaseCircleDiameter() {
		return baseCircleDiameter;
	}


	public double getBallDiameter() {
		return ballDiameter;
	}

	public void setBallDiameter(double ballDiameter) {
		this.ballDiameter = ballDiameter;
	}

	public double getHelixAngle() {
		return helixAngle;
	}

	public void setHelixAngle(double helixAngle) {
		this.helixAngle = helixAngle;
	}

	public double getTeethGap() {
		return teethGap;
	}

	public double getPitchCirc() {
		return pitchCirc;
	}

        public double getFormClearance() {
            return formClearance;
        }
      
        public double getFormDiameter() {
            return formDiameter;
         }
        
        
        //End Setters and getters

        public double getLead() {
            return lead;
        }
        
        
	
}