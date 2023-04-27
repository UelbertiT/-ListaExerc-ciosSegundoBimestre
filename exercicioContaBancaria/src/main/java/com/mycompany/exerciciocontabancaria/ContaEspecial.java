package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor > (saldo + limite)) {
            System.out.println("Saldo e limite insuficientes!");
        } else {
            saldo -= valor;
        }
    }
}
