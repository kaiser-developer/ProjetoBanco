public class Conta {
    private float saldo;
    private String agencia;
    private String numeroConta;

    public Conta(float saldo, String agencia, String numeroConta) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void sacar(float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Seu novo saldo é: R$ " + this.saldo);
        }else{
            System.out.println("Não é possivel realizar o saque, pois o valor excede seu saldo.\nSeu saldo é: R$ " + this.saldo);
        }
    }

    public void depositar(float valor) {
        System.out.println("Seu saldo antes do deposito era: R$ " + this.saldo);
        this.saldo += valor;
        System.out.println("Seu novo saldo é: R$ " + this.saldo);
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é: R$ " + this.saldo);
    }
}
