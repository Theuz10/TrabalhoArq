class Produto {
    private String componentes = "";

    public void adicionarComponente(String componente) {
        componentes += componente + ", ";
    }

    public String mostrar() {
        return componentes;
    }
}

class NotebookBuilder {
    private Produto produto = new Produto();

    public NotebookBuilder adicionarProcessador(String tipo) {
        produto.adicionarComponente("Processador: " + tipo);
        return this;
    }

    public Produto construir() {
        return produto;
    }
}

public class Main {
    public static void main(String[] args) {
        NotebookBuilder builder = new NotebookBuilder();
        Produto notebook = builder.adicionarProcessador("Intel i7").construir();
        System.out.println(notebook.mostrar());
    }
}
