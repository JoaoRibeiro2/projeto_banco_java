package banco;

public class Conta extends Thread{
    private String nome;
    private int conta;
    private int time;
    private int valorDeposito;
    private int valorSaque;

    public Conta(String nome, int valor){
        this.nome = nome;
        this.conta = valor;
        this.start();
    }

    public void run(){
        if(this.valorSaque <= this.conta){
            this.conta = this.conta - this.valorSaque;
            System.out.println("Conta: " + this.getNome());
            System.out.println("Valor na conta do(a) " + this.getNome() + ": " + this.conta);

        try{
            this.sleep(time);

        }

        catch(InterruptedException e){
            e.printStackTrace(); }
        }

        else{
            System.out.println("Valor do Saque Insuficiente na conta de " + this.getNome());
        }
    }

    public int Deposito(int valorDeposito, int time){
        this.valorDeposito = valorDeposito;
        this.conta = this.valorDeposito + this.conta;
        return this.conta;
    }

    public int Saque(int valorSaque, int time){
        this.valorSaque = valorSaque;
        return this.conta;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getValorConta(){
        return this.conta;
    }

    public void setValorConta(int valor){
        this.conta = valor;
    }

    public int getValorDeposito(){
        return this.valorDeposito;
    }

    public void setValorDeposito(int ValorDeposito){
        this.valorDeposito = ValorDeposito;
    }

    public int getValorSaque(){
        return this.valorSaque;
    }

    public void setValorSaque(int valorSaque){
        this.valorSaque = valorSaque;
    }

    public int getTime(){
        return this.time;
    }

    public void setTempo(int tempo){
        this.time = tempo;
    }
    
}