Implementação do sistema de gerenciamento bancário em Java

- Desenvolvida a classe `ContaBancaria` com os seguintes métodos:
  - `depositar(double valor)`: Permite realizar depósitos na conta.
  - `sacar(double valor)`: Realiza um saque, verificando se o saldo é suficiente.
  - `verificarSaldo()`: Retorna o saldo atual da conta.
  - `transferir(ContaBancaria contaDestino, double valor)`: Realiza a transferência de valores entre contas.

- Criada a classe `Banco` para gerenciar as contas bancárias:
  - `adicionarConta(ContaBancaria conta)`: Adiciona uma nova conta ao banco.
  - `buscarConta(int numeroConta)`: Permite buscar uma conta pelo número da conta.
  - `listarContas()`: Exibe uma lista com todas as contas cadastradas no banco.

- Implementação do método `main` com operações de teste:
  - Criação de contas bancárias.
  - Realização de depósitos, saques e transferências entre contas.
  - Impressão dos saldos das contas para verificar o funcionamento das operações.

Este commit representa a implementação inicial do sistema de contas bancárias, com foco em operações básicas como depósito, saque, transferência e verificação de saldo.

