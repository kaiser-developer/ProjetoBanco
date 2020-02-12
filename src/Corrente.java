public class Corrente extends Conta {
    private float chequeEspecial;

    public Corrente(float chequeEspecial, float saldo, String agencia, String numeroConta) {
        super(saldo, agencia, numeroConta);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(float valor) {
        if((super.getSaldo() + this.chequeEspecial) >= valor){
            super.setSaldo(super.getSaldo() - valor); ;
            System.out.println("Seu novo saldo é: R$ " + getSaldo());
        }else{
            System.out.println("Não é possivel realizar o saque, pois o valor excede seu saldo e seu limite do cheque especial.\nSeu saldo é: R$ "
                    + super.getSaldo() + "\nSeu limite de cheque especial é: R$ " + this.chequeEspecial);
        }
    }
}
