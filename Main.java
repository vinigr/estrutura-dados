import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro c;
        Estacionamento e = new Estacionamento();
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("0 - Sair  \n"
                + "1 - Estacionar carro  \n"
                + "2 - Retirar carro do estacionamento  \n"
                + "3 - Ver todos carros estacionados \n"
                + "4 - Mostrar carro na saída");
        System.out.println("\n**************************** ESTACIONAMENTO *****************************");
        String valor;
        int opcao=1;
        while (opcao!=0){
            System.out.println("Digite sua opcao:");
            opcao=teclado.nextInt();
            teclado.nextLine();
            switch(opcao){
            case 1:
                System.out.println("Digite a placa do carro a ser estacionado: ");
                valor=teclado.nextLine();
                e.estacionar(new Carro(valor));
                break;
            case 2:
                System.out.println("Digite a placa do carro a ser retirado: ");
                valor=teclado.nextLine();
                e.retirarCarro(valor);
                break;
            case 3:
                // e.imprimir();
                break;
            case 4:
                e.imprimirTopo();
                break;
            }
        } 
            System.exit(0);
        }
}
