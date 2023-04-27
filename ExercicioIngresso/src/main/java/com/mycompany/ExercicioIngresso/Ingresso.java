package com.mycompany.ExercicioIngresso;

/**
 *
 * @author aluno
 */
public class Ingresso {
       
     float valor;
     
     public Ingresso(float valor){
         this.valor = valor ;
        }

    @Override
     public String toString(){
         return "Valor do Ingresso "+ this.valor;
       
        
    }
}
