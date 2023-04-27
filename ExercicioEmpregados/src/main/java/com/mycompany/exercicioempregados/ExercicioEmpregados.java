/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioempregados;

/**
 *
 * @author aluno
 */
public class ExercicioEmpregados {

    public static void main(String[] args) {
     Empregado i = new Empregado("uelberti", 2000);
        System.out.println(i);
        
     Gerente e = new Gerente("vinicius", 3000,"analista");
        System.out.println(e);
        
     Vendedor a = new Vendedor("lucas", 1500,10 );
        System.out.println(a);
    }
}
