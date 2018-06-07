
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int ww = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		int v = JOptionPane.showConfirmDialog(null, "Are you on vacation", "Sleepy Head", JOptionPane.YES_NO_OPTION);

		if (v == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}

		if (ww == 1) {
			isWeekday = false;
		} else {
			isWeekday = true;
		}

		if (isVacation == true) {
			System.out.println("sleep in");
		} else if (isWeekday == false) {
			System.out.println("sleep in");
		} else {
			System.out.println("Wake up lazybones!");
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
