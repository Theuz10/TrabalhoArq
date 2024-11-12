abstract class Componente {
    public abstract String exibir();
}

class Arquivo extends Componente {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public String exibir() {
        return "Arquivo: " + nome;
    }
}

class Pasta extends Componente {
    private String nome;
    private List<Componente> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente item) {
        itens.add(item);
    }

    public String exibir() {
        StringBuilder sb = new StringBuilder("Pasta: " + nome + " com ");
        for (Componente item : itens) {
            sb.append(item.exibir()).append(", ");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Pasta pasta = new Pasta("Documentos");
        pasta.adicionar(new Arquivo("Documento1.txt"));
        System.out.println(pasta.exibir());
    }
}
