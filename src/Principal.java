import br.com.a.screnmatch.modelos.Filme;
import br.com.a.screnmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("A Viagem de Chihiro");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração  do  filme:" +meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
       // System.out.println("Pega media" + meuFilme.getpegaMedia());
       // meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar : " + lost.getDuracaoEmMinutos());
    }
}


