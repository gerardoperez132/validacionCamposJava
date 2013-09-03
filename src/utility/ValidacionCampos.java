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
	*@return <b>"True":</b> Si lo que resibo no se encuentra en el patron de validacion </br> <b>"False":</b> Si lo que resibo Se Encuntre dentro del patron de validacion
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
	*@return <b>"True":</b> Si lo que resibo no se encuentra en el patron de validacion </br> <b>"False":</b> Si lo que resibo Se Encuntre dentro del patron de validacion
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
	
	/**
	* Metodo para validar que el campo solo tenga numeros de digitos del 0 al 9 y guiones
	*
	*@version 1, 29/08/2013
        *@author Gerardo Perez
	*@param String campo a validad
	*@return <b>"True":</b> Si lo que resibo no se encuentra en el patron de validacion </br> <b>"False":</b> Si lo que resibo Se Encuntre dentro del patron de validacion
	*/
	public static boolean getSoloNumerosMasGuion(String campo) {

		Matcher matcher = null;	
		Pattern fullRegex = Pattern.compile("[^0-9\\-]+"); //Patron de validacion solo numeros mas puntos

	    try {
	    	matcher = fullRegex.matcher(campo); //Valido que los datos q recibo esten dentro del patron de validacion
	    } catch (RuntimeException e) {
	        System.out.println("Erro al validar campo");
	    }
		return matcher.find();
	}
	
	/**
	* Metodo para validar que el campo solo tenga numeros de digitos del 0 al 9, letras y guiones
	*
	*@version 1, 29/08/2013
        *@author Gerardo Perez
	*@param String campo a validad
	*@return <b>"True":</b> Si lo que resibo no se encuentra en el patron de validacion </br> <b>"False":</b> Si lo que resibo Se Encuntre dentro del patron de validacion
	*/
	public static boolean getSoloNumerosLetrasMasGuion(String campo) {

		Matcher matcher = null;
		Pattern fullRegex = Pattern.compile("[^A-Za-z0-9\\-]+"); //Patron de validacion solo numeros mas puntos

	    try {
	    	matcher = fullRegex.matcher(campo); //Valido que los datos q recibo esten dentro del patron de validacion
	    } catch (RuntimeException e) {
	        System.out.println("Erro al validar campo");
	    }
		return matcher.find();
	}
	
	/**
	* Metodo para validar que el campo no este vacio
	*
	*@version 1, 29/08/2013
        *@author Gerardo Perez
	*@param String campo a validad
	*@return <b>"True":</b> Si lo que resibo no tiene caracteres </br> <b>"False":</b> Si el campo tiene mas de un caracter
	*/
	public static boolean getCantidadCaracteresCero(String campo) {
		
		boolean b = false;
		if(campo.toString().length() == 0 ){
			b = true;
		}
		
		return b;
	}
	
	/**
	* Metodo generico el cual recive como parametro el campo a validar y el patron de validacion del mismo
	*
	*@version 1, 03/09/2013
    *@author Gerardo Perez
	*@param String campo a validad
	*@param String patron de validacion
	*@return <b>"True":</b> Si lo que resibo no se encuentra en el patron de validacion </br> <b>"False":</b> Si lo que resibo Se Encuntre dentro del patron de validacion
	*/
	public static boolean getPatronGenerico(String campo,String patron) {
		
		Matcher matcher = null;
		Pattern fullRegex = null;
		try {
		    fullRegex = Pattern.compile(patron); //Patron de validacion solo numeros mas puntos
		}
		catch (RuntimeException e) {
	        System.out.println("Erro con el patron de validacion");
	    }
	    try {
	    	matcher = fullRegex.matcher(campo); //Valido que los datos q recibo esten dentro del patron de validacion
	    } catch (RuntimeException e) {
	        System.out.println("Erro al validar campo");
	    }
		return matcher.find();
	}
}
