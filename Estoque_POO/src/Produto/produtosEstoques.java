package Produto;


public class produtosEstoques {
    private String nomeProduto;
    private int quantidadeProduto;
    private double precoProduto;
//Abaixo temos o nosso construtor, ele obriga ao programador a definir os dados de um objeto no momento da construção.
    public produtosEstoques(String nomeProduto, int quantidadeProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
    }
    //Abaixo teremos os metodos acessores e modificadores dos atributos

    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public double getPrecoProduto(){
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }
    //A quantidade não terá nenhum set, apenas um get, pois o set ele modifica um atributo e a quantidade será
    //modificada apenas na adição ou remoção do produto.Logo, usaremos apenas o metodo get.

    public int getQuantidadeProduto(int quantidadeProduto){
        return quantidadeProduto;
    }

    public double valorInEstoque() {

       return quantidadeProduto * precoProduto;

    }
    public void addProduct(int quantidadeProduto){
        this.quantidadeProduto += quantidadeProduto;
    }
    public void removeProduct(int quantidadeProduto){
        this.quantidadeProduto -= quantidadeProduto;
    }

    public String toString(){
        return nomeProduto + ", Preço: " + String.format("%.2f", precoProduto) +"R$" +
                ", Quantidade em estoque: " + quantidadeProduto
                + ", Preço no estoque: " + String.format("%.2f",valorInEstoque()) +"R$";
    }

}
