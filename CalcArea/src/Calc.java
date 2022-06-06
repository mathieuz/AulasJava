
public class Calc {
	
	double calcarea(double base, double alt) {
		
		if (alt == base) { //Estrutura if compara os valores da altura e da base... Se forem iguais, retorna o cálculo do quadrado.
			return alt * alt;
		}
		
	}
	
	double calcarea(double base, double alt) { //calcula area do triângulo
		return base * alt / 2;
	}
	
	double calcarea(double base, double alt) { //calcula retângulo
		return base * alt;
	}
	
}
