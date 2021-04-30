
package Model;

public  class Pessoa {   
public  String nome,endereco,telefone;
private  String cpf;


public Pessoa(){
}

  public Pessoa(String nome,String endereco, String cpf,String telefone) { 
 
  this.nome = nome;
  this.cpf = cpf;
  this.endereco = endereco;
  this.telefone = telefone;
    }
  
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double tirarCopia(double copia){
      
         double x = 0.50;
         copia = x;
         System.out.println("Valor da cópia");
         return copia ;
     }
    
   
    
}



