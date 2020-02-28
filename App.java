class App {
    public static void main(String[] args){
        //Instãncia de classe em java
        Cliente cliente = new Cliente();
        
        cliente.nomeCompleto = "Teste";
        cliente.Cpf = 9999999;
        cliente.Rg = 503001002;
        cliente.Endereco = "Av. Lins de Vasconcelos, 1222";

        ContaCorrente conta = new ContaCorrente();

        conta.Agencia =  1234;
        conta.Numero = 123456;
        conta.Saldo = 1234500.55;
        conta.Cliente = cliente;


        System.out.println(conta.Cliente.nomeCompleto);
    }
}