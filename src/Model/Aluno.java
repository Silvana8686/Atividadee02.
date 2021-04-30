
package Model;

public  class Aluno extends Pessoa{
    
public double nota1;
public double nota2;
public double nota3;

public Aluno(){
        super();
               
    }

public Aluno (String nome, String endereco, String cpf, String telefone, double nota1,double nota2, double nota3){
    
       super(nome, endereco, cpf, telefone);
       this.nota1=nota1;
       this.nota1=nota2;
       this.nota1=nota3;
     
    }
     
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
 public double getNota2() {
        return nota3;
    }

    public void setNota2(double nota3) {
        this.nota3 = nota3;
    }
    
    public double getNota3() {
        return nota3;
    }


    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public  static double calcularMedia(double media){  
 
             media = (8+9+9)/3; 
            
        if(media>=7){
             System.out.println("Aluno Aprovado por média\n"+media);
          
          }else System.out.println("Aluno reprovado\n"+media);
            
          return  media;
    }  
  
    @Override
    
    public double tirarCopia(double copia){
      
      double x =  0.50;
      copia = x - 0.40;
      System.out.format("Valor da cópia Aluno %.2f\n",copia);

         return copia ;
     }
   
   public void DadosAluno(){
    

          
      System.out.println("\nNome do Aluno:\n"+this.nome+"\nEndereco:"+this.endereco+"\nCPF:\n"+this.getCpf()+"\nTelefone:\n"+this.telefone);
         
    }   
}
