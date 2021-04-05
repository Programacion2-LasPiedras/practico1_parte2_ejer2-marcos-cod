import java.util.*;

public class Programa {
	
	void iniciar(){
		
		int valor=generarAleatorio();
		int num;
		int resul;
		
		do{
			num=pedirNumero();
			resul=compararNumeros(num, valor);
			System.out.println(resul);
			
		}while(resul!=0);
		System.out.println("Felicitaciones acertaste!!");
	}
	
	public int generarAleatorio(){
	int entero = Math.floor(Math.random()*99 + 1);
	return entero;
}

// Donde A sea el generado y el B el del usuario
public string compararNumero(int a, int b){
	comparacion = a - b;
	if (comparacion != 0){
		resultado = "Has adivinado";
		return resultado;
	}else{
		resultado = "No has adivinado";
		return resultado;
	}
}

Scanner teclado=new Scanner(System.in);
int aleatorio = generarAleatorio();
System.out.println("ingrese un numero");
int input = teclado.nextInt();


String resultado = compararNumero(aleatorio, input);
system.out.println(resultado);
	
}


}