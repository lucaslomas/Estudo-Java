package entities;

public class PessoaFisica extends Imposto{

    private double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double taxa() {
        double taxaImposto = 0;
        if (getRendaAnual() < 20000.00 && gastoSaude > 0){
            taxaImposto = (getRendaAnual() * 0.15) - (gastoSaude * 0.5);
        } else if (getRendaAnual() < 20000.00 && gastoSaude == 0) {
            taxaImposto = (getRendaAnual() * 0.15);
        }else if (getRendaAnual() > 20000.00 && gastoSaude > 0){
            taxaImposto = (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
        } else if (getRendaAnual() < 20000.00 && gastoSaude == 0) {
            taxaImposto = (getRendaAnual() * 0.25);
        }
        return taxaImposto;
    }
}
