// Classe principal para testes
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345", "João Silva");
        ContaPoupanca cp = new ContaPoupanca("67890", "Maria Oliveira");

        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(cp, 300);

        System.out.println("Saldo Conta Corrente: R$" + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: R$" + cp.getSaldo());
    }
}