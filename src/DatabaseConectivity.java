import java.sql.*;

public class DatabaseConectivity {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_database", "root", "");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users_se");
            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String gender = resultSet.getString("gender");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Gender: " + gender);
            }
            resultSet.close();
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
