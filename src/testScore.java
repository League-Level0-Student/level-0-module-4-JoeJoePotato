import javax.swing.JOptionPane;
public class testScore {
public static void main(String[] args) {
	String score=JOptionPane.showInputDialog("What is your test score? Make one up between 0 and 100. Decimals are allowed.");
double numScore=Double.parseDouble(score);

if(numScore>100){
JOptionPane.showMessageDialog(null, "No extra credit on this test.");
}else if(numScore<0) {
	JOptionPane.showMessageDialog(null, "This is the police. Please do not resist. We are taking you to a mental asylum.");
}
else if(numScore<49.9) {
JOptionPane.showMessageDialog(null, "oh. That isn't that good a score. Study more next time");
}else if(numScore<69.9) {
	JOptionPane.showMessageDialog(null, "You got so close to passing! Try just a little harder next time.");
}else if(numScore<79.9) {
	JOptionPane.showMessageDialog(null, "You passed, a little more studying might have earned a higher grade.");
}else if(numScore<89.9) {
	JOptionPane.showMessageDialog(null, "Good job! That is a pretty good score.");
}else if(numScore<100.1) {
	JOptionPane.showMessageDialog(null, "You did excellently.");
}


}
}
