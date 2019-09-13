package it.cybsec;

import java.sql.*;

public class ExampleApplication {

    static Connection connect = null;
    static Statement statement = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    static ResultSet preparedResultSet = null;
    
    static void printPersoneResultSet(ResultSet rs) throws SQLException {
        while(rs.next()) {
       	   System.out.println("Id: " + rs.getInt(1));
      	   System.out.println("Nome: " + rs.getString(2));
      	   System.out.println("Cognome:" + rs.getString(3));
      	   System.out.println("Età:" + rs.getInt(4));
      	   System.out.println("-----------------------------------------------");
	        }
    }
    
	public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:9306/esempio?user=user&password=esempio&serverTimezone=UTC");

            statement = connect.createStatement();
            preparedStatement = connect.prepareStatement("SELECT * FROM persone WHERE nome = ? AND cognome LIKE ?");
            
            resultSet = statement.executeQuery("SELECT * FROM persone");
            
            printPersoneResultSet(resultSet);
            
            preparedStatement.setString(1, "Mirko");
            preparedStatement.setString(2, "Abbrescia");
            preparedResultSet = preparedStatement.executeQuery();
            
            printPersoneResultSet(preparedResultSet);
            
            preparedStatement.setString(1, "Mirko");
            preparedStatement.setString(2, "%");
            preparedResultSet = preparedStatement.executeQuery();

            printPersoneResultSet(preparedResultSet);
           
        } catch (Exception e) {
            e.printStackTrace();;
        }
	}

}
