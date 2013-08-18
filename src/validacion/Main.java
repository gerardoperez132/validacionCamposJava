package validacion;
import utility.ValidacionCampos;

/**
* Clase de prueba
* 
*@version 1, 18/08/2013
*@author Gerardo Perez
*
*/


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Numero = "123456";
		String Numeor2 = "22.11";
		
		if(ValidacionCampos.getSoloNumeros(Numero)){
			System.out.println("True:  Si lo que resibo no se encuentra en el patron de validacion");
		}else{
			System.out.println("False: Si lo que resibo Se Encuntre dentro del patron de validacion");
		}
		
		boolean a = ValidacionCampos.getSoloNumerosMasPunto(Numeor2);
		System.out.println("dos"+a);
	}

}
