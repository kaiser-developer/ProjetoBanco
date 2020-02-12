public class Santander {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(111, "Joãozinho Silva", "523662355", "12345678912");
        Poupanca conta1 = new Poupanca(5, 200, "536", "737");
        Cliente cliente2 = new Cliente(222, "Mariazinha Souza", "4377322383", "98765432101");
        Corrente conta2 = new Corrente(2000, 3000, "543", "673");

        System.out.println(" ---- Conta do " + cliente1.getNomeCompleto() + " ----");
        cliente1.setConta(conta1);
        cliente1.getConta().recolherJuros();
        cliente1.getConta().depositar(2000);
        cliente1.getConta().consultarSaldo();

        System.out.println("\n ---- Conta da " + cliente2.getNomeCompleto() + " ----");
        cliente2.setConta(conta2);
        cliente2.getConta().sacar(3000);
        cliente2.getConta().depositar(2000);
        cliente2.getConta().sacar(2000);
        cliente2.getConta().consultarSaldo();
    }

}
