  import javax.swing.JOptionPane;
public class GUI{
public static void main(String[] args){
System.out.print("this is a GUI project");
String first = JOptionPane.showInputDialog("Please enter your fist name ");
String second = JOptionPane.showInputDialog("enter your last  name ");
int a = Integer.parseInt(JOptionPane.showInputDialog("nice work! Now enter your age"));
JOptionPane.showMessageDialog(null, "neem ka patta kadva hai "+ first+ "  "+second+" sala bhen ka loda " +a+" saal ka gandva hai");
 }
}
