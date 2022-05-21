package dio.com.desafio.banco.contas;

import dio.com.desafio.banco.Banco;
import dio.com.desafio.banco.clientes.Cliente;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 001;
    private long agencia;
    private long numero;
    protected BigDecimal saldo;// para calculo de prescisão

    private String timeStamp;

    private Cliente cliente;
    private Banco banco;

    public Conta(Cliente cliente) {

        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = BigDecimal.ZERO;
        this.timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        if (cliente != null){
            this.cliente = cliente;

        }
    }

    @Override
    public  abstract void sacar(BigDecimal saque);




    @Override
    public void depositar(BigDecimal valor) {
        BigDecimal somaTotal = getSaldo().add(valor);
        setSaldo(somaTotal);

        System.out.println("Deposito realizado" +  getTimeStamp());

    }

    @Override
    public void transferir(BigDecimal valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Tranfererencia as "+ getTimeStamp());

    }


    public long getAgencia() {
        return agencia;
    }

    public long getNumero() {
        return numero;
    }

    protected BigDecimal getSaldo() {
        return saldo;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    protected void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean eIgualCliente(Cliente cliente) {
        if(cliente == null) {
            return false;
        }
        boolean nomesIguais = Objects.equals(cliente.getNome(), this.cliente.getNome());
        boolean datasIguais = Objects.equals(cliente.getDataNascimento(), this.cliente.getDataNascimento());
        return nomesIguais && datasIguais;
    } //ok!

    protected void imprimirInfoComuns() {
        System.out.println(String.format("\n"));
        System.out.println(String.format("Cliente: Nome %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("\n"));

    }


}
