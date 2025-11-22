public class Principal {
    public static void main (String[] args) {
        // 1. Criando Objetos Musica
        Musica minhaMusica = new Musica("The Sound of Silence", "Disturbed");
        minhaMusica.setDuracaoEmMinutos(4);
        minhaMusica.setClassificacao(4.9);
        minhaMusica.setAlbum("VolumeI");
        minhaMusica.setGenero("Rock");

        // 2. Encapsulamento em Ação:
        // Acesso indireto através dos métodos curtir/reproduzir, não diretamente na variável.
        for (int i = 0; i < 2000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        // 3. Criando Objetos Podcast
        Podcast meuPodcast = new Podcast("Devs Na Estrada", "Marcos Mendes");
        meuPodcast.setDuracaoEmMinutos(60);
        meuPodcast.setClassificacao(4.2);
        meuPodcast.setDescricao("A vida do Dev e suas dificuldades");
        meuPodcast.setTemporada(1);

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }


        // 4. Polimorfismo e Classe de Controle
        MinhasPreferidas favoritas = new MinhasPreferidas();

        // A classe 'favoritas' trata ambos os objetos de forma genérica (Audio)
        favoritas.incluir(minhaMusica); // Chama o exibirFichaTecnica da Musica
        System.out.println("--------------------");
        favoritas.incluir(meuPodcast); // Chama o exibirFichaTecnica do Podcast
    }

}
