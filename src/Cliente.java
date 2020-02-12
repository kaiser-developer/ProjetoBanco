public class Cliente {
    private int id;
    private String nomeCompleto;
    private String rg;
    private String cpf;
    private Conta contaCorrente;
    private Conta contaPoupanca;

    public Cliente(int id, String nomeCompleto, String rg, String cpf) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Conta conta) {
        this.contaCorrente = conta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Conta getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(Conta contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
