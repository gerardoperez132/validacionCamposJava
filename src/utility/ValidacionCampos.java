package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Clase generica para la validacion de los campos segun el caso
* 
*@version 1, 18/08/2013
*@author Gerardo Perez
*
*/

public class ValidacionCampos {
	/**
	* Metodo para validar que el campo solo tenga numeros de digitos del 0 al 9
	*
	*@version 1, 18/08/2013
    *@author Gerardo Perez
	*@param String campo a validad
	*@return "True": Si lo que resibo no se encuentra en el patron de validacion "False": Si lo que resibo Se Encuntre dentro del patron de validacion
	*/
	public static boolean getSoloNumeros(String campo) {

		Matcher matcher = null;	
		Pattern fullRegex = Pattern.compile("[^0-9]+"); //Patron de validacion solo numeros
		
	    try {
	    	matcher = fullRegex.matcher(campo); //Valido que los datos q recibo esten dentro del patron de validacion
	    } catch (RuntimeException e) {
	        System.out.println("Erro al validar campo");
	    }
		return matcher.find();
	}
	
	/**
	* Metodo para validar que el campo solo tenga numeros de digitos del 0 al 9 y puntos
	*
	*@version 1, 18/08/2013
    *@author Gerardo Perez
	*@param String campo a validad
	*@return "True": Si lo que resibo no se encuentra en el patron de validacion "False": Si lo que resibo Se Encuntre dentro del patron de validacion
	*/
	public static boolean getSoloNumerosMasPunto(String campo) {

		Matcher matcher = null;	
		Pattern fullRegex = Pattern.compile("[^0-9\\.]+"); //Patron de validacion solo numeros mas puntos
		
	    try {
	    	matcher = fullRegex.matcher(campo); //Valido que los datos q recibo esten dentro del patron de validacion
	    } catch (RuntimeException e) {
	        System.out.println("Erro al validar campo");
	    }
		return matcher.find();
	}
	
}
