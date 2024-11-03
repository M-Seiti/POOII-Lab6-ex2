
public class Investidor implements Observer {
    private String nome;
    private float limiteMinimo;
    private float limiteMaximo;
    private AcaoBroker broker;

    public Investidor(String nome, float limiteMinimo, float limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void atualizar(float preco) {
        if (preco >= limiteMaximo) {
            System.out.println("Investidor " + nome + ": Preço atingiu o limite máximo. Vendendo ação.");
            broker.venderAcao();
        } else if (preco <= limiteMinimo) {
            System.out.println("Investidor " + nome + ": Preço atingiu o limite mínimo. Comprando ação.");
            broker.comprarAcao();
        }
    }
}
