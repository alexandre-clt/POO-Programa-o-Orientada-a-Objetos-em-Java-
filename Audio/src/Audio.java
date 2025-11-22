public class Audio {
    //Atributos Encapsulados (Private)
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducao;
    private int curtidas;
    private double classificacao;

    //Construtor Básico
    public   Audio(String titulo) {
        this.titulo = titulo;
    }

    // Metodo para simular uma curtida
    public void curtir() {
        this.curtidas++;
        System.out.println("Você curtiu o áudio: " + this.titulo);
    }

    public void reproduzir() {
        this.totalDeReproducao++;
        System.out.println("Você curtiu o áudio:" + this.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        if (duracaoEmMinutos > 0) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        } else {
            System.out.println("A duração deve ser maior que zero.");
        }
    }

    public void setClassificacao(double classificacao) {
        if ( classificacao > 0 && classificacao <= 5) {
            this.classificacao = classificacao;
        } else {
            System.out.println("A classificação deve estar entre 0 e 5.");
        }
    }

    public int exibirFichaTecnica() {
        System.out.println("--- FICHA TÉCNICA DO ÁUDIO ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração (min): " + getDuracaoEmMinutos());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Reproduções: " + getTotalDeReproducao());
        System.out.println("Classificação: " + getClassificacao() + " estrelas");
        return 0;
    }

}