package Class;

import java.util.ArrayList;

public class Banco {

    private ArrayList<contaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(contaBancaria conta) {
        contas.add(conta);
    }

    public contaBancaria buscarConta(int numeroConta) {
        for (contaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        for (contaBancaria conta : contas) {
            System.out.println("Conta de " + conta.getTitular() + " - Número da Conta: " + conta.getNumeroConta());

        }
    }
}
