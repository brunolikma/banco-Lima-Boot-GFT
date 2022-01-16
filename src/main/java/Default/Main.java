package Default;

public class Main {
    public static void main(String[] args){
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");

        Conta cc = new ContaCorrente(bruno);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(bruno);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
