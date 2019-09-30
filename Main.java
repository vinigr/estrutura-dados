package estacionamento;

public class Main {
    public static void main(String[] args) {
        Carro c;
        Pilha p = new Pilha();
        
        p.estacionar(new Carro("JOS"));
        p.estacionar(new Carro("BRASIL"));
        p.estacionar(new Carro("TESTE"));
        p.estacionar(new Carro("BRA"));
        p.retirarCarro("JOS");
        p.retirarCarro("BRASIL");
        p.retirarCarro("TESTE");
        p.retirarCarro("BRA");
    }
}
