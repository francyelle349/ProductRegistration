package revisaosobrecarga;

 public class DadosDosProdutos{
    private int Id;
  
    private String nome;
    private double preco;
    private int quantidade;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public DadosDosProdutos(int id, String nome, double preco, int quantidade){
        this.Id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public DadosDosProdutos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }
    public DadosDosProdutos(int id, String nome){
        this.Id = id;
        this.nome = nome;
    }
    public DadosDosProdutos(int id, double preco){
        this.Id = id;
        this.preco = preco;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public String toString(){
        return "id: "+getId()+", nome: " + getNome()+
        ", preço:"+getPreco()+
        ", Quantidade: "+getQuantidade();
    }

 }
