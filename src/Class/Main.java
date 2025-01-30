package Class;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();

        contaBancaria conta1 = new contaBancaria("Cleitinho", 431412);
        contaBancaria conta2 = new contaBancaria("Marlindo", 67890);
        contaBancaria conta3 = new contaBancaria("Xenosvaldo", 21234);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        conta1.depositar(1000);
        conta2.depositar(500);
        conta3.depositar(300);

        conta1.sacar(200);
        conta2.sacar(100);

        conta1.transferir(conta2, 150);
        conta2.transferir(conta3, 50);

        banco.listarContas();

        System.out.println("Saldo de João: " + conta1.verificarSaldo());
        System.out.println("Saldo de Maria: " + conta2.verificarSaldo());
        System.out.println("Saldo de Pedro: " + conta3.verificarSaldo());
    }
}
