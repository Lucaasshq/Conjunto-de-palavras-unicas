import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavras(String palavra) {
        this.palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavraSet.isEmpty()) {
            if (palavraSet.contains(palavra)) {
                palavraSet.remove(palavra);
            } else {
                System.out.println("A palavra não contem nesse conjunto");
            }
        } else {
            System.out.println("O conjunto esta vázio");
        }
    }

    public String verificarPalavra(String palavra) {
        String palavraEncontrada = null;
        if (!palavraSet.isEmpty()) {
            for (String p : palavraSet) {
                if (p.equals(palavra)) {
                    palavraEncontrada = p;
                    break;
                } else {
                    palavraEncontrada = "A palavra que voce solicitou não esta presente no conjunto";
                }
            }
        }
        return palavraEncontrada;
    }

    public void exibirPalavras() {
        if (!palavraSet.isEmpty()) {
            System.out.println(palavraSet);
        } else {
            System.out.println("A lista esta vazia");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavraSet, that.palavraSet);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavraSet);
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavraSet=" + palavraSet +
                '}';
    }
}