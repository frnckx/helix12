import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
Connection connection = null;
        try{

            Class.forName ("org.postgresql.Driver");
          connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/helix", "postgres", "postgres");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
