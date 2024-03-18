
import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos=Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero + de uno=>"));
		int num_aleat[]=new int[elementos];
		for (int i=0; i< num_aleat.length;i++) {
			num_aleat[i]=(int) (Math.random()*100);
			// Hay que ponerle paréntesis porque sino 'Math.random()' pasa a 'int'
			// Y eso siempre dará 0 y luego se multiplica por 100 que seguirá dando 0.
		}
		for (int elem: num_aleat) {
			System.out.println(elem);
		}

	}

}