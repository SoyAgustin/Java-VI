package mx.com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		/*//Para agrupar estas edades en una sola variable
		int edad = 20;
		int edad2 = 15;
		int edad3 = 67; */
		//La forma completa de iniciar array es:
		int[] edades  = new int[5];
		edades[2] = 30;
		
		System.out.println(edades[2]);
	
		
		//Operaciones y propiedades básicas
		System.out.println("-----------------");
		int tamanoArray = edades.length;
		System.out.println(tamanoArray);
		
		for (int i = 0; i<tamanoArray;i++) {
			System.out.println(edades[i]);
		}
		
		//Veamos como podemos ver cuales son las posiciones ocupadas, no unicamente el unimero total
		
		
		
	}
}
