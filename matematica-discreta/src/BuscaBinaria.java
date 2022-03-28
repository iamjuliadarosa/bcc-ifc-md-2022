// Codigo original Prof. Juliano T. Brignoli alterado por Julia da Rosa
// Matemática Discreta
// Ciência da Computação - IFC - Rio do Sul

public class BuscaBinaria {
		private int[] vet;
		private int arg;
		
		public boolean pesq_reg(int vet[], int arg){
			this.vet = vet;
			this.arg = arg;
			return pesq_bin(0, vet.length -1);
		}

		public boolean pesq_bin(int i, int j){
			if(i==j){
				if(vet[i]==arg)
					return true;
				else
					return false;
			}else
				return pesq_bin(i,(i+j)/2)||pesq_bin((i+j)/2+1,j);
		}
		public int soma_recursiva(int[] vet, int i, int j) {
			if(i==j){
				return vet[i];
			}else {
				return soma_recursiva(vet,i,(i+j)/2)+soma_recursiva(vet,(i+j)/2+1,j);
			}
		}
		public int multiplica(int[] vet, int i, int j) {
			return soma_recursiva(vet,i,(i+j)/2)*soma_recursiva(vet,(i+j)/2+1,j);
		}
	}