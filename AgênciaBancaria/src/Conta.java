public class Conta {
    private static int contadorDeContas=1;
    private int numeroConta;
    private Pessoa pessoa;
    private double saldo=0;
    
public Conta (Pessoa pessoa){
    this.numeroConta = contadorDeContas;
    this.pessoa = pessoa;
    contadorDeContas =+ 1;
}
    
    public Pessoa getPessoa() {
        return pessoa;
    }

   
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

   
    public double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


  
    public int getNumeroConta() {
        return numeroConta;
    }

 
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String toString(){
        return "\n Numero da conta : " + this.getNumeroConta() +
               "\n Nome : " + this.pessoa.getNome() +
               "\n RG : " + this.pessoa.getRg() +
               "\n Email : " + this.pessoa.getEmail() +
               "\n Saldo : " + Ultilizar.doubletoString(this.getSaldo()) + "\n";
            }

    public void depositar(double valor){
        if (valor >0){
            setSaldo(getSaldo()+ valor );
            System.out.println("Depósito foi realizado com sucesso !");

        }else{
            System.out.println("Não foi possivel realizar seu depósito !");
        }
    }
    public void sacar (double valor){
        if(valor>0 && this.getSaldo()>=valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque foi realizado com sucesso !");
        }else{
            System.out.println("Não foi possivel realizar seu depósito !");
        }
    }
    public void transferir(Conta contaParaDeposito, Double valor){
        if(valor>0 && this.getSaldo()<=valor){
            setSaldo(getSaldo()-valor);

            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Trasferência realizada com sucesso! ");
        }else{
            System.out.println("Não foi possivel realizar sua Trasferência !");

        }
    }
}