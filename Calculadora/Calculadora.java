package calculadora;

class Calculadora {
    int a;
    int b;

    public void Soma(){
        int soma = a + b;
        
        System.out.println("A soma foi " + soma);
    }

    public int Multiplicacao(){
        int multiplicacao = a * b;

        return multiplicacao;

    }
    
    public void Subtracao(int x, int y) {
    	int subtracao = x - y;
    	System.out.println("A subtração foi " + subtracao);
    }
    
    public int Divisao(int z, int w) {
    	int divisao = z / w;
    	return divisao;
    }

}
