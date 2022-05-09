import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor total:");
		int valorTotal = ler.nextInt();
		ArrayList<Integer> valores = new ArrayList<>();
		boolean continuarInformando = true;
		while (continuarInformando) {
			System.out.println("Insira um valor;");
			int Valor = ler.nextInt();
			valores.add(Valor);
			int resposta;
			System.out.println("Quer adicionar mais um valor?(1 para sim/ 2 para não)");
			resposta = ler.nextInt();
			if (resposta == 2) {
				continuarInformando = false;

			}
		}
		Collections.sort(valores, Collections.reverseOrder());
		//int resultado = valores[0];
		int somaAtual = 0;
		ArrayList<Integer> numerosUsados = new ArrayList<>();
		for(var numero : valores) {
			while(somaAtual + numero <= valorTotal) {
				somaAtual = somaAtual + numero;
				numerosUsados.add(numero);;
			}
			
		}
		System.out.println(numerosUsados.toString());
	}
	
}
