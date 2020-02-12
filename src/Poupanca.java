public class Poupanca extends Conta {
    private float jurosMensal;

    public Poupanca(float jurosMensal, float saldo, String agencia, String numeroConta) {
        super(saldo, agencia, numeroConta);
        this.jurosMensal = jurosMensal;
    }

    public void recolherJuros(){
        float total;
        total = super.getSaldo() + (super.getSaldo() * (this.jurosMensal / 100));
        super.setSaldo(total);
        System.out.println("Seu novo saldo é: " + super.getSaldo());
    }
}
