
import java.util.Scanner;



public class metodos {
    Scanner sc =new Scanner(System.in);
public objComida[][] LlenarMatriz(int n){
    objComida[][] m = new objComida[n][n];
     for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            objComida o =new objComida();
            System.out.println("ingrese el tipo de comida 1.hamburguesa\n, 2.hot dog\n, 3.papas a la francesa ");
            switch (sc. nextInt()) {
                case 1:
                    o.setTipoComida("hamburguesa");
                    break;
                    case 2:
                    o.setTipoComida("hot dog");
                    break;    
                    case 3:
                    o.setTipoComida("papas a la francesa");
                    break;            
                default:
                System.out.println("lo siento no existe");
                    break;
            }

            System.out.println("ingrese la cantidad");
            o.setCantidad(sc.nextInt());
            System.out.println("1.grande\n, 2.mediano\n 3.pequeño");

            switch (sc.nextInt()) {
                case 1:
                    o.setTamaño("grande");
                    break;
                    case 2:
                    o.setTamaño("mediano");
                    break;    
                    case 3:
                    o.setTamaño("pequeño");
                    break;
                default:
                    break;
            }

            System.out.println("Ingrese el precio");
            o.setValor(sc.nextDouble()*o.getValor());
            m[i][j]=o;
        }
    
     }
    return m;
}   
public void Mostrar_Matriz(objComida[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {

            System.out.println("tipo de comida: " +m[i][j].getTipoComida());
            System.out.println("ingrese cantidad: " +m[i][j].getCantidad());
            System.out.println("tipo de tamaño: " +m[i][j].getTamaño());
            
        }
    }
    
}
}