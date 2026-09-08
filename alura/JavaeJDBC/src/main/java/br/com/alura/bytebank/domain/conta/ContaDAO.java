package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.domain.cliente.Cliente;
import br.com.alura.bytebank.domain.cliente.DadosCadastroCliente;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ContaDAO {

    private Connection conn;

    ContaDAO(Connection connection) {
        this.conn = connection;
    }

    public void salvar(DadosAberturaConta dadosDaConta) {
        var cliente = new Cliente(dadosDaConta.dadosCliente());
        var conta = new Conta(dadosDaConta.numero(), BigDecimal.ZERO, cliente);

        String sql = "INSERT INTO conta (numero, saldo, cliente_nome, cliente_cpf, cliente_email)" +
                "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, conta.getNumero());
            preparedStatement.setBigDecimal(2, BigDecimal.ZERO);
            preparedStatement.setString(3, dadosDaConta.dadosCliente().nome());
            preparedStatement.setString(4, dadosDaConta.dadosCliente().cpf());
            preparedStatement.setString(5, dadosDaConta.dadosCliente().email());

            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Conta> listar() {
        Set<Conta> contas = new HashSet<>();

        String sql = "SELECT * FROM conta";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Integer numero = resultSet.getInt(1);
                BigDecimal saldo = resultSet.getBigDecimal(2);
                String nome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String email = resultSet.getString(5);

                DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
                Cliente cliente = new Cliente(dadosCadastroCliente);

                contas.add(new Conta(numero, saldo ,cliente));
            }

            resultSet.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return contas;
    }

    public Conta consultarNumero(Integer numero){
        Conta conta = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        String sql = "SELECT * FROM conta WHERE numero = ?";

        try{
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, numero);
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                numero = resultSet.getInt(1);
                BigDecimal saldo = resultSet.getBigDecimal(2);
                String nome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String email = resultSet.getString(5);

                DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
                Cliente cliente = new Cliente(dadosCadastroCliente);

                conta = new Conta(numero, saldo ,cliente);
            }

            resultSet.close();
            preparedStatement.close();
            conn.close();

        } catch(SQLException e){
            throw new RuntimeException(e);
        }

        return conta;
    }

    public BigDecimal consultarSaldo(Integer numero) {
        String sql = "SELECT saldo FROM conta WHERE numero = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, numero);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                System.out.println("conta encontrada");
                BigDecimal saldo = resultSet.getBigDecimal(1);

                resultSet.close();
                preparedStatement.close();
                conn.close();

                return saldo;
            } else {
                System.out.println("Conta nao encontrada!");
            }
            resultSet.close();
            preparedStatement.close();
            conn.close();

            return null;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar (Integer numero, BigDecimal valor) {
        PreparedStatement preparedStatement;
        String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";

        try {
            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setBigDecimal(1, valor);
            preparedStatement.setInt(2, numero);

            preparedStatement.execute();

            preparedStatement.close();
            conn.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
