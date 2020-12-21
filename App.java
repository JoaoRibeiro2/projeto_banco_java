
// import banco.Exemplo;
import banco.Conta;

public class App{

    public static void main(String[] args){
        
        Conta Miguel = new Conta("Miguel",1000);
        Conta Jonas = new Conta("Jonas", 1000);
        Conta Jorel = new Conta("Jorel", 1000);
        System.out.println(Miguel.getNome());
        System.out.println(Miguel.getSaldo());
        Miguel.ExibirSaldo();

        Miguel.DepositarValor(500);
        Jonas.DepositarValor(300);
        Jorel.RetirarValor(500);
        Jorel.DepositarValor(300);
        Miguel.RetirarValor(1500);
        Miguel.DepositarValor(300);
        Miguel.RetirarValor(500);
        Miguel.DepositarValor(300);
        Miguel.RetirarValor(500);
        Jorel.DepositarValor(1300);
        Jonas.RetirarValor(250);
        Miguel.RetirarValor(500);
        Jonas.DepositarValor(1300);
        Jonas.RetirarValor(250);
        Miguel.RetirarValor(500);
        Jorel.DepositarValor(1300);
        Jorel.RetirarValor(250);
        Miguel.DepositarValor(1300);
        Miguel.RetirarValor(250);
    }
    
}
