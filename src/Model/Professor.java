
package Model;

public class Professor extends Pessoa{
    
public static double SALARIOBRUTOPROF = 3.000;
public static double INSS = 0.12;
public static double IR = 0.15;


public double salario;
public String curso;


public Professor(){
        super();
               
    }

public Professor (String nome, String endereco,String cpf, String telefone,double salario, String curso ){
    
        super(nome, endereco, cpf, telefone);
        
        this.salario = salario;
        this.curso =  curso;
                           
}

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

     public  static double calcSalario ( double salario){
     double desconto; double desconto2;
     desconto  =   SALARIOBRUTOPROF  *    INSS ;
     salario   =   SALARIOBRUTOPROF  -   desconto;
     desconto2 =   SALARIOBRUTOPROF  *    IR ;
     salario   =   SALARIOBRUTOPROF  -   desconto;
     salario   =   SALARIOBRUTOPROF - desconto - desconto2;
     
     System.out.println("Salario do Professor com os desconto fica em RS\n"+salario);
       
        return salario;  
        
     }
         
    @Override
    public double tirarCopia(double copia){
      
         
         double x = 0.05;
         copia = x;
      
         System.out.format("Valor da cópia para Professor\n%.2f\n",copia);

         return copia ;
    }  
    
    
    
    public String Curso (String curso){
    return curso;
    
    }
    
    
    
     public void DadosProf(){
          
       System.out.println("\nNome do Aluno:\n"+this.nome+"\nEndereco:"+this.endereco+"\nCPF:\n"+this.getCpf()+"\nTelefone:\n"+this.telefone+"\nCurso:"+this.curso);
 
  }
}



