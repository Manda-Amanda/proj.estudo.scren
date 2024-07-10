public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacao;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibirFichaTecnica(){
        System.out.println("Nome do Filme:" + nome);
        System.out.println("Ano de lancamento:" + anoDeLancamento);


    }

    void avalia(double nota){
        somaDasAvaliacao += nota;
        somaDasAvaliacao++;

    }

    double pegaMedia() {
        return somaDasAvaliacao/totalDeAvaliacao;

    }

}
