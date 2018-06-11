package br.ufg.inf.integracao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Resposta5 {

    public static void main(String[] args) {
    }

    public static void post(){
        final String var1 = "";
        final String var2 = "";
        try{
            Connection conn = getConnection();
            PreparedStatement posted = conn.prepareStatement("INSERT INTO ");
            posted.executeUpdate();
        }catch (Exception e){
            System.out.println("Não foi possível inserir os dados no banco de dados");
        }
    }
    public static Connection getConnection(){

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "admin";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão iniciada");
            return conn;
        }catch (Exception e){
            System.out.println("Conexão não realizada. Verifique as configurações do banco de dados");
        }
        return null;
    }
}
