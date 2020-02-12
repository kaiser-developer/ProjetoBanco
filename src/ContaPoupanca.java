public class ContaPoupanca extends Conta {
    private float jurosMensal;

    public ContaPoupanca(float jurosMensal, float saldo, String agencia, String numeroConta) {
        super(saldo, agencia, numeroConta);
        this.jurosMensal = jurosMensal;
    }

    public void recolherJuros(){
        float total = super.getSaldo() + (super.getSaldo() * (this.jurosMensal / 100));
        System.out.println("Seu saldo sem os juros era: R$" + super.getSaldo());
        super.setSaldo(total);
        System.out.println("Seu novo saldo com os juros é: R$" + super.getSaldo());
    }
}
