public class Cliente {
    private int id;
    private String nomeCompleto;
    private String rg;
    private String cpf;
    private Conta conta;

    public Cliente(int id, String nomeCompleto, String rg, String cpf) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
