import javax.swing.JOptionPane;

public class adventure {

	public static void main(String[] args) {

		int task01 = JOptionPane.showOptionDialog(null,
				"You are part of the army for the kingdom of Arda. \n One fine summer day you are requested to go on a scouting mission.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go on the southern patrol",
						"Fake a minor illness to \n get out of scouting duty" },
				null);
		if (task01 == 0) {
			southOne();
		
		} else {
			stayOne();
		}
	}

	public static void southOne() {
		int spy = JOptionPane.showOptionDialog(null,
				"You, along with a group of 25 other soldiers leave the castle. \n your group journeys south, to make sure the goblins are staying in the southern forests. \n Your group makes camp at an old outpost on the border. \n One day you are offered the chance to go a little ways into tyhe forest to spy on the goblins.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Accept the offer", "decline the offer" }, null);
		if (spy == 0) {
			accept();
		} else {
			decline();
		}
	}

	public static void northOne() {

		int troll = JOptionPane.showOptionDialog(null,
				"Your group leaves for the noth of Arda to check the northern moutains for trolls \n the 25 other men in your group whisper rumors about the trolls \n Your group had just set up camp at the base of mount Mandos  \n when a large blue troll whith tusks like a boar lumbers in.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Run away!", "fight back!", "hide!" }, null);
		if (troll == 0) {

		} else if (troll == 1) {

		} else {

		}
	}

	public static void stayOne() {

		int alert = JOptionPane.showOptionDialog(null,
				"You fake a cold and get to stay at the castle \n a few weeks later the scouting party returns, warning of imminent invasion",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "secrectly flee to the countryside", "prepare for the siege" }, null);
		if (alert == 0) {
			countryside();
		} else {
			siege();
		}
	}

	public static void accept() {
		int spying = JOptionPane.showOptionDialog(null,
				"You and 4 others soldieers go into the goblin forest to spy. \nFrom behind a clump of rocks you \n see massive legions preparing for war\n you think one of the goblin captains sees you.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "move to a better hiding place", "flee" }, null);
		if (spying == 0) {
			JOptionPane.showMessageDialog(null,
					"You move to a \ndifferent hiding place, and the legions pass \nby. You rush back to the castle. \nThanks too your early warning the goblin \nlegions are successfully ambushed and \ndestroyed. You are a hero. Congradulations. \nTHE END");
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null,
					"You flee. Suddenly, you feel a sharp pain in your \nshoulder, then another in your left leg, \nand finally, the back of your head. The last thing you \nhear is the triumphant cackle of a goblin archer. \nTHE END");
			System.exit(0);
		}
	}

	public static void decline() {
		int outpost = JOptionPane.showOptionDialog(null,
				"You relax for a few \ndays, but the spy mission doesn't come back. \nThe goblins must be quite active, and ready for war",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "secretly flee", "get ready for battle" }, null);
		if (outpost == 0) {
			countryside();
		} else {
			JOptionPane.showMessageDialog(null,
					"Your small force is no match \nfor the goblin hordes, but you thin the legions,\n and die a hero.\n THE END");
			System.exit(0);
		}
	}

	public static void countryside() {
		int country = JOptionPane.showOptionDialog(null,
				"You flee to the countryside, \nto wait out the fighting. \nAfter a few months pass, Arda is victorious and \nthe monsters are driven back.",
				"Stage 1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "return to the castle", "stay" },
				null);
		if (country == 0) {
			JOptionPane.showMessageDialog(null,
					"You live happily for a few months, \nbut you are aressted for desertion after being \nrecognized by a member off your squad. Shame on you. \nTHE END");
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null,
					"You aren't thrilled \nabout the hermit life \nbut its better than the army. \nYou live out your days in peace.\nTHE END");
			System.exit(0);
		}
	}

	public static void siege() {
		int descision = JOptionPane.showOptionDialog(null,
				"You prepare for the incoming invasion. Goblins attack the east gate first, \nand it is suffering heavy damage. You are assingred to the \nwest gate, but the east gate is about to fall.",
				"Stage 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "go to the east gate", "stay at your post" },
				null);
	if (descision==0) {
		JOptionPane.showMessageDialog(null, "You help out \nat the east gate, but a \nsuprise attack was launced on the \nwest gate, which fell. The battle is still won, \nbut your choice led to the deaths of many. \nTHE END");
		System.exit(0);
	}else {
		JOptionPane.showMessageDialog(null, "You stay at \nyour post. The east gate holds \nand when goblins launch a suprise \nattack on your post you hold them off. \nThe battle is won. You are a hero. \nTHE END");
		System.exit(0);
	}
	}
}
