
package view;

import Model.Pessoa;
import Model.Aluno;
import Model.Professor;

public class Inicio {

   public static void main(String[] args) {
  
       Aluno pi  = new Aluno("Eduardo", "Av Bento Gonçalves 3000", "5609633333", "3223-2333", 8, 9, 9);
       pi.DadosAluno();
       
       
        Aluno ppo = new Aluno();
        ppo.calcularMedia(0);
        
        Aluno pp = new Aluno();
         ppo.tirarCopia(0);
        
        Professor pf = new Professor ("Fernando", "Rua Thomas Flores 1230", "56965645", "6345-9696",0,"curso");
        pf.DadosProf();
         
        
        Professor p = new Professor();
        p.curso = "Curso Engenharia";
        System.out.println(p.toString());
        
        
        Professor pfr = new Professor();
        pfr.calcSalario(0);
          
        Professor ppp = new Professor();
        ppp.tirarCopia(0);
        
             
    }
}