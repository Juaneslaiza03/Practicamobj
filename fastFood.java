
import javax.swing.JOptionPane;

public class fastFood {

    public static void main(String[] args) {
        int n=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Imgrese la dimension de la matriz"));
        metodos m =new metodos();
        objComida[][]M= m.LlenarMatriz(n);
        m.Mostrar_Matriz(M);
    }
    
}
