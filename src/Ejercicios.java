import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//Trabaje con Maynor, Kevin, Alex, Maverick

public class Ejercicios {
	
	//Devuelve true si todos los elementos de 'mi_lista' son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		//se crea una variable que se ira sumando cada vez que se cumpla una condicion
		int pares = 0;
		//es ciclo for recorre todos los elementos
		for(int i=0;i<mi_lista.size();i++)
		{
			//esta condicion evalua si el elemento tiene residuo 0
			if(mi_lista.get(i)%2==0)
//				si se cumple par suma 1
				pares++;
			// si par es igual a lo que tenga mi lista entonces devuelve true
		if(pares==mi_lista.size())
			return true;
		}
		//si no se cumple nada devuelve false
		return false;
	}

	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		// creo una variable
					int menor = 9999999;
		{
			// el ciclo for se encarga de recorrer todo el archivo 
			for (int i = 0; i < mi_lista.size(); i++)
			{
				//esta condicion compara lo que tenga el elemento en el array con la variable menor
				if(mi_lista.get(i) < menor)
				// si se cumple entonces menor tomara el valor del elemento
					menor = mi_lista.get(i);
			}
		}
		//devolvemos menor
		return menor;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMayor(String nombre_archivo)
	{
		//Creamos nuestra variable con un margen alto de numero
		int mayor = -999999;
		//Ponemos try para poder escribir en el archivo
		try
		{
		//Creamos el archivo y le asignamos el valor de nuestra variable
		File archivo = new File(nombre_archivo);
		Scanner s = new Scanner (archivo);
		//el while se encarga de enontrar cada elemento del array
		while(s.hasNext())
		{
			int num = s.nextInt();
		//Evaluamos si el numero ingresado es mayor a num
			if (num > mayor)
		//si se cumple entonces num tomara lo que tenga valor
				mayor=num;
		}
		//Se captura cualquier error
		}catch (Exception e)
			{
				e.printStackTrace();
			}
		//devolvemos el mayor
			return mayor;
								
		}

	//Devuelve cuantas veces existe la string buscada en el archivo con nombre nombre_archivo
	static int cuantasVecesExiste(String nombre_archivo, String buscada)
	{
		{
			//existe servira para ir sumando en caso de que se cumpla una condicion
			int existe=0;
			//b tomara el valor de existe en determinado punto
			int f=0;
			try
			{
				//Se inicializa el archivo
				File archivo = new File(nombre_archivo);
				Scanner s = new Scanner (archivo);
				//el while recorre todo el archivo
				while(s.hasNext())
				{	
					//se crea una variable String que tomara como valor cada elemento
					String resultado = s.next();
					//se crea una condicion que compara lo que tiene resultado
					if (resultado.equals(buscada))
					{
						//si se cumple la condicion entonces se sema 1 a la variable existe
						existe++;
					}
				}
				//f en este punto tomara el valor de existe
				f=existe;
				//se captura cualquier error
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			//se devuelve f
			return f;
			}
		}
	}