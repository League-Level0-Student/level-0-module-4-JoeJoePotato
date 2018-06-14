import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {

		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		int happy=0;
		int tv=0;
		int boost=0;
		int giagmx=0;
		int cl = 0;
		int ctlb=0;
		for (int i = 0; i < 5; i++) {
			
		
		int task = JOptionPane.showOptionDialog(null, "What would you like to do to make the cat happy","Goal:make the cat really happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give it a good meal", "clean it", "let it sit on your\n lap while you watch TV","clean the litter box" }, null);
if(task==0) {
giagmx++;
happy=happy+((20/giagmx)+boost);
JOptionPane.showMessageDialog(null, "The cat devours the deliscious meal");
}else if(task==3) {
	ctlb++;
	boost=(boost+5)/ctlb;
	if(ctlb==0) {
	JOptionPane.showMessageDialog(null, "The cat is glad that the litterbox is clean");
	}else {
		JOptionPane.showMessageDialog(null, "You already cleaned the litterbox, but okay.");	
	}
	}else if(task==1) {
		cl=10;
		boost=(boost+10)-cl;
		if(cl==0) {
		JOptionPane.showMessageDialog(null, "The cat is glad that it is clean");
		}else {
			JOptionPane.showMessageDialog(null, "The cat is already clean");	
		}
		} else if(task==2) {
			tv++;
			happy=happy+((15-tv)+boost);
			JOptionPane.showMessageDialog(null, "You and the cat are lazy together");
			}
		
}
		JOptionPane.showMessageDialog(null, "Your score is "+ happy+" points");
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}