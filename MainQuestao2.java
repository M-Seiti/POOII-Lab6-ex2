
public class MainQuestao2 {
    public static void main(String[] args) {
        Acao acao = new Acao("Empresa XYZ", 100.0f);
        AcaoBroker broker = new AcaoBroker();

        Investidor investidor1 = new Investidor("João", 90.0f, 110.0f, broker);
        Investidor investidor2 = new Investidor("Maria", 95.0f, 120.0f, broker);

        acao.adicionarObserver(investidor1);
        acao.adicionarObserver(investidor2);

        System.out.println("Alterando preço da ação para 105...");
        acao.setPreco(105.0f);

        System.out.println("Alterando preço da ação para 115...");
        acao.setPreco(115.0f);

        System.out.println("Alterando preço da ação para 85...");
        acao.setPreco(85.0f);
    }
}
