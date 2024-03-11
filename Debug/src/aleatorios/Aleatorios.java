package aleatorios;
import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero + de uno=>:"));
		int num_aleat[] = new int[elementos];
		for (int i = 0; i <= num_aleat.length; i++) {
			num_aleat[i] = (int)(Math.random() * 100); // Corrección en la multiplicación
		}
		for (int elem : num_aleat) {
			System.out.println(elem);
		}
	}
}