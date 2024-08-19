package classes;


import interfaces.IConta;


public abstract class Conta implements IConta{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo = 0;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println("Depositado R$"+valor+ " na conta: " + this.numero);
        System.out.println("-=-=-=-=-=-=-=-=-");
    }
    @Override
    public void sacar(double valor) {
        if(saldo <= 0){
            System.out.println("-=-=-=-=-=-=-=-=-");
            System.out.println("Saldo insuficiente!");
            System.out.println("-=-=-=-=-=-=-=-=-");
        }else{
            this.saldo -= valor;
            System.out.println("-=-=-=-=-=-=-=-=-");
            System.out.println("Sacando R$" + valor + " na conta: " + this.numero);
            System.out.println("-=-=-=-=-=-=-=-=-");
        }
    }
    @Override
    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println("Extrato Conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("-=-=-=-=-=-=-=-=-");
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public double getSaldo() {
        return saldo;
    }

    
}
