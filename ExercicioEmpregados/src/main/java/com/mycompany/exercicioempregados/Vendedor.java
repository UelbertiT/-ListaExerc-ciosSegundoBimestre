package com.mycompany.exercicioempregados;

public class Vendedor extends Empregado {
    private float comissao;

    public Vendedor(String nome, float salario, float comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float calcularSalario() {
        return salario + (salario * comissao / 100);
    }

    @Override
    public String toString() {
        return "Vendedor " +"nome = " + getNome() + " salario = " + salario +
                " salario com comissão = " + calcularSalario() +" comissao = " + comissao +'}';
    }
}
