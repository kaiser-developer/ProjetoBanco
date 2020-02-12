public class Cliente {
    private int id;
    private String nomeCompleto;
    private String rg;
    private String cpf;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(int id, String nomeCompleto, String rg, String cpf) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente conta) {
        this.contaCorrente = conta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Conta getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
