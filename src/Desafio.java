import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome= "jurineide";
        String conta= "corrente";
        int opcao = 0;
        double saldo= 2000;
        System.out.println("********************************************");
        System.out.println("\nNome do cliente"+ nome);
        System.out.println("Tipo de conta" + conta);
        System.out.println("Saldo atual"+ saldo);
        System.out.println("\n*********************************************");

        String menu = " ** Digite sua opção ** \n 1 - Consultar saldo \n 2 - Transferir valor\n 3 - Receber valor\n4 - Sair";

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao==1){
                System.out.println("o saldo é " + saldo);
            } else if (opcao==2) {
                System.out.println("qual o valor a ser transferido?");
                double valor= leitura.nextDouble();
                System.out.println("transferência realizada com sucesso");
                if (valor>saldo){
                    System.out.println("sem saldo ");
                }else {
                    saldo -= valor;
                }

            }else if (opcao==3){
                System.out.println("valor recebido:");
                double valor= leitura.nextDouble();
                System.out.println("valor recebido com sucesso");
                saldo+=valor;

            } else if (opcao!=4) {
                System.out.println("opção invalida");
                
            }


        }
    }
}
