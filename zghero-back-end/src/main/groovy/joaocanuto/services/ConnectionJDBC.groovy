package joaocanuto.services

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class ConnectionJDBC {
    public static Connection getConnectionBD(){
        try {
            Class.forName("org.postgresql.Driver")
            String DATABASE_URL = "jdbc:postgresql://localhost:5432/db_linketinder"
            String usuario = "postgres"
            String senha = "postgres"
            return DriverManager.getConnection(DATABASE_URL,usuario, senha)
        } catch (ClassNotFoundException | SQLException ex){
            println ("Erro na conexão com o BD")
        }
    }
}
