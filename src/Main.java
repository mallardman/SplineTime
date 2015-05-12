import javax.swing.JFrame;

public class Main {
	
	public static void main(String args[]){

		
		
		//Makes the GUI window
		JFrame guiFrame = new GUI();
		//Makes the GUI visible
		guiFrame.setVisible(true);
		//Closes the program when the window closes
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        }
}
