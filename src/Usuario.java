public class Usuario {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavras("Casa");
        conjunto.adicionarPalavras("Carro");
        conjunto.adicionarPalavras("Casa");
        conjunto.adicionarPalavras("Amarok");
        conjunto.adicionarPalavras("Supra mk5");
        conjunto.adicionarPalavras("emprego");

        conjunto.exibirPalavras();
        System.out.println(conjunto.verificarPalavra("faculdade"));
        conjunto.removerPalavra("Amarok");
        conjunto.exibirPalavras();
    }
}
