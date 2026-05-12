public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = Guerreiro;
        this.nivel = 1;
        this.pontosDeVida = 100;
        this.poderBase = 10.0;

    }

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---" );
        System.out.println("--- Classe: ---" this.classe);
        System.out.println("--- Nivel: ---" this.nivel);
        System.out.println("--- pontosDeVida: ---") this.pontosDeVida;
        System.out.println("--- podeBase ---" this.poderBase);

    }
}

