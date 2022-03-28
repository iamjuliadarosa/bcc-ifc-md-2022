
public class Main {
	public static void main(String args[]){
		BuscaBinaria pesq = new BuscaBinaria();

		int[] vet = {0,1,7,3,4,5,6,4,8,9,1};

		System.out.println("Objeto localizado no vetor: "+pesq.pesq_reg(vet,7));
		System.out.println("Soma de todos os elementos do vetor: "+pesq.soma_recursiva(vet,0,10));
		System.out.println("Produto entre a soma dos elementos dentro do segmento 1 e segmento 2: "+pesq.multiplica(vet,0,10));
	}
}
