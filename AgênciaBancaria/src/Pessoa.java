public class Pessoa{
    
    private static int  contador = 1;
    private String nome; 
    private String rg;
    private String email;

    
     public Pessoa(String nome, String rg, String email ){
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        contador +=1;

     }
    
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getRg() {
        return rg;
    }

    
    public void setRg(String rg) {
        this.rg = rg;
    }

  
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "\n Nome: " + this.getNome() +
               "\n RG : " + this.getRg() + 
               "\n Email : " + this.getEmail();
            }

}
