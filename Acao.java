
public class Acao extends Subject {
    private String nome;
    private float preco;

    public Acao(String nome, float precoInicial) {
        this.nome = nome;
        this.preco = precoInicial;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float novoPreco) {
        this.preco = novoPreco;
        notificarObservers(novoPreco);
    }
}
