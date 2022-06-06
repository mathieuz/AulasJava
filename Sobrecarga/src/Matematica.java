
public class Matematica {
	
	int somar(int x, int y) { //Sobrecarga de métodos diz respeito a criar vários objetos diferentes com o mesmo nome identificador, o que irá diferenciar 
		return x + y;		  //um de outro será os parâmetros e os retornos/comandos de cada método.	
	}
	
	int somar(int x, int y, int z) {
		return x + y + z;
	}
	
	double somar(double x, double y) {
		return x + y;
	}
}
