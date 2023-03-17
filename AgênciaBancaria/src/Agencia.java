import java.util.*;
import java.util.ArrayList;;
public class Agencia {
    static Scanner entrada = new Scanner (System.in);
    static ArrayList<Conta> contasDoBanco;

    public static void main(String[] args) {
        contasDoBanco =new ArrayList<Conta>();   
    menu();
    }

    public static void menu() {
        System.out.println("---------------------------------------------------------");
        System.out.println("-------------Bem vindos ao melhor web Banco--------------");
        System.out.println("-----------------Ecolha de nossa opçoes------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("||||||||| 1 --Cadastrar-se        |");
        System.out.println("||||||||| 2 --Depositar           |");
        System.out.println("||||||||| 3 --Sacar               |");
        System.out.println("||||||||| 4 --Transferir          |");
        System.out.println("||||||||| 5 --Listar              |");
        System.out.println("||||||||| 6 --Sair                |");

        int op =  entrada.nextInt();

        switch(op){

            case 1:
                cadastrar();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6 :
                System.out.println("Obrigado por usar nossa Agência ");
                System.exit(0);
            break;

            default :
            System.out.println("Algo deu errado!");
            menu();
            break;


        }
    }

    public static void cadastrar(){
        System.out.println("\nNome: ");
        String nome = entrada.nextLine();
        entrada.nextLine();
        System.out.println("\nRG: ");
        String rg = entrada.nextLine();

        System.out.println("\nEmail: ");
        String email = entrada.nextLine();

        Pessoa cliente = new Pessoa(nome, rg, email);

        Conta conta = new Conta(cliente);

        contasDoBanco.add(conta);

        System.out.println("Sua conta foi Criada!!\nSeja bem-vindo!!");

        menu();
    }

    private static Conta encontraConta(int numeroconta){
        Conta conta= null;
        if (contasDoBanco.size()>0){
            for(Conta c:contasDoBanco){
                if(c.getNumeroConta()== numeroconta);
                conta=c;
            }
        }
    return conta;
    }

    public static void depositar(){
        System.out.println("Digite o numero da conta: ");
        int numeroConta = entrada.nextInt();

        Conta conta = encontraConta(numeroConta);
        if (conta!=null){
            System.out.println("Qual valor deseja Depositar ?");
            Double valordeposito = entrada.nextDouble();
            conta.depositar(valordeposito);
            System.out.println("Valor depositado com sucesso!!!");

        }else{
            System.out.println(" Conta não encontrada!!");
        }
    menu();
    }
    public static void sacar(){

        System.out.println("Digite o número da conta: ");
        int numeroConta = entrada.nextInt();

        Conta conta = encontraConta(numeroConta);
        if (conta!=null){
            System.out.println("Qual valor do saque ?");
            Double valorsaque = entrada.nextDouble();
            conta.depositar(valorsaque);
          

        }else{
            System.out.println(" Conta não encontrada!!");
        }
    menu();
    }
    public static void transferir(){
        System.out.println("Dê qual conta quer transferir: ");
        int numeroContaRem = entrada.nextInt();

        Conta contaRE = encontraConta(numeroContaRem);

        if (contaRE!=null){
            System.out.println("Número da conta de quem vai receber: ");
                int  numeroDestino = entrada.nextInt();
            Conta contadestino = encontraConta(numeroDestino);

            if(contadestino != null){
                System.out.println("Valor da Transferência: ");
                Double valortransfere = entrada.nextDouble();

                contaRE.transferir(contadestino, valortransfere);
            }else{
                System.out.println("A conta para depósito não foi encontrada ");
            }

         }else{
            System.out.println("Conta para Transferêcia não encontrada!");
         }
         menu();
    }
    public static void listar (){
        if(contasDoBanco.size()>0){
            for(Conta conta:contasDoBanco){
                System.out.println(conta);

            }
        }else{
            System.out.println("Não à contas cadastradas");
     
        }
        menu();
    }
}
