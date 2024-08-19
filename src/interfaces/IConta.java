
package interfaces;

import classes.Conta;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta destino, double valor);
    void imprimirExtrato();
}
