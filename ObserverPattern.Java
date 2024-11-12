import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void atualizar(double preco) {
        System.out.println(nome + " foi notificado: Novo preço R$" + preco);
    }
}

class Produto {
    private String nome;
    private double preco;
    private List<Cliente> observadores = new ArrayList<>();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void adicionarObservador(Cliente cliente) {
        observadores.add(cliente);
    }

    public void alterarPreco(double novoPreco) {
        preco = novoPreco;
        for (Cliente cliente : observadores) {
            cliente.atualizar(preco);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Smartphone", 1500);
        Cliente cliente1 = new Cliente("João");
        produto.adicionarObservador(cliente1);
        produto.alterarPreco(1200);
    }
}
