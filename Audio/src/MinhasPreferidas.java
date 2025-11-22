public class MinhasPreferidas {

    public void incluir(Audio audio) {
        // Analisa a classificação para dar uma mensagem diferente
        if (audio.getClassificacao() >= 4.5) {
            System.out.println(audio.getTitulo() + " é um sucesso absoluto! Adicionado às suas preferidas.");
        } else {
            System.out.println(audio.getTitulo() + " adicionado, mas confira mais tarde se a classificação subiu.");
        }
        // Chamamos aqui o método que foi sobrescrito (Polimorfismo!)
        audio.exibirFichaTecnica();
    }
}