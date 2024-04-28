public class ContaBancaria {
    private double saldo;
    
    ContaBancaria(double saldoInicial){
        saldo = saldoInicial;
    }

    public void depositar(double valor){
        if (valor >= 0)
            saldo += valor;
    }

    public void sacar(double valor){
        if(valor > saldo)
            throw new SaldoInsuficienteException("Saldo insuficiente para fazer este saque!");
        saldo -= valor;
    }
    
}
