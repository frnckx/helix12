import java.sql.*;

public class Main {
    /**
     * There are 5 steps to connect any java application with the database in java using JDBC. They are as follows:
     * 1) Register the driver class
     * 2) Creating connection
     * 3) Creating statement
     * 4) Executing queries
     * 5) Closing connection
     */
    public static void main(String[] args) {
        // 1) Register the driver class
Connection connection = null;
        try{

        //    Class.forName ("org.postgresql.Driver");
            //2) Creating connection
         // connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/helix", "postgres", "postgres");
connection = DbUtil.getInstance().getConnection();
          // Creating statement

//Statement statement = connection.createStatement();

//PreparedStatement statement = connection.prepareStatement(SqlConstants.SELECT_ALL_FROM_ACTOR_WHERE_ID_BIGGER);
PreparedStatement statement = connection.prepareStatement(SqlConstants.SELECT_LAST_N_ACTOR);

            statement.setInt(1,3);
ResultSet rs = statement.executeQuery();
while (rs.next()) {
    int id = rs.getInt("actor_id");
    String firstName = rs.getString("first_name");
    String lastName = rs.getString("last_name");
    String lastUpdate = rs.getString("last_update");

    Actor actor = new Actor(rs.getInt("actor_id"),
            rs.getString("first_name"),
            rs.getString("last_name"),
            rs.getString("last_update"));
    System.out.println(actor.toString());

    //  System.out.println("id: "+ id +  ", first name: "+ firstName + ", last name: "+ lastName + ", last update: " + lastUpdate);
}
    Statement statement2 = connection.createStatement();

    ResultSet rs2 = statement2.executeQuery("SELECT * FROM country");

    while (rs2.next()){
        Country country = new Country(rs2.getInt("country_id"),
                rs2.getString("country"),
                rs2.getString("last_update"));
        System.out.println(country.toString());
    }



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
