
// import banco.Exemplo;
import banco.Conta;

public class App{

    public static void main(String[] args){
        Conta p0 = new Conta("João Vitor", 1000);
        Conta p1 = new Conta("Miguel", 1000);
        Conta p2 = new Conta("Jorel", 1000);

        p0.Deposito(500, 500);
        p1.Deposito(300, 1000);
        p2.Saque(500, 2000);
        p2.Deposito(300, 2000);
        p0.Saque(1500, 500);
        p0.Deposito(300, 500);
        p0.Saque(500, 500);
        p0.Deposito(300, 500);
        p0.Saque(500, 500);
        p2.Deposito(1300, 2000);
        p1.Saque(250, 1000);
        p0.Saque(500, 500);
        p1.Deposito(1300, 1000);
        p2.Saque(250, 2000);
        p0.Deposito(1300, 500);
        p0.Saque(250, 500);
        
    }
    
}
