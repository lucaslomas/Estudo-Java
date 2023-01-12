package entities;

public class PessoaJuridica extends Imposto {
    private int numeroFuncionarios;

    public PessoaJuridica() {}

    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double taxa() {
        double taxaImposto = 0;
        if (numeroFuncionarios > 10){
            taxaImposto = (getRendaAnual() * 0.14);
        } else if (numeroFuncionarios < 10) {
            taxaImposto = (getRendaAnual() * 0.16);
        }
        return taxaImposto;
    }
}
