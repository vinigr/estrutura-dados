package estacionamento;

public class Carro {
    private String placa;
    private int numeroVezes;
    
    public Carro(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroVezes() {
        return numeroVezes;
    }

    public void setNumeroVezes() {
        this.numeroVezes = ++numeroVezes;
    } 
}
