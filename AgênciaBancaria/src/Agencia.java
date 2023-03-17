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
       
        
    }
    
}
