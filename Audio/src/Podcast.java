public class Podcast extends Audio {
    private String host;
    private String descricao;
    private int temporada;

    public Podcast(String titulo, String host){
        super(titulo);
        this.host = host;
    }

    public void getHost(String host) {
        this.host = host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public int exibirFichaTecnica(){
        // Chamamos a ficha básica do pai (Audio)
        super.exibirFichaTecnica();
        // Adicionamos informações específicas de Música
        System.out.println("Host: " + getHost());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Temporada: " + getTemporada());

        if (this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }

    private String getHost() {
        return host;
    }


}
