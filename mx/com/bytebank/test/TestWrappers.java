package mx.com.bytebank.test;

public class TestWrappers {
	public static void main(String[] args) {
		/*Vamos a ver todos los wrappers de los 
		 * primitivos*/
		
		Double numeroDouble = 33.0;//Autoboxing
		Boolean verdadero = true;//Autoboxing
		
		Double numeroDouble2 = Double.valueOf(33);
		System.out.println(numeroDouble2);
		
		//Podemos usar los wrappers para pasar string a: 
		String numeroString = "43";
		
		Double stringToDouble = Double.valueOf(numeroString);
		
		Integer stringToInteger = Integer.valueOf(numeroString);
		
		System.out.println(stringToDouble);
		System.out.println(stringToInteger);
		
		/*Como los wrappers extienden de number 
		 * se puede declarar lo siguiente*/
		
		Number numero = Integer.valueOf(5);
		/*y podemos cambiar rapidamente a otro tipo*/
		double numeroDouble3 = numero.doubleValue();
		
		//Ejemplo con booleano
		Boolean falso = Boolean.FALSE;
		
	}
}
