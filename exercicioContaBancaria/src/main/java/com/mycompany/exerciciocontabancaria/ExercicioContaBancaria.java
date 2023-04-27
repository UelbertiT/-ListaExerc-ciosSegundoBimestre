package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author aluno
 */
public class ExercicioContaBancaria {
    
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Cliente 1", 123, 1000.0f);
        ContaPoupanca conta2 = new ContaPoupanca("Cliente 2", 456, 2000.0f, 15);
        ContaEspecial conta3 = new ContaEspecial("Cliente 3", 789, 3000.0f, 500.0f);

        conta1.sacar(500.0f);
        conta2.depositar(100.0f);
        conta3.sacar(3500.0f);
        conta2.calcularNovoSaldo(0.05f);

        System.out.println("Cliente: " + conta1.getCliente() + ", Conta Bancária: " + conta1.getNum_conta() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Cliente: " + conta2.getCliente() + ", Conta Poupança: " + conta2.getNum_conta() + ", Saldo: " + conta2.getSaldo());
        System.out.println("Cliente: " + conta3.getCliente() + ", Conta Especial: " + conta3.getNum_conta() + ", Saldo: " + conta3.getSaldo());
    }
}