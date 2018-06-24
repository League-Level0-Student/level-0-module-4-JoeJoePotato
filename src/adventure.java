import javax.swing.JOptionPane;

public class adventure {

	public static void main(String[] args) {

		int task01 = JOptionPane.showOptionDialog(null,
				"You are part of the army for the kingdom of Arda. \n One fine summer day you are requested to go on a scouting mission. \n You could choose between patrolling the northern or southern border.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go on the southern patrol",
						"Go on the northern parol", "Fake a minor illness to \n get out of scouting duty" },
				null);
		if (task01 == 0) {
			southOne();
		} else if (task01 == 1) {
			northOne();
		} else {
			stayOne();
		}
	}

	public static void southOne() {
		int spy = JOptionPane.showOptionDialog(null,
				"You, along with a group of 25 other soldiers leave the castle. \n your group journeys south, to make sure the goblins are staying in the southern forests. \n Your group makes camp at an old outpoost on the border. \n One day you are offered the chance to go a little ways into tyhe forest to spy on the goblins.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Accept the offer", "decline the offer" }, null);
		if (spy == 0) {
		
		} else {
		
		}
	}

	public static void northOne() {

		int troll = JOptionPane.showOptionDialog(null,
				"Your group leaves for the noth of Arda to check the northern moutains for trolls \n the 25 other men in your group whisper rumors about the trolls \n Your group had just set up camp at the base of mount Mandos  \n when a large blue troll whith tusks like a boar lumbers in.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Run away!",
						"fight back!", "hide!" },null);
		if (troll==0) {
			
		}else if(troll==1) {
			
		}else {
			
		}
	}

	public static void stayOne() {

		int alert = JOptionPane.showOptionDialog(null,
				"You fake a cold and get to stay at the castle \n a few weeks later both scouting parties return, warning of imminent invasion",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"secrectly flee to the countryside", "prepare for the siege" },
				null);
		if (alert==0) {
			
		}else {
			
		}
	}

}
