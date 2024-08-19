package classes;
public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new ContaCorrente(new Cliente("Pedro"));
        Conta conta2 = new ContaCorrente(new Cliente("João"));

        conta.depositar(240);
        conta.transferir(conta2, 200);
        conta.imprimirExtrato(); 
        conta2.imprimirExtrato();
        conta2.sacar(120);
        conta2.transferir(conta, 60);
        conta.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
