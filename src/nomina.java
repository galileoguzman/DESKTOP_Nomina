/**
 * @(#)nomina.java
 *
 * nomina application
 *
 * @author: galileo guzman ibañez 
 * @version 1.00 2009/9/17
 */
 import javax.swing.JOptionPane;
public class nomina {
    
    public static void main(String[] args) 
    	{
    		//a pedir datos
    	String horas;	// primera cadena introducida por el usuario
		String horas_falta;	// segunda cadena introducida por el usuario
		
		//datos convertidos
		int n1;			
		int n2;			
		int neto;
		
		//codigo de pedir las horas totales
		horas=JOptionPane.showInputDialog("total de horas:");
        //codigo para pedir las horas que falto el trabajador
        horas_falta=JOptionPane.showInputDialog("cuantas horas faltaste ???:");
        
        //convertir cadena a numero
        n1=Integer.parseInt(horas);
		n2=Integer.parseInt(horas_falta);
        
        //formula para sacar el pago
        neto=(n1-n2)*80;
        //resultados
        JOptionPane.showMessageDialog( null, neto, "total a pagar:",JOptionPane.INFORMATION_MESSAGE );
		
		System.exit( 0 );  // terminar la aplicación

        
        }
}
