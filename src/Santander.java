import java.util.ArrayList;
import java.util.List;

public class Santander {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(111, "Joãozinho Silva", "523662355", "12345678912");
        Conta conta1 = new ContaPoupanca(5, 200, "536", "737");
        Cliente cliente2 = new Cliente(222, "Mariazinha Souza", "4377322383", "98765432101");
        Conta conta2 = new ContaCorrente(2000, 3000, "543", "673");

        Cheque cheque1 = new Cheque(200, "Santander", "20/01/2020");

        System.out.println(" ---- Conta do " + cliente1.getNomeCompleto() + " ----");
        cliente1.setContaPoupanca(conta1);
        cliente1.getContaPoupanca().depositar(2000);
        cliente1.getContaPoupanca().sacar(5000);
        cliente1.getContaPoupanca().consultarSaldo();
        ((ContaPoupanca) cliente1.getContaPoupanca()).recolherJuros();

        System.out.println("\n ---- Conta da " + cliente2.getNomeCompleto() + " ----");
        cliente2.setContaCorrente(conta2);
        cliente2.getContaCorrente().sacar(2600);
        cliente2.getContaCorrente().depositar(1600);
        cliente2.getContaCorrente().sacar(3000);
        cliente2.getContaCorrente().consultarSaldo();
        ((ContaCorrente) cliente2.getContaCorrente()).inserirCheque(cheque1);

        ArrayList<Cheque> cheques = new ArrayList();
        cheques = ((ContaCorrente) cliente2.getContaCorrente()).getCheques();
        System.out.println(cheques.get(0).getValor());
    }

}
