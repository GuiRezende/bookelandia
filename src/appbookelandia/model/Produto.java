package appbookelandia.model;

public class Produto {
    private int codigo;
    private CategoriaDoProduto categoria;
    private String nome;
    private String descrica;
    private double preco;
    
    public Produto(){}
    
    //Para atualizar o produto
    public Produto(int codigo ){
        this.codigo = codigo;
    }
    
    //Para cadastrar um novo produto
    public Produto(int codigo, String  nome){
    this.codigo = codigo;
    this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the categoria
     */
    public CategoriaDoProduto getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(CategoriaDoProduto categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descrica
     */
    public String getDescrica() {
        return descrica;
    }

    /**
     * @param descrica the descrica to set
     */
    public void setDescrica(String descrica) {
        this.descrica = descrica;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}