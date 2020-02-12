import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {
    private float chequeEspecial;
    private ArrayList<Cheque> cheques = new ArrayList();

    public ContaCorrente(float chequeEspecial, float saldo, String agencia, String numeroConta) {
        super(saldo, agencia, numeroConta);
        this.chequeEspecial = chequeEspecial;
    }

    public ArrayList<Cheque> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Cheque> cheques) {
        this.cheques = cheques;
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

    public void inserirCheque(Cheque cheque) {
        this.cheques.add(cheque);
        this.depositar(cheque.getValor());
    }
}
