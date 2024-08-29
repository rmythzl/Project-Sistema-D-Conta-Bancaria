
    import java.util.Scanner;
    public class ContaTerminal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seja bem vindo(a) ao RMyth's Bank!");
            System.out.println("para podermos começar, informe aqui o seu nome e sobrenome: ");
            String nome = scanner.nextLine();
            
            System.out.println("Olá " + nome + "!");
            System.out.println("Vamos começar criando a sua conta bancária!");
            System.out.println("Qual o tipo da sua conta ? (CC = Conta Corrente, CP = Conta Poupança)");
            String tipoConta = scanner.nextLine();
            
            System.out.println("Agora " + nome + ", informe o seu saldo atual: ");
            double saldo = scanner.nextDouble();
            
            System.out.println("Conta criada com sucesso!");
            
            System.out.println("********************************************************");
            System.out.println();
            System.out.println("Nome: " + nome);
            System.out.println("Tipo da conta: " + tipoConta);
            System.out.println("Saldo: " + saldo);
            System.out.println();
            System.out.println("********************************************************");
            
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("O que deseja fazer agora?");
                System.out.println("""
                        1 - Depositar
                        2 - Sacar
                        3 - Transferir
                        4 - Encerrar
                        """);
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                case 1:
                    System.out.println("Informe o valor que deseja depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble(); 
                    if(valorSaque > saldo){
                        System.out.println("Operação não realizada pois seu saldo é menor que o valor que deseja sacar!!");
                        System.out.println("Por gentileza, repita a operação.");
                    }  else {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo atual: " + saldo); 
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    if(valorTransferencia > saldo){
                        System.out.println("Operação não realizada pois seu saldo é menor que o valor que deseja trasferir!!");
                        System.out.println("Por gentileza, repita a operação.");
                    }  else {
                    saldo -= valorTransferencia;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o Rmyth's Bank!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                }
            }
            scanner.close();
        }
    }
    


