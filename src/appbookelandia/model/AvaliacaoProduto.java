package appbookelandia.model;

public class AvaliacaoProduto {
    private Produto codigoDoProduto;
    private Cliente codigoDoCliente;
    private int nota;
    private String descricao;

    public AvaliacaoProduto() {
    }

    public AvaliacaoProduto(Produto codigoDoProduto, Cliente codigoDoCliente) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
    }

    public AvaliacaoProduto(Produto codigoDoProduto, Cliente codigoDoCliente, int nota) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
        this.nota = nota;
    }

    public AvaliacaoProduto(Produto codigoDoProduto, Cliente codigoDoCliente, int nota, String descricao) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
        this.nota = nota;
        this.descricao = descricao;
    }
    
    

    /**
     * @return the codigoDoProduto
     */
    public Produto getCodigoDoProduto() {
        return codigoDoProduto;
    }

    /**
     * @param codigoDoProduto the codigoDoProduto to set
     */
    public void setCodigoDoProduto(Produto codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    /**
     * @return the codigoDoCliente
     */
    public Cliente getCodigoDoCliente() {
        return codigoDoCliente;
    }

    /**
     * @param codigoDoCliente the codigoDoCliente to set
     */
    public void setCodigoDoCliente(Cliente codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
}
