package com.mycompany.ExercicioIngresso;

/**
 *
 * @author aluno
 */
public class ExercicioIngresso {
    
    public static void main (String [] args){
        
        Ingresso i = new Ingresso(100);
        System.out.println(i);
        
        IngressoVIP a = new IngressoVIP(100,20);
        System.out.println(a);
                
    }
}
