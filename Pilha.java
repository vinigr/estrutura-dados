package estacionamento;

import java.util.Stack;

public class Pilha {
    private Stack pilha1 = new Stack();
    private Stack pilha2 = new Stack();

    public void estacionar(Carro entrada) {
        if(pilha1.size() < 10) {
            pilha1.push(entrada);            
        } else {
            System.out.println("Estacionameto cheio!");
        }
    }
    
    public void retirarCarro(String placa) {    
        Carro carroTemp = null;
        if(this.search(placa)) {
            while(!pilha1.isEmpty()) {
            carroTemp = (Carro) pilha1.pop();

                if(carroTemp.getPlaca().equals(placa)) {     
                    System.out.println("Placa: "+ carroTemp.getPlaca() + 
                            "\n" + "Vezes que foi movimentado: " 
                            + carroTemp.getNumeroVezes());
                    while(!pilha2.isEmpty()) {
                        pilha1.push(pilha2.pop());
                    }
                    return;
                } else {
                    carroTemp.setNumeroVezes();
                    pilha2.push(carroTemp);
                } 
            }
          
        } else {
            System.out.println("Seu carro não foi estacionado aqui!");
        }
    }
    
    public boolean search(String placa){
        Carro carroTemp = null;
        boolean existe = false;
        
        while(!pilha1.isEmpty()) {
            carroTemp = (Carro) pilha1.pop();
            if(carroTemp.getPlaca().equals(placa)) {     
               existe = true;
            }
            pilha2.push(carroTemp);
        }
                     
        while(!pilha2.isEmpty()) {
            pilha1.push(pilha2.pop());
        }

        return existe;
    }
}
