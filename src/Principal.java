public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "A Viagem de Chihiro";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinutos = 180 ;


        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacao);
        System.out.println(meuFilme.totalDeAvaliacao);
        System.out.println(meuFilme.pegaMedia());



    }
}